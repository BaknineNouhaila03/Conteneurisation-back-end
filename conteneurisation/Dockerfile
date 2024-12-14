FROM maven:3.8.4-openjdk-25-slim AS build
WORKDIR /app

RUN addgroup --system spring && adduser --system spring --ingroup spring
USER spring:spring

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn validate

FROM openjdk:25-slim
WORKDIR /app

COPY target/conteneurisation-0.0.1-SNAPSHOT.jar app.jar 

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]