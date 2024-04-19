FROM maven:3.8.7-openjdk-18-slim

RUN mkdir /opt/checkpoint2

COPY . /opt/checkpoint2

WORKDIR /opt/checkpoint2

RUN mvn clean package

ENV PROFILE=dev

EXPOSE 8080

ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILE}","-jar", "target/app.jar"]