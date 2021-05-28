FROM openjdk:8
EXPOSE 8080
ADD target/vehicle-management-system.jar vehicle-management-system
ENTRYPOINT ["java","-jar","/vehicle-management-system.jar"]
