FROM java:8
RUN mkdir -p /usr/src/myapp
COPY target/gs-rest-service-0.1.0.jar /usr/src/myapp/
WORKDIR /usr/src/myapp
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/gs-rest-service-0.1.0.jar"]
