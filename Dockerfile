# ---- Build stage ----
FROM eclipse-temurin:17-jdk AS build

WORKDIR /app
COPY . .

# Make mvnw executable inside the container
RUN chmod +x mvnw

# Build the project
RUN ./mvnw clean package -DskipTests

# ---- Run stage ----
FROM eclipse-temurin:17-jre

WORKDIR /app

# Copy the built jar from build stage
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]