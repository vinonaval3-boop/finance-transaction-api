# 💰 Finance Transaction API

A production-ready RESTful API built with **Java Spring Boot** to manage personal finance transactions — track income, expenses, and get real-time balance summaries.

## 🚀 Tech Stack
- **Java 17** — Core language
- **Spring Boot 3.x** — Backend framework
- **REST API** — HTTP-based communication
- **Maven** — Build tool

## 🔥 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/transactions` | Fetch all transactions |
| POST | `/api/transactions` | Add new transaction |
| DELETE | `/api/transactions/{id}` | Remove a transaction |
| GET | `/api/transactions/summary` | Get total income, expense & balance |

## 📊 Summary Response
```json
{
  "totalIncome": 0.0,
  "totalExpense": 0.0,
  "balance": 0.0
}
```

## ⚙️ Run Locally
```bash
./mvnw spring-boot:run
```
API runs at: `http://localhost:8080`

## 👩‍💻 Author
Vinothini — Associate Software Engineer Aspirant
