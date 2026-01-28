package model;

public class Attendance {
    public int studentId;
    public String courseCode;
    public boolean present;

    public Attendance(int studentId, String courseCode, boolean present) {
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.present = present;
    }

    public void display() {
        System.out.println("Student ID: " + studentId + ", Course: " + courseCode + ", Present: " + present);
    }
}