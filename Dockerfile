FROM maven:3.8-jdk-8 as builder

WORKDIR /app
COPY pom.xml .
COPY src ./src
COPY . .
RUN mvn package -DskipTests

FROM openjdk:8
EXPOSE 8080
COPY --from=builder /app/target/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
