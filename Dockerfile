# Use an official OpenJDK runtime as a base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy Maven wrapper and pom.xml from the `api/` folder
COPY api/mvnw .
COPY api/.mvn .mvn
COPY api/pom.xml .

# ✅ Fix: Grant execution permissions to `mvnw`
RUN chmod +x mvnw

# Download dependencies (caching layer)
RUN ./mvnw dependency:go-offline

# Copy the entire `api/` source code to the container
COPY api/src ./src

# Build the application
RUN ./mvnw clean package -DskipTests

# Expose the port the app runs on
EXPOSE 9090

# Run the Spring Boot application
CMD ["java", "-jar", "target/api-0.0.1-SNAPSHOT.jar"]
