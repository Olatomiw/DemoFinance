# 📊 DemoFi Finance Dashboard API

This is a simple RESTful backend API for a finance dashboard built with **Spring Boot**. It exposes endpoints to retrieve data for **Budgets**, **Transactions**, **Balances**, and **Savings Pots**.

---

## 🚀 Features

- View all budgets
- View all transactions with pagination and sorting
- Filter/search transactions by name and/or category
- View all balance records
- View all savings pots
- Built-in OpenAPI/Swagger documentation support

---

## 📦 Project Structure

```
com.DemoFi.Finance
├── controller
│   └── DashboardController.java
├── entity
│   ├── Balance.java
│   ├── Budget.java
│   ├── SavingPots.java
│   └── Transaction.java
├── repository
│   ├── BalanceRepository.java
│   ├── BudgetRepository.java
│   ├── SavingsRepository.java
│   └── TransactionRepository.java
```

---

## 📁 API Endpoints

### 🔹 GET `/api/dashboard/budgets`
- **Description:** Get all budget entries
- **Response:** `List<Budget>`

```json
[
  {
    "id": 1,
    "name": "Groceries",
    "amount": 200.0
  }
]
```

### 🔹 GET `/api/dashboard/transactions`
- **Description:** Get all transactions (paginated & sorted)
- **Query Params:**
  - `page` (default: 0)
  - `size` (default: 10)
  - `sortBy` (default: "date")
  - `direction` (default: "asc" | "desc")
- **Response:** `Page<Transaction>`

```json
{
  "content": [
    {
      "id": 1,
      "name": "Supermarket",
      "amount": 50.0,
      "category": "Groceries",
      "date": "2024-05-01"
    }
  ],
  "totalElements": 15,
  "totalPages": 2
}
```

### 🔹 GET `/api/dashboard/transactions/search`
- **Description:** Search transactions by `name`, filter by `category` (optional), with pagination & sorting.
- **Query Params:**
  - `query` (required) → text to match in `name`
  - `category` (optional) → filters result by category (leave empty to skip filtering)
  - `sortBy` (default: "date")
  - `direction` (default: "desc")
  - `page` (default: 0)
  - `size` (default: 10)
- **Response:** `Page<Transaction>`

```http
GET /api/dashboard/transactions/search?query=food&category=Groceries&sortBy=date&direction=desc&page=0&size=10
```

### 🔹 GET `/api/dashboard/balance`
- **Description:** Get all balance records
- **Response:** `List<Balance>`

```json
[
  {
    "id": 1,
    "amount": 1200.50,
    "date": "2024-05-15"
  }
]
```

### 🔹 GET `/api/dashboard/savings`
- **Description:** Get all savings pots
- **Response:** `List<SavingPots>`

```json
[
  {
    "id": 1,
    "name": "Vacation",
    "amount": 400.00
  }
]
```

---

## 🔍 How Pagination Works
All paginated endpoints accept these query parameters:

| Param     | Description                 | Example |
|-----------|-----------------------------|---------|
| page      | Zero-based page index       | 0       |
| size      | Number of items per page    | 10      |
| sortBy    | Field to sort by (e.g. `date`) | `date`  |
| direction | Sort order: `asc` or `desc` | `desc`  |

---

## 🧪 Example Swagger/OpenAPI URL
Once you run the app locally:
```
http://localhost:8080/swagger-ui/index.html
```

---

## 📤 Deployment
You can deploy this app for free on the following platforms:

- [Render](https://render.com/)
- [Railway](https://railway.app/)
- [Glitch](https://glitch.com/)
- [Replit](https://replit.com/)
- [Vercel (via Java runtime)](https://vercel.com/)

---

## 👨‍💻 Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL (or any JPA-compatible DB)
- Swagger / OpenAPI

---

## 📬 Contact
For questions, contact [YourName] at `you@example.com`

---

## 📝 License
This project is open-source and free to use.

