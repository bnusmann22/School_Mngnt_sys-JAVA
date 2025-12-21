

# 🎓 School Management System (Java – Basic OOP)

A **console-based School Management System** developed using **Java and basic Object-Oriented Programming (OOP) principles**.  
This project is designed for **beginners** and implemented as a **team-based group project**.

Each major feature of the system is built as a **separate module**, owned by a small group of students, and integrated into a central system.

---

## ✨ Features
- Student management (add & view students)
- Teacher management
- Course management
- Attendance recording
- Result and grading system
- School fee tracking
- Menu-driven console interface

---

## 🎯 Project Objectives
- Practice **core Java OOP concepts**
- Learn **modular programming**
- Understand **real-world system modeling**
- Improve **team collaboration using GitHub**

---

## 🛠 Technologies Used
- Java
- Java Collections (`ArrayList`)
- Console-based input/output

---

## 📁 Project Structure

```text
SchoolManagement/
└── src/
    ├── core/
    │   ├── School.java
    │   └── Menu.java
    ├── model/
    │   ├── Student.java
    │   ├── Teacher.java
    │   ├── Course.java
    │   ├── Attendance.java
    │   ├── Result.java
    │   └── Fee.java
    └── Main.java
````

---

## 🧠 OOP Concepts Applied

* Classes & Objects
* Encapsulation (private fields + methods)
* Constructors
* Composition
* Java Collections

---

## ▶️ How to Run the Project

1. Clone the repository:

   ```bash
   git clone <repository-url>
   ```
2. Open the project in any Java IDE (IntelliJ IDEA, Eclipse, VS Code).
3. Run the `Main.java` file.
4. Follow the on-screen menu instructions.

---

## 👥 Team Collaboration

This project is built by a **team of students**, with each module assigned to **2–3 contributors**.
Collaboration rules and workflow are documented in [`COLLABORATION.md`](COLLABORATION.md).

---

## 📌 Note

This project focuses on **learning and clarity**, not complexity.
No database, GUI, or advanced frameworks are used.

---

## 📜 License

This project is for **educational purposes only**.



# 🤝 Collaboration Guide – School Management System

This document defines **how the team collaborates**, assigns tasks, and maintains code quality throughout the project.

---

## 👥 Team Structure

Each major module is owned by **2–3 students**:

| Module | Responsibility |
|------|----------------|
| Student | Student data & logic |
| Teacher | Teacher records |
| Course | Course creation & listing |
| Attendance | Attendance recording |
| Result | Scores & grade calculation |
| Fee | Fee payment & balance |
| School (Core) | Central data storage |
| Menu / Integration | User interaction & flow |

---

## 📁 Code Ownership Rules

- Each group **edits ONLY their assigned file(s)**
- Do **NOT modify other modules**
- Do **NOT edit `Main.java`** unless assigned
- Follow the existing package structure

---

## 🧱 Coding Standards

- Use **clear variable names**
- Keep methods **simple and readable**
- Avoid unnecessary complexity
- Use `toString()` for displaying objects
- Follow Java naming conventions

---

## 🌿 Git Workflow

1. Clone the repository
2. Create a new branch:
   ```bash
   git checkout -b module-student
   ````

3. Make changes **only in your module**
4. Commit with a clear message:

   ```bash
   git commit -m "Add student module logic"
   ```
5. Push and open a **Pull Request**
6. Wait for review before merging

---

## ⚠️ Important Rules

* No direct pushes to `main`
* Resolve merge conflicts carefully
* Communicate before major changes
* Keep commits small and meaningful

---

## 🎯 Goal of Collaboration

* Ensure everyone contributes
* Avoid merge conflicts
* Maintain a clean, understandable codebase
* Learn teamwork alongside Java OOP

---

## ✅ Final Reminder

> Simplicity, clarity, and teamwork matter more than advanced features.

Happy coding 🚀

