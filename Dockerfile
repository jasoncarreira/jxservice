FROM openjdk:8-jdk-alpine
VOLUME /tmp
ENV PORT 8080
EXPOSE 8080
ARG JAR_FILE
COPY target/*.jar /opt/app.jar
WORKDIR /opt
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]