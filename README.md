# 📚 Library Management System API
A professional, production-ready RESTful API built with Spring Boot for managing books and categories. This project demonstrates clean architecture, centralized error handling, and automated object mapping.

## 🛠 Tech Stack
Java 17+

Spring Boot 3.x

Spring Data JPA (Persistence layer)

PostgreSQL (Relational Database)

MapStruct (Efficient Entity-to-DTO mapping)

Lombok (Reducing boilerplate code)

Global Exception Handling (Centralized error management)

## 🏗 Layered Architecture
The project follows a clean, decoupled architecture:

Controller Layer: Handles HTTP requests and returns standardized responses.

Service Layer: Encapsulates business logic and orchestrates data flow.

Repository Layer: Direct interaction with the PostgreSQL database.

Mapper: Decouples internal entities from external DTOs using MapStruct.

## 🚀 Getting Started
1. Database Configuration
Update your PostgreSQL credentials in src/main/resources/application.properties:
spring.datasource.url=jdbc:postgresql://localhost:5432/library_db
spring.datasource.username=your_username
spring.datasource.password=your_password


2. Run the Application
mvn spring-boot:run

## API Endpoints

Books

Method,Endpoint,Description
GET,/api/books,Retrieve all books
GET,/api/books/{id},Get book by ID
POST,/api/books,Add a new book
DELETE,/api/books/{id},Delete a book (Returns 204 No Content)

Categories 

Method,Endpoint,Description
GET,/api/categories,Retrieve all categories
POST,/api/categories,Create a new category

## ⚠️ Global Error Handling
The application uses a @RestControllerAdvice to provide consistent error responses. If a resource is not found, the API returns a structured JSON:

{
  "timeStamp": "2026-01-05T23:24:50",
  "message": "Resource not found with id: 10",
  "status": 404
}
