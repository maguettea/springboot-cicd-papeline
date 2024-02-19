FROM openjdk:17-jdk-slim

LABEL maintainer="Maguette kane maaguettekanea@gmail.com"

EXPOSE 8080

ADD target/samanespring-cicd.jar samanespring-cicd.jar

ENTRYPOINT ["java", "-jar", "samanespring-cicd.jar"]

