FROM maven:3.9.6-eclipse-temurin-17

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

# check if the JAR exists
RUN ls -l target

CMD ["java", "-jar", "target/Temp-converter.jar"]