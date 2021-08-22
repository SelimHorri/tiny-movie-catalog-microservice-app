
FROM openjdk:11
RUN mkdir -p /home/app
WORKDIR /home/app
COPY . .
ADD target/discovery-server.jar discovery-server.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "discovery-server.jar"]

