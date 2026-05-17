# E-Commerce Backend API

A REST API backend for an E-Commerce application built with Spring Boot and MySQL.

## Tech Stack
- Java 17
- Spring Boot 3.5
- Spring Security + JWT
- MySQL
- Lombok
- Maven

## Features
- User Registration and Login
- JWT Authentication
- Product Management
- Cart Management
- Order Management

## API Endpoints

### Auth
| Method | URL | Description |
|--------|-----|-------------|
| POST | /users/register | Register a new user |
| POST | /auth/login | Login and get JWT token |

### Products
| Method | URL | Description |
|--------|-----|-------------|
| POST | /products/add | Add a product |
| GET | /products/all | Get all products |

### Cart
| Method | URL | Description |
|--------|-----|-------------|
| POST | /cart/add | Add item to cart |
| GET | /cart/all | Get all cart items |
| GET | /cart/{userId} | Get user's cart |

### Orders
| Method | URL | Description |
|--------|-----|-------------|
| POST | /orders/place | Place an order |
| GET | /orders/{userId} | Get user's orders |

## How to Run
1. Clone the repository
2. Create MySQL database: `CREATE DATABASE ecommerce_db;`
3. Update `application.properties` with your MySQL password
4. Run: `.\mvnw.cmd spring-boot:run`
5. API runs on `http://localhost:8080`

## How to Test
1. Register a user → `POST /users/register`
2. Login → `POST /auth/login` → copy the token
3. Add token in Postman → Authorization → Bearer Token
4. Test any protected API!