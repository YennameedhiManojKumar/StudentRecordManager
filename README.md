# 📚 Student Record Manager

This is a simple Java console project to manage student records using JDBC and MySQL.

---

## 💡 Features
- Add new student
- View all students
- Update student email
- Delete student
- Menu-driven interface
- Connects to MySQL via JDBC
- Login system with username & password

---

## 🛠 Tools Used
- Java
- JDBC
- MySQL
- Git & GitHub

---

## 🧱 Project Structure

```
StudentRecordManager/
├── src/
│   ├── DBConnection.java
│   ├── StudentDAO.java
│   ├── AuthDAO.java
│   └── Main.java
├── lib/
│   └── mysql-connector-j-9.3.0.jar
├── .gitignore
└── README.md
```

---

## 🔗 Dependencies

- Download [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/)
- Place the `.jar` file in a folder named `lib/`

---

## ⚙️ How to Run

1. Make sure MySQL is running and a database named `studentdb` exists.
2. Compile the project:

   ```bash
   javac -cp "lib/mysql-connector-j-9.3.0.jar;src" src/*.java
   ```

3. Run the project:

   ```bash
   java -cp "lib/mysql-connector-j-9.3.0.jar;src" Main
   ```

---

## 🧾 MySQL Table Setup

```sql
CREATE DATABASE studentdb;
USE studentdb;

CREATE TABLE students (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100),
  email VARCHAR(100),
  course VARCHAR(100)
);

CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(50) UNIQUE,
  password VARCHAR(100)
);

INSERT INTO users (username, password) VALUES ('admin', 'admin123');
```

---

## 🔐 Login System Added

Before accessing the menu, users must log in with valid credentials.

**Default Admin Login:**
- Username: `admin`
- Password: `admin123`

> Credentials are stored in the MySQL `users` table.

---

## 👤 Author

**Yennameedhi Manoj Kumar**
