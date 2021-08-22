
FROM openjdk:11
RUN mkdir -p /home/app
WORKDIR /home/app
COPY . .
ENTRYPOINT ["./mvnw", "-X", "clean", "install"]

