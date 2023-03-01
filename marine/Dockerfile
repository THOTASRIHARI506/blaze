FROM openjdk:11-jre-slim
RUN mkdir -p /ilmarine/
RUN chmod -R 777 /ilmarine
WORKDIR /ilmarine
COPY ./ .
EXPOSE 8080
CMD ["java","-jar","/ilmarine/target/marine-0.0.1-SNAPSHOT.jar"]