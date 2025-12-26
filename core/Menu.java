package core;

import model.*;
import java.util.Scanner;
import java.util.List;

/**
 * Menu interface for the School Management System.
 * Handles user input and navigation through the system.
 */
public class Menu implements AutoCloseable {

    private final School school;
    private final Scanner scanner;

    public Menu() {
        this.school = new School();
        this.scanner = new Scanner(System.in);
    }

    public void show() {
        boolean running = true;
        while (running) {
            displayMainMenu();
            int choice = getIntInput();
            running = handleMainChoice(choice);
        }
        System.out.println("Goodbye!");
    }

    private void displayMainMenu() {
        System.out.println("\n=== School Management System ===");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Manage Student Records");
        System.out.println("4. Exit");
        System.out.print("Choose option: ");
    }

    private boolean handleMainChoice(int choice) {
        switch (choice) {
            case 1:
                addStudentPrompt();
                return true;
            case 2:
                viewStudents();
                return true;
            case 3:
                manageStudentRecords();
                return true;
            case 4:
                return false;
            default:
                System.out.println("Invalid option. Please try again.");
                return true;
        }
    }

    private void addStudentPrompt() {
        System.out.print("ID: ");
        int id = getIntInput();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        System.out.print("Level: ");
        String level = scanner.nextLine().trim();
        if (level.isEmpty()) {
            System.out.println("Level cannot be empty.");
            return;
        }

        try {
            school.addStudent(new Student(id, name, level));
            System.out.println("Student added successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void viewStudents() {
        if (school.getStudents().isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("\n--- Students List ---");
        for (Student s : school.getStudents()) {
            System.out.println(s);
        }
    }

    private void manageStudentRecords() {
        if (school.getStudents().isEmpty()) {
            System.out.println("No students found. Please add a student first.");
            return;
        }

        System.out.println("\n--- Select Student ---");
        List<Student> students = school.getStudents();
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
        System.out.print("Enter student number: ");
        int choice = getIntInput();

        if (choice < 1 || choice > students.size()) {
            System.out.println("Invalid selection.");
            return;
        }

        Student selectedStudent = students.get(choice - 1);
        manageStudentMenu(selectedStudent);
    }

    private void manageStudentMenu(Student student) {
        boolean managing = true;
        while (managing) {
            System.out.println("\n=== Managing: " + student.getName() + " (ID: " + student.getId() + ") ===");
            System.out.println("1. Add Attendance");
            System.out.println("2. View Attendance");
            System.out.println("3. Add Result");
            System.out.println("4. View Results");
            System.out.println("5. Manage Fees");
            System.out.println("6. View Fee Details");
            System.out.println("7. Back to Main Menu");
            System.out.print("Choose option: ");

            int choice = getIntInput();
            managing = handleStudentChoice(choice, student);
        }
    }

    private boolean handleStudentChoice(int choice, Student student) {
        switch (choice) {
            case 1:
                addAttendance(student);
                return true;
            case 2:
                viewAttendance(student);
                return true;
            case 3:
                addResult(student);
                return true;
            case 4:
                viewResults(student);
                return true;
            case 5:
                manageFees(student);
                return true;
            case 6:
                viewFeeDetails(student);
                return true;
            case 7:
                return false;
            default:
                System.out.println("Invalid option. Please try again.");
                return true;
        }
    }

    private void addAttendance(Student student) {
        scanner.nextLine();
        System.out.print("Course Code: ");
        String courseCode = scanner.nextLine().trim();
        if (courseCode.isEmpty()) {
            System.out.println("Course code cannot be empty.");
            return;
        }

        System.out.print("Present (Y/N): ");
        String present = scanner.nextLine().trim().toUpperCase();
        boolean isPresent = present.equals("Y") || present.equals("YES");

        try {
            Attendance attendance = new Attendance(student.getId(), courseCode, isPresent);
            school.addAttendance(attendance);
            System.out.println("Attendance recorded successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void viewAttendance(Student student) {
        List<Attendance> attendanceList = school.getAttendanceList();
        List<Attendance> studentAttendance = attendanceList.stream()
                .filter(a -> a.getStudentId() == student.getId())
                .toList();

        if (studentAttendance.isEmpty()) {
            System.out.println("No attendance records found for this student.");
            return;
        }

        System.out.println("\n--- Attendance Records for " + student.getName() + " ---");
        for (Attendance a : studentAttendance) {
            System.out.println(a);
        }
    }

    private void addResult(Student student) {
        scanner.nextLine();
        System.out.print("Course Code: ");
        String courseCode = scanner.nextLine().trim();
        if (courseCode.isEmpty()) {
            System.out.println("Course code cannot be empty.");
            return;
        }

        System.out.print("Score (0-100): ");
        int score = getIntInput();

        try {
            Result result = new Result(student.getId(), courseCode, score);
            school.addResult(result);
            System.out.println("Result added successfully! Grade: " + result.getGrade());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void viewResults(Student student) {
        List<Result> resultsList = school.getResults();
        List<Result> studentResults = resultsList.stream()
                .filter(r -> r.getStudentId() == student.getId())
                .toList();

        if (studentResults.isEmpty()) {
            System.out.println("No results found for this student.");
            return;
        }

        System.out.println("\n--- Academic Results for " + student.getName() + " ---");
        for (Result r : studentResults) {
            System.out.println(r);
        }
    }

    private void manageFees(Student student) {
        scanner.nextLine();
        System.out.print("Total Fee Amount: ");
        double totalFee = getDoubleInput();
        if (totalFee < 0) {
            System.out.println("Fee amount cannot be negative.");
            return;
        }

        System.out.print("Amount Paid: ");
        double paidAmount = getDoubleInput();

        try {
            Fee fee = new Fee(student.getId(), totalFee, paidAmount);
            school.addFee(fee);
            System.out.println("Fee record created successfully!");
            System.out.println("Balance Due: " + fee.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void viewFeeDetails(Student student) {
        List<Fee> feesList = school.getFees();
        List<Fee> studentFees = feesList.stream()
                .filter(f -> f.getStudentId() == student.getId())
                .toList();

        if (studentFees.isEmpty()) {
            System.out.println("No fee records found for this student.");
            return;
        }

        System.out.println("\n--- Fee Details for " + student.getName() + " ---");
        for (Fee f : studentFees) {
            System.out.println(f);
            System.out.println("Status: " + (f.isPaid() ? "PAID" : "PENDING"));
        }

        // Option to make payment
        System.out.print("\nMake a payment? (Y/N): ");
        String response = scanner.nextLine().trim().toUpperCase();
        if (response.equals("Y") || response.equals("YES")) {
            makePayment(student, studentFees);
        }
    }

    private void makePayment(Student student, List<Fee> studentFees) {
        if (studentFees.isEmpty()) {
            System.out.println("No pending fees to pay.");
            return;
        }

        Fee latestFee = studentFees.get(studentFees.size() - 1);
        System.out.print("Payment Amount: ");
        double paymentAmount = getDoubleInput();

        try {
            latestFee.updatePayment(paymentAmount);
            System.out.println("Payment recorded successfully!");
            System.out.println("New Balance: " + latestFee.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private int getIntInput() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine();
            System.out.println("Invalid input. Please enter a number.");
            return -1;
        }
    }

    private double getDoubleInput() {
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            scanner.nextLine();
            System.out.println("Invalid input. Please enter a valid number.");
            return -1;
        }
    }

    @Override
    public void close() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
