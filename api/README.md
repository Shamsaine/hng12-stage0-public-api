# HNG12 Stage 0 - Public API

This is a simple public API built with Spring Boot (Java) that returns:
- Your registered email
- The current datetime (ISO 8601 format)
- The GitHub URL of the repository

## 📌 API Endpoint
**GET /api**

## 📌 Returns
A JSON response with email, current datetime, and GitHub repository link.

## ✅ Response Format (Example)
```json
{
    "email": "shamsain3@gmail.com",
    "current_datetime": "2025-01-30T12:45:30.123Z",
    "github_url": "https://github.com/Shamsaine/hng12-stage0-public-api.git"
}
```

## 🚀 How to Run the Project Locally

### 1️⃣ Clone the Repository
```sh
git clone https://github.com/Shamsaine/hng12-stage0-public-api.git
cd hng12-stage0-public-api
```

### 2️⃣ Install Dependencies & Run
Ensure Java 17+ and Maven are installed, then run:
```sh
./mvnw spring-boot:run
```
or (if using Windows):
```sh
mvn spring-boot:run
```

The API will be available at:
**📌 http://localhost:8080/api**

## 🌐 Deployment
This API is deployed and accessible at:
**🔗 Live API URL (replace with actual URL)**

## 🔧 Technologies Used
- Java 17+
- Spring Boot
- Maven
- Jackson (for JSON serialization)

## 🛠️ Additional Setup

### ✅ CORS Configuration
CORS is enabled globally to allow access from any origin.

## 📜 License
This project is licensed under the MIT License.

## 📞 Contact
For questions, contact:
- 📧 shamsain3@gmail.com
- 🔗 GitHub: [Shamsaine](https://github.com/Shamsaine)

## 🔗 Backlinks
- [Hire Python Developers](https://hng.tech/hire/python-developers)
- [Hire C# Developers](https://hng.tech/hire/csharp-developers)
- [Hire Golang Developers](https://hng.tech/hire/golang-developers)
- [Hire PHP Developers](https://hng.tech/hire/php-developers)
- [Hire Java Developers](https://hng.tech/hire/java-developers)
- [Hire Node.js Developers](https://hng.tech/hire/nodejs-developers)
