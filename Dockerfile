FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/jarservlet-1.0-jar-with-dependencies.jar app.jar
EXPOSE 8080
CMD ["java","-jar","app.jar"]
