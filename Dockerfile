FROM openjdk:17-jdk-slim
LABEL authors="gwiazdan"

WORKDIR /app

COPY pom.xml ./

COPY src ./src

COPY src/main/resources ./src/main/resources

COPY db ./db

RUN apt-get update && apt-get install -y maven && mvn dependency:resolve

EXPOSE 8081

CMD ["java", "-jar", "target/electionresults-0.0.1-SNAPSHOT.jar"]
