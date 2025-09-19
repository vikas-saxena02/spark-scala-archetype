# spark-scala-archetype
Spark Archetype in Scala by RAICS.AI

## Requirements
- **JDK**: JDK-17 or above
- **Apache Maven**: version 3.9.11 or above

## Generating a Sample Project
### For Scala 2.12
```bash
 mvn -q archetype:generate \
  -DarchetypeGroupId=ai.raics \
  -DarchetypeArtifactId=spark-scala-archetype_2.12 \
  -DarchetypeVersion=3.5.5_1.0.0 
```

### For Scala 2.13
```bash
 mvn -q archetype:generate \
  -DarchetypeGroupId=ai.raics \
  -DarchetypeArtifactId=spark-scala-archetype_2.13 \
  -DarchetypeVersion=3.5.5_1.0.0 
```

## Details for project Generated

- **Scala**: 2.12.18  
- **Spark**: 3.5.5  
- **Tests**: ScalaTest

> Requires **Java 17+**. Ensure `JAVA_HOME` points to a JDK 17.
