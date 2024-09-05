FROM openjdk:21
COPY ./target/user.jar user.jar
CMD ["java","-jar","user.jar"]