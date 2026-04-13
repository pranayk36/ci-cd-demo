FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY target/ci-cd-demo-1.0.jar app.jar

EXPOSE 9090

ENTRYPOINT ["java","-jar","app.jar"]
