FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY /home/user/.local/tmp/buildkit-mount1798167371/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080