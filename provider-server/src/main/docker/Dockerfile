FROM java:7
# Add Maven dependencies (not shaded into the artifact; Docker-cached)
ADD target/lib /usr/share/lib
# Add the service itself
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/app.jar
ENTRYPOINT ["java", "-jar", "/usr/share/app.jar"]
