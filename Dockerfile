   FROM openjdk:8
   ADD target/BootingDocker.jar BootingDocker.jar
   EXPOSE 2018
   ENTRYPOINT ["java","-jar","BootingDocker.jar"]