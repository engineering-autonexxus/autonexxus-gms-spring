# Stage 1: Build the application using Maven
FROM maven:3.8.6-openjdk-17 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the Maven POM file and source code to the container
COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Stage 2: Create the final image with JDK 17
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the build stage to the final image
COPY --from=build /app/target/*.jar app.jar

# Expose the port on which the application will run
EXPOSE 8080

# Define the command to run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]