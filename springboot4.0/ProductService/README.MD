ProductService - Spring Boot 4.0 + JDK 21
Simple Product CRUD API running on port 8081.

✨ Features
✅ Create, Read, Update, Delete Products

✅ REST API: /api/products

✅ H2 Database (No setup needed)

✅ Port 8081 (avoids conflicts)

✅ Works in 2 minutes

🚀 Quick Setup (2 Minutes)
Prerequisites
JDK 21+

Maven

IDE (IntelliJ/VSCode)

1. Clone & Run
   bash
   git clone <your-repo>
   cd productservice
   mvn spring-boot:run
   ✅ Done! App runs on http://localhost:8081

2. Test API
   bash
# Create Product
curl -X POST http://localhost:8081/api/products \
-H "Content-Type: application/json" \
-d '{"name":"Laptop","price":999.99,"stock":50}'

# Get All Products
curl http://localhost:8081/api/products
3. View Database
   Open: http://localhost:8081/h2-console

JDBC URL: jdbc:h2:mem:productdb

User: sa | Password: (empty)

📁 Folder Structure
text
productservice/
├── pom.xml          (Spring Boot 4.0.4 + JDK 21)
├── src/main/java/
│   └── com/product/
│       ├── ProductServiceApplication.java
│       ├── entity/Product.java
│       ├── repository/ProductRepository.java
│       └── controller/ProductController.java
└── src/main/resources/
└── application.properties
🔧 Key Configuration
application.properties
text
# Port 8081
server.port=8081

# H2 Database
spring.datasource.url=jdbc:h2:mem:productdb
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=create-drop
pom.xml (Core Dependencies)
xml
<parent>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-parent</artifactId>
<version>4.0.4</version>
</parent>
<properties>
<java.version>21</java.version>
</properties>
🧪 API Endpoints
Method	URL	Description
GET	/api/products	Get all products
GET	/api/products/1	Get product by ID
POST	/api/products	Create product
PUT	/api/products/1	Update product
DELETE	/api/products/1	Delete product
Sample JSON:

json
{
"name": "iPhone 16",
"price": 999.99,
"stock": 25
}
📦 One-Command JAR
bash
# Build
mvn clean package

# Run JAR
java -jar target/*.jar
Access: http://localhost:8081

🎯 Perfect for learning Spring Boot 4.0 + JDK 21 with a simple Product CRUD API.
