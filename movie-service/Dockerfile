
FROM openjdk:11
RUN mkdir -p /home/app
WORKDIR /home/app
COPY . .
ADD target/movie-service.jar movie-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "movie-service.jar"]

