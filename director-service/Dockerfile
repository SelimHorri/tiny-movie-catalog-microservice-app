
FROM openjdk:11
RUN mkdir -p /home/app
WORKDIR /home/app
COPY . .
ADD target/director-service.jar director-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "director-service.jar"]

