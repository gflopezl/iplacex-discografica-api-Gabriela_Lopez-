#STAGE 1
FROM gradle:jdk21 as builder

WORKDIR /app

COPY ./build.gradle .
COPY ./settings.gradle .

COPY src ./src

RUN gradle build --no-daemon

#STAGE 2
FROM openjdk:21-jdk-slim

WORKDIR /app

COPY --from=builder /app/build/libs/*.jar api1-1.jar

EXPOSE 443

CMD ["java", "-jar", "api1-1.jar"]


