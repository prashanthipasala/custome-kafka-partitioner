FROM openjdk:17
WORKDIR /kafka
COPY target/kafka_demo-0.0.1-SNAPSHOT.jar /kafka/kafka_demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "kafka_demo-0.0.1-SNAPSHOT.jar"]
