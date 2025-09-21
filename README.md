# spark-scala-archetype
Spark Archetype in Scala by RAICS.AI

## Requirements
- **JDK**: JDK-17 or above
- **Apache Maven**: version 3.9.11 or above

## Generating a Sample Project
### For Scala 2.12
> [!CAUTION]
> This Module is in maintainence mode only

```bash
 mvn -q archetype:generate \
  -DarchetypeGroupId=ai.raics \
  -DarchetypeArtifactId=spark-scala-archetype_2.12 \
  -DarchetypeVersion=3.5.6_1.0.0 
```
> Please note that the module `spark-scala-archetype_2.12` is only supported for spark 3.5.5 and 3.5.6. With Spark 4.0.0, Apache Spark will no longer have support for scala 2.12 and hence the module will be deprecated. It will no longer be Supported after Spark 3.5 series goes EOL.

### For Scala 2.13
```bash
 mvn -q archetype:generate \
  -DarchetypeGroupId=ai.raics \
  -DarchetypeArtifactId=spark-scala-archetype_2.13 \
  -DarchetypeVersion=4.0.0_1.0.0 
```
