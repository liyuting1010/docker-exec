FROM openjdk:8-jre-stretch
RUN mkdir /app
WORKDIR /app

EXPOSE 80

ADD build/libs/docker-server.jar /app/lib/

ENTRYPOINT ["java", "-jar", "/app/lib/docker-server.jar"]
