package ${package}

import org.apache.spark.sql.SparkSession

object SparkPi {

  def computePi(spark: SparkSession,
                samples: Long = 1000000L,
                partitions: Int = math.max(2, spark.sparkContext.defaultParallelism),
                seed: Long = 1L): Double = {
    val sc = spark.sparkContext

    val base = 0 until partitions
    val perPart: Long = samples / partitions
    val remainder: Int = (samples % partitions).toInt

    val insideCount = sc
      .parallelize(base, partitions)
      .mapPartitionsWithIndex { case (idx, _) =>
        val n = perPart + (if (idx < remainder) 1 else 0)
        val rng = new java.util.Random(seed + idx)
        var i   = 0L
        var in  = 0L
        while (i < n) {
          val x = rng.nextDouble() * 2 - 1
          val y = rng.nextDouble() * 2 - 1
          if (x * x + y * y <= 1.0) in += 1
          i += 1
        }
        Iterator.single(in)
      }
      .sum()

    4.0 * insideCount.toDouble / samples.toDouble
  }

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("SparkPi")
      .getOrCreate()

    val samples    = if (args.length > 0) args(0).toLong else 1000000L
    val partitions = if (args.length > 1) args(1).toInt  else math.max(2, spark.sparkContext.defaultParallelism)
    val seed       = if (args.length > 2) args(2).toLong else 1L

    val pi = computePi(spark, samples, partitions, seed)
    println(f"Pi is roughly $pi%.6f")

    spark.stop()
  }
}
