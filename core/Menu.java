package core;

import model.*;
import java.util.Scanner;

public class Menu {
    private School school;
    private Scanner input;

    public Menu() {
        this.school = new School();
        this.input = new Scanner(System.in);
    }

    public void show() {
        System.out.println("Welcome to School Management System");
        
        boolean running = true;
        while (running) {
            System.out.println("\n==== Main Menu ====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Add Course");
            System.out.println("4. View Courses");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            
            int choice = getInt();
            
            if (choice == 1) {
                addStudent();
            } else if (choice == 2) {
                viewStudents();
            } else if (choice == 3) {
                addCourse();
            } else if (choice == 4) {
                viewCourses();
            } else if (choice == 5) {
                running = false;
            } else {
                System.out.println("Invalid choice!");
            }
        }
        
        System.out.println("Goodbye!");
        input.close();
    }

    private void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = getInt();
        
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        
        System.out.print("Enter Level: ");
        String level = input.nextLine();
        
        Student student = new Student(id, name, level);
        school.students.add(student);
        System.out.println("Student added!");
    }

    private void viewStudents() {
        if (school.students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        
        System.out.println("\n==== Students ====");
        for (Student s : school.students) {
            s.display();
        }
    }

    private void addCourse() {
        System.out.print("Enter Course Code: ");
        String code = input.nextLine();
        
        System.out.print("Enter Course Title: ");
        String title = input.nextLine();
        
        Course course = new Course(code, title);
        school.courses.add(course);
        System.out.println("Course added!");
    }

    private void viewCourses() {
        if (school.courses.isEmpty()) {
            System.out.println("No courses found!");
            return;
        }
        
        System.out.println("\n==== Courses ====");
        for (Course c : school.courses) {
            c.display();
        }
    }

    private int getInt() {
        try {
            int value = input.nextInt();
            input.nextLine();
            return value;
        } catch (Exception e) {
            input.nextLine();
            return -1;
        }
    }
}
