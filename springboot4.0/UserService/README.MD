UserService - Spring Boot 4.0 + JDK 21
Simple User CRUD API with Spring Boot 4.0, JDK 21, and H2 Database.
Simple Product CRUD API running on port 8080.

✨ Features
✅ Create, Read, Update, Delete Users

✅ REST API: /api/users

✅ H2 Database (No setup needed)

✅ Works in 2 minutes

🚀 Quick Setup (2 Minutes)
Prerequisites
JDK 21+

Maven

IDE (IntelliJ/VSCode recommended)

1. Clone & Run
   bash
   git clone <your-repo>
   cd userservice
   mvn spring-boot:run
   ✅ Done! App runs on http://localhost:8080

2. Test API
   bash
# Create User
curl -X POST http://localhost:8080/api/users \
-H "Content-Type: application/json" \
-d '{"name":"John","email":"john@test.com","role":"ADMIN"}'

# Get All Users
curl http://localhost:8080/api/users
3. View Database
   Open: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

User: sa | Password: (empty)

📁 Folder Structure
text
userservice/
├── pom.xml          (Spring Boot 4.0.4 + JDK 21)
├── src/main/java/
│   └── com/product/
│       ├── UserServiceApplication.java
│       ├── entity/User.java
│       ├── repository/UserRepository.java
│       └── controller/UserController.java
└── src/main/resources/
└── application.properties
🔧 Key Files
pom.xml (Main Dependencies)
xml
<parent>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-parent</artifactId>
<version>4.0.4</version>
</parent>
<properties>
<java.version>21</java.version>
</properties>
application.properties
text
spring.datasource.url=jdbc:h2:mem:testdb
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=create-drop
🧪 API Endpoints
Method	URL	Description
GET	/api/users	Get all users
GET	/api/users/1	Get user by ID
POST	/api/users	Create user
PUT	/api/users/1	Update user
DELETE	/api/users/1	Delete user
Sample JSON:

json
{
"name": "Jane Doe",
"email": "jane@test.com",
"role": "USER"
}
📦 Build JAR
bash
mvn clean package
java -jar target/*.jar
🎉 That's it! You have a working User CRUD API with Spring Boot 4.0 and JDK 21.
Feel free to explore and extend the functionality!