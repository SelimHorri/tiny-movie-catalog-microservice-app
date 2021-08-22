
FROM openjdk:11
RUN mkdir -p /home/app
WORKDIR /home/app
COPY . .
ADD target/api-gateway.jar api-gateway.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "api-gateway.jar"]

