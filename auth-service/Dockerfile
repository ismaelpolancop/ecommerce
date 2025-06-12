FROM azul/zulu-openjdk:21-latest

# Install curl for healthcheck
RUN apt-get update && apt-get install -y curl && rm -rf /var/lib/apt/lists/*

# Set working directory
WORKDIR /app

# Copy the jar file
COPY target/*.jar app.jar

# Set JVM options if needed
ENV JAVA_OPTS=""

# Run the application
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app/app.jar"]
