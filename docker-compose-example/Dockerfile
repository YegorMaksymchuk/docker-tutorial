FROM openjdk:8-jdk-alpine

MAINTAINER egormaksimchuk@gmail.com

COPY ./target/docker-compose-example-1.0-SNAPSHOT.jar /

EXPOSE 8080

ENTRYPOINT ["java","-jar","docker-tomcat-jar-example-1.0-SNAPSHOT.jar"]