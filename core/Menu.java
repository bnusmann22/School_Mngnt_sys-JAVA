package core;

import model.*;
import java.util.Scanner;

public class Menu {

    private School school = new School();
    private Scanner sc = new Scanner(System.in);

    public void show() {

        while (true) {
            System.out.println("\n=== School Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Level: ");
                String level = sc.nextLine();

                school.addStudent(new Student(id, name, level));
                System.out.println("Student added!");

            } else if (choice == 2) {
                for (Student s : school.students) {
                    System.out.println(s);
                }

            } else if (choice == 3) {
                break;
            }
        }
    }
}
