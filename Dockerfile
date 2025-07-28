FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app

COPY target/Finance-0.0.1-SNAPSHOT.jar /app/Finance.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "Finance.jar"]


ENV DB_PORT="5432"