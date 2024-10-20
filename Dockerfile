FROM openjdk:17-jdk-slim
LABEL authors="gwiazdan"

WORKDIR /app

COPY pom.xml ./

COPY src ./src

COPY src/main/resources ./src/main/resources

COPY db ./db

RUN apt-get update && apt-get install -y maven && mvn dependency:resolve

EXPOSE 8081

# Definicja argumentu budowy z domyślną wartością
ARG JAR_FILE=electionresults-0.0.1-SNAPSHOT.jar

# Kopiowanie pliku JAR do obrazu
COPY ${JAR_FILE} app.jar

# Uruchomienie aplikacji
ENTRYPOINT ["java", "-jar", "app.jar"]
