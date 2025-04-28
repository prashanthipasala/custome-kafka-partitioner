FROM openjdk:17
WORKDIR /kafka
COPY target/custome-kafka-partitioner-0.0.1-SNAPSHOT.jar /kafka/custome-kafka-partitioner-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "kafka_demo-0.0.1-SNAPSHOT.jar"]
