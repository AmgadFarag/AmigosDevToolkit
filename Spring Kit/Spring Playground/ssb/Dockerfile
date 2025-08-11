FROM openjdk:17-jdk

WORKDIR /app

COPY target/ssb*.jar /app/ssb.jar

EXPOSE $(PORT)

CMD ["java", "-jar", "ssb.jar"]
