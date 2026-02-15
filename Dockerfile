# ---- Build stage ----
FROM eclipse-temurin:17-jdk AS build

WORKDIR /app
COPY . .

# Make mvnw executable inside the container
RUN chmod +x mvnw

# Build the project (WAR)
RUN ./mvnw clean package -DskipTests

# ---- Run stage ----
FROM eclipse-temurin:17-jre

WORKDIR /app

# Copy the built WAR from build stage
COPY --from=build /app/target/*.war app.war

EXPOSE 8080

# Run the WAR using Spring Boot loader
CMD ["java", "-jar", "app.war"]
