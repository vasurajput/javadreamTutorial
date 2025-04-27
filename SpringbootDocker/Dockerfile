FROM openjdk:17-jdk-slim

WORKDIR /javadream

COPY target/SpringbootDocker-0.0.1-SNAPSHOT.jar javadream.jar

ENTRYPOINT ["java", "-jar", "javadream.jar"]
