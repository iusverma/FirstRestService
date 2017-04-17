# FirstRestService

This project is to make a basic REST service in JAVA using SpringBoot library. Code changes are taken from https://spring.io/guides/gs/rest-service/.

This project is build with
1. JAVA 8 or above
2. Maven 3 or above

Building project
mvn clean install

Creating executable jar
mvn package

Running server
java -jar target/FirstRestService-0.0.1-SNAPSHOT.jar

From any browser use following command
http://localhost:8080/greeting OR http://localhost:8080/greeting?name=TEST

From postman
Trigger a GET request with http://localhost:8080/greeting OR http://localhost:8080/greeting?name=TEST
