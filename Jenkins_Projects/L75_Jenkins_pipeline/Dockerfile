FROM alpile
RUN mkdir -p  /usr/app
COPY ./build/this/java-maven-app.jar /usr/app/
WORKDIR /tmp/app/
CMD ["java", "-jar", "java-maven-app.jar"]
