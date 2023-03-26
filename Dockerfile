
FROM amazoncorretto:8-alpine-jdk
MAINTAINER mora

copy target/portafolio-0.0.1-SNAPSHOT.jar portafolio-app.jar
entrypoint ["java","-jar","/portafolio-app.jar"]

