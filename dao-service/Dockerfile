
FROM openjdk:11
RUN mkdir -p /home/app
WORKDIR /home/app
COPY . .
ADD target/dao-service.jar dao-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "dao-service.jar"]

