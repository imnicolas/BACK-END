
FROM amazoncorretto:8-alpine-jdk
MAINTAINER MoraCastelliGaraycochea

copy target/portafolio-0.0.1-SNAPSHOT.jar portafolio.jar
entrypoint ["java","-jar","/portafolio.jar"]

