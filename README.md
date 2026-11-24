# 🚀 Employee Management REST API

A RESTful backend application developed using **Spring Boot**, **Spring Data JPA**, **Hibernate**, and **MySQL** to perform Employee Management operations. The project follows a layered architecture and demonstrates CRUD operations using REST APIs.

> This project was developed as part of Java Backend Development practice to strengthen concepts of Spring Boot, REST APIs, JPA, and database integration.

---

## 📌 Features

- ➕ Create a new Employee
- 📄 Retrieve all Employees
- 🔍 Retrieve Employee by ID
- ✏️ Update Employee information
- ❌ Delete Employee by ID
- 🗄️ MySQL database integration
- 🏗️ Layered Architecture (Controller → Service → Repository → Entity)
- 🔄 Spring Data JPA & Hibernate ORM
- 🧪 API testing using Postman

---

## 🛠️ Tech Stack

| Technology | Version |
|------------|---------|
| Java | 17 |
| Spring Boot | 3.5.6 |
| Spring Web | Latest |
| Spring Data JPA | Latest |
| Hibernate | ORM |
| MySQL | Database |
| Maven | Build Tool |
| Postman | API Testing |

---

# 📂 Project Structure

```
EmployeeManagement_RESTAPI
│
├── src
│   └── main
│       ├── java
│       │   └── in.sp.main
│       │       ├── controller
│       │       │     └── MyController.java
│       │       ├── services
│       │       │     ├── UserService.java
│       │       │     └── UserServiceImpl.java
│       │       ├── repositories
│       │       │     └── UserRepository.java
│       │       ├── entities
│       │       │     └── User.java
│       │       └── MyApplication.java
│       │
│       └── resources
│             └── application.properties
│
├── pom.xml
└── README.md
```

---

# 🏛️ Architecture

```
                Client / Postman
                       │
                       ▼
                REST Controller
                       │
                       ▼
                  Service Layer
                       │
                       ▼
                 Repository Layer
                       │
                       ▼
              Spring Data JPA
                       │
                       ▼
                  Hibernate ORM
                       │
                       ▼
                    MySQL DB
```

---

# 📊 Database

Database Name

```
restfulWs
```

Employee Table

| Column | Type |
|--------|------|
| id | Integer |
| name | String |
| email | String |
| password | String |
| city | String |

---

# 🌐 REST API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/user` | Create Employee |
| GET | `/user` | Get All Employees |
| GET | `/user/{id}` | Get Employee by ID |
| PUT | `/user/{id}` | Update Employee |
| DELETE | `/user/{id}` | Delete Employee |

---

# 📥 Sample Request

### POST `/user`

```json
{
    "name":"Vipin",
    "email":"vipin@gmail.com",
    "password":"12345",
    "city":"Delhi"
}
```

---

# 📤 Sample Response

```json
{
    "id":1,
    "name":"Vipin",
    "email":"vipin@gmail.com",
    "password":"12345",
    "city":"Delhi"
}
```

---

# ▶️ Getting Started

## Clone Repository

```bash
git clone https://github.com/vipinyadav83/EmployeeManagement_RESTAPI.git
```

## Open Project

Import as **Existing Maven Project** in Eclipse or IntelliJ IDEA.

---

## Configure Database

Create a MySQL database:

```sql
CREATE DATABASE restfulWs;
```

Update your credentials inside:

```
src/main/resources/application.properties
```

---

## Run the Application

Run

```
MyApplication.java
```

or

```bash
mvn spring-boot:run
```

---

# 🧪 Testing

All REST endpoints can be tested using:

- Postman
- Thunder Client
- Swagger (Future Enhancement)

---

# 📈 Future Improvements

- ✅ Global Exception Handling
- ✅ Request Validation
- ✅ Swagger/OpenAPI Documentation
- ✅ Spring Security + JWT Authentication
- ✅ Pagination & Sorting
- ✅ Search APIs
- ✅ Docker Support
- ✅ Unit Testing (JUnit + Mockito)

---
📷 Screenshots
Database Schema
<img width="575" height="353" alt="image" src="https://github.com/user-attachments/assets/be32cf26-8fdd-4771-a305-ac770bffc024" />

GET API Response
<img width="751" height="594" alt="image" src="https://github.com/user-attachments/assets/6f979d0e-44a5-4504-9c5f-64c66cf0bb18" />

POST API Response
<img width="731" height="565" alt="image" src="https://github.com/user-attachments/assets/6e800919-391a-4054-b877-019fbe693917" />


# 💡 Key Concepts Demonstrated

- RESTful Web Services
- Spring Boot
- Spring MVC
- Dependency Injection
- Spring Data JPA
- Hibernate ORM
- Layered Architecture
- CRUD Operations
- MySQL Integration
- Maven Project Management

---

# 👨‍💻 Author

**Vipin Kumar Yadav**

Java Backend Developer

📧 Email: vkyadav8383@gmail.com

🔗 GitHub: https://github.com/vipinyadav83

🔗 LinkedIn: https://www.linkedin.com/in/your-linkedin-profile

---

## ⭐ If you found this project useful, don't forget to Star the repository!
