FROM tomcat:8.0.20-jre8

MAINTAINER egormaksimchuk@gmail.com

ENV CATALINA_HOME /usr/local/tomcat
ENV PATH $CATALINA_HOME/bin:$PATH

COPY ./target/docker-compose-example-1.0-SNAPSHOT.war $CATALINA_HOME/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]