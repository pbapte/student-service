FROM openjdk:8
ADD target/student-service-0.0.1-SNAPSHOT.jar myapp.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "myapp.jar"]