docker build -t war-example .

docker run -d --name war-example -p 8080:8080 war-example

Go to http://localhost:8080/docker-tomcat-war-example-1.0-SNAPSHOT