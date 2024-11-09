FROM openjdk:20
COPY target/thai-learning-0.0.1-SNAPSHOT.jar /app/thai-learning.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "thai-learning.jar"]