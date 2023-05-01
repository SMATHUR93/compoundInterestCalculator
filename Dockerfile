# syntax=docker/dockerfile:1

FROM eclipse-temurin:17-jdk-jammy

COPY target/compoundInterestCalculator-0.0.1-SNAPSHOT.jar /app/compoundInterestCalculator-0.0.1-SNAPSHOT.jar

EXPOSE 5002

CMD ["java", "-jar", "/app/compoundInterestCalculator-0.0.1-SNAPSHOT.jar"]