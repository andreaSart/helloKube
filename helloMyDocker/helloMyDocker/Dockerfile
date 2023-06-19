#package phase
FROM maven:3.6.3-jdk-8 AS build
ENV HOME=/home/helloMyDocker
RUN mkdir -p $HOME
WORKDIR $HOME
ADD . $HOME
RUN mvn clean package

#build and create image and doesn't create container
FROM maven:3.6.3-jdk-8 AS image
COPY --from=build /home/helloMyDocker/target/helloMyDocker-0.0.1-SNAPSHOT.jar /lib/helloMyDocker/helloMyDocker.jar
EXPOSE 8080

CMD ["java", "-jar", "/lib/helloMyDocker/helloMyDocker.jar"]


