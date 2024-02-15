FROM maven:3.6.3-jdk-11-slim
LABEL maintainer="Maguette Kane maguettekanea@gmail.com"
EXPOSE 8080
ADD target/samanespring-cicd.jar/ samanespring-cicd.jar
ENTRYPOINT ["java", "-jar","samanespring-cicd.jar"]
