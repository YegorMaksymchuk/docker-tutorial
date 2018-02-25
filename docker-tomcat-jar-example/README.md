 git clone 
 
 mvn package
 
 docker build -t jar-example .

 docker run -d -p8080:8080 jar-example --name=jar-example

