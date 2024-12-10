FROM openjdk: 23
EXPOSE: 8080
ADD target/cicd-test.jar target/cicd-test.jar
ENTRYPOINT ["java", "-jar", "/cicd-test.jar"]
