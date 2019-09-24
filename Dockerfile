FROM openjdk:8
ADD restwsspringboot-0.1.jar restwsspringboot-0.1.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar", "restwsspringboot-0.1.jar"]