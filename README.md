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

---

## 🛠 Tools Used
- Java
- JDBC
- MySQL
- Git & GitHub

---

## 🧱 Project Structure

StudentRecordManager/
├── src/
│ ├── DBConnection.java
│ ├── StudentDAO.java
│ └── Main.java
├── lib/
│ └── mysql-connector-j-9.3.0.jar
├── .gitignore
└── README.md


---

## ⚙️ How to Run

1. Make sure MySQL is running and a database named `studentdb` is created.
2. Compile the project:

    javac -cp "lib/mysql-connector-j-9.3.0.jar;src" src/*.java

3. Run the project:

    java -cp "lib/mysql-connector-j-9.3.0.jar;src" Main

🧾 MySQL Table Setup:

CREATE DATABASE studentdb;
USE studentdb;

CREATE TABLE students (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100),
  email VARCHAR(100),
  course VARCHAR(100)
);

👤 Author
Yennameedhi Manoj Kumar
