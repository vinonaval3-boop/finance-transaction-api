# 💰 Finance Transaction API

A RESTful API built with Java Spring Boot for managing personal finance transactions.

## 🛠️ Tech Stack
- Java 17
- Spring Boot
- REST API
- Maven

## 🔥 API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/transactions | Get all transactions |
| POST | /api/transactions | Add new transaction |
| DELETE | /api/transactions/{id} | Delete transaction |
| GET | /api/transactions/summary | Get income/expense summary |

## ⚙️ Run Locally
./mvnw spring-boot:run

Access at: http://localhost:8080/api/transactions