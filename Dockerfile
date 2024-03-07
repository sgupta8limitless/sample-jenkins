FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/sample-jenkins.jar .
EXPOSE 8080
ENTRYPOINT["java","-jar","sample-jenkins.jar"]