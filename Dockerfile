FROM openjdk:11-jdk

COPY group3project/target/group3project-0.0.1-SNAPSHOT.jar /app/group3project.jar

CMD ["java", "-jar", "/app/group3project.jar"]