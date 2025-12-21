
# 🤝 Collaboration Guide – School Management System

This document defines **how the team collaborates**, assigns tasks, and maintains code quality throughout the project.

---

## 👥 Team Structure
> _Check out team breakdown  [`Team.md`](Team.md)._ 

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

