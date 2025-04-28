FROM openjdk:17-jdk-slim

COPY target/Student-0.0.1-SNAPSHOT.jar Student.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","Student.jar"]