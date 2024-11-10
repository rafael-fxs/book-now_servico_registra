FROM openjdk:17-jdk-alpine
MAINTAINER registra-service
COPY target/registra-0.0.1-SNAPSHOT.jar registra-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/registra-0.0.1-SNAPSHOT.jar"]
