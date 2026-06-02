FROM maven:3.9-eclipse-temurin-17

WORKDIR /app

COPY . .

RUN mvn clean package

EXPOSE 1099

CMD ["java", "-cp", "target/classes", "server.Servidor"]