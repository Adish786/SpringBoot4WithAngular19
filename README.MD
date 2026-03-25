Full-Stack CRUD App - Angular 19 + Spring Boot 4.0.4
Frontend: Angular 19 (port 4200)
Backend: UserService (8080) + ProductService (8081)

✨ Features
✅ Dual Backend support (Users + Products)

✅ Full CRUD operations

✅ Angular 19 Standalone + SCSS

✅ Spring Boot 4.0.4 + JDK 21

✅ Proxy auto-connects to both backends

✅ 3-minute setup

🚀 Quick Setup (3 Minutes)
1. Backend - UserService (Port 8080)
bash
cd backend/userservice
mvn spring-boot:run
✅ http://localhost:8080/api/users

2. Backend - ProductService (Port 8081)
bash
cd ../productservice
mvn spring-boot:run
✅ http://localhost:8081/api/products

3. Frontend - Angular 19 (Port 4200)
bash
cd frontend
npm install
ng serve
✅ http://localhost:4200

📱 App Demo
text
┌──────────────────────────────┐
│ 🧑 Users    📦 Products (2)   │
├──────────────────────────────┤
│ John (ADMIN)  Laptop $999     │
│ Jane (USER)   Mouse  $29      │
│ [➕ Add User] [➕ Add Product]│
└──────────────────────────────┘
📁 Project Structure
text
fullstack-crud/
├── backend/
│   ├── userservice/          # Port 8080
│   │   ├── pom.xml
│   │   └── src/.../User*
│   └── productservice/       # Port 8081
│       ├── pom.xml
│       └── src/.../Product*
├── frontend/                 # Port 4200
│   ├── src/app/
│   │   ├── services/
│   │   │   ├── user.service.ts
│   │   │   └── product.service.ts
│   │   └── components/
│   ├── proxy.conf.json
│   └── package.json
└── README.md
⚙️ Proxy Configuration (Connects Both Backends)
frontend/proxy.conf.json:

json
{
  "/api/users/*": {
    "target": "http://localhost:8080",
    "secure": false,
    "changeOrigin": true
  },
  "/api/products/*": {
    "target": "http://localhost:8081", 
    "secure": false,
    "changeOrigin": true
  }
}
🧪 Test APIs
UserService (8080)
bash
curl -X POST http://localhost:8080/api/users \
  -d '{"name":"Admin","email":"admin@test.com","role":"ADMIN"}'

curl http://localhost:8080/api/users
ProductService (8081)
bash
curl -X POST http://localhost:8081/api/products \
  -d '{"name":"Laptop","price":999,"stock":50}'

curl http://localhost:8081/api/products
🚀 Commands Summary
Service	Command	URL
UserService	mvn spring-boot:run	localhost:8080
ProductService	mvn spring-boot:run	localhost:8081
Angular Frontend	npm install && ng serve	localhost:4200
🛠️ Tech Stack
Frontend	Backend	Database
Angular 19	Spring Boot 4.0.4	H2
Standalone Components	JDK 21	In-Memory
SCSS	Spring Data JPA	Auto-DDL
HttpClient	Spring Validation	H2 Console
📦 Production Deployment
bash
# 1. Build Angular
cd frontend
ng build --prod

# 2. Copy to ONE backend (e.g., ProductService)
cp -r dist/* ../backend/productservice/src/main/resources/static/

# 3. Build JAR
cd ../backend/productservice
mvn package

# 4. Run
java -jar target/*.jar
Production: Single JAR serves Angular + API!


🐛 Troubleshooting
Issue	Fix
No data	Both backends must run (8080 + 8081)
CORS	Proxy handles automatically ✅
Port conflict	User:8080, Product:8081 ✅
H2 Console	localhost:8080/h2-console & localhost:8081/h2-console

📚 Further Reading
- Angular 19 Standalone Components: https://angular.io/guide/standalone-components
- Spring Boot 4.0.4 Features: https://spring.io/projects/spring-boot
- H2 Database Guide: https://www.h2database.com/html/main.html
🎉 Enjoy your Full-Stack CRUD App with Angular 19 and Spring Boot 4.0.4! 
🚀
