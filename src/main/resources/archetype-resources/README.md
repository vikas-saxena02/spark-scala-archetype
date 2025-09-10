# ${artifactId}

Spark (Scala) starter generated from **spark-scala-archetype**.

- **Scala**: 2.12.18  
- **Spark**: 3.5.5  
- **Tests**: ScalaTest

> Requires **Java 17+**. Ensure `JAVA_HOME` points to a JDK 17.

## Build & test

```bash
mvn -q clean test
```

## Run (via spark-submit)

```bash
spark-submit   --class ${package}.SparkPi   --master local[2]   target/${artifactId}-${version}.jar 200000 4 7
```

> Spark dependencies are marked `provided`, as is typical for `spark-submit`.
