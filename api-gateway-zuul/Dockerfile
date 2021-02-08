FROM openjdk:7-jre
MAINTAINER ymh@yimin.com

COPY target/api-gateway-zuul-1.0-SNAPSHOT.jar /api-gateway.jar

ENTRYPOINT [ "java", "-jar", "/api-gateway.jar" ]
