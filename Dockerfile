FROM openjdk:8-jre-alpine
MAINTAINER pavithragowda811@gmail.com

ARG JAR_FILE
ADD TestLabOne-0.0.1-SNAPSHOT.jar /usr/share/TestLabOne-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/TestLabOne-0.0.1-SNAPSHOT.jar"]

