
```markdown
# 🛍️ E-Commerce Application

A simple **E-Commerce Web Application** developed using **Spring Boot**, **H2 Database**, and a **React frontend**.  
This project provides basic product management features such as **Add**, **Update**, **Delete**, **Search**, and **View Cart**.

---

## 🚀 Tech Stack

### Backend
- **Spring Boot** (REST API)
- **Spring Data JPA**
- **H2 Database** (file-based)
- **Postman** (for API testing)

### Frontend
- **React.js**
- **HTML, CSS, JavaScript**
- **Vite Build Tool**

---

## ⚙️ Features

✅ Add new products  
✅ Update existing products  
✅ Delete products  
✅ Search for products by keyword  
✅ View product list  
✅ Integrated H2 database  
✅ REST APIs for backend interaction

---

## 🗂️ Project Structure

```

ecom-proj/
├── src/
│   ├── main/
│   │   ├── java/com/vishnuu/ecom_proj/
│   │   │   ├── controller/      # REST Controllers
│   │   │   ├── model/           # Entity Classes
│   │   │   ├── repo/            # JPA Repositories
│   │   │   └── service/         # Business Logic Layer
│   │   ├── resources/
│   │   │   ├── static/          # React build files
│   │   │   ├── templates/       # Thymeleaf templates (optional)
│   │   │   ├── application.properties
│   │   │   └── data1.sql        # Initial data (if any)
│   └── test/                    # Test cases
├── pom.xml                      # Maven configuration
└── EcomProjApplication.java     # Main Spring Boot file

````

---

## ⚡ API Endpoints

| Method | Endpoint | Description |
|--------|-----------|-------------|
| `GET` | `/products` | Get all products |
| `GET` | `/products/search?keyword={keyword}` | Search for products |
| `POST` | `/product` | Add new product |
| `PUT` | `/product/{id}` | Update existing product |
| `DELETE` | `/product/{id}` | Delete a product |

---

## 🧩 Database Configuration (H2)

```properties
spring.datasource.url=jdbc:h2:file:./data/ecomdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
````

Access H2 Console at:
➡️ `http://localhost:8080/h2-console`

---

## ▶️ How to Run

### 🧱 Backend

1. Open project in **IntelliJ** or **VS Code**.
2. Run `EcomProjApplication.java`.
3. Backend will start at `http://localhost:8080`.

### 💻 Frontend (React)

If your frontend folder is built using Vite:

```bash
cd frontend-folder
npm install
npm run dev
```

Frontend will run at `http://localhost:5173` (by default).

---

## 🧠 Future Enhancements

* Implement user authentication and authorization
* Add order management system
* Integrate payment gateway
* Improve UI and cart features

---

## 👨‍💻 Author

**Vishnu Vardhan**
Full Stack Java Developer | Spring Boot | React | REST APIs

---

```

---

Would you like me to include **Postman collection (sample JSON)** for all your API endpoints too, so you can import and test them directly?
```
