FROM openjdk:8-jdk-alpine
VOLUME /tmp
ENV PORT 8080
EXPOSE 8080
ARG JAR_FILE
WORKDIR /opt
COPY target/*.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]