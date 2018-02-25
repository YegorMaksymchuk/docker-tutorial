FROM openjdk:8-jdk-alpine

COPY ./target/docker-tomcat-jar-example-1.0-SNAPSHOT.jar /

EXPOSE 8080

ENTRYPOINT ["java","-jar","docker-tomcat-jar-example-1.0-SNAPSHOT.jar"]