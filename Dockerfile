FROM openjdk:8
VOLUME /tmp
COPY target/dockerized-heroku-app.jar dockerized-heroku-app.jar
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/dockerized-heroku-app.jar"]