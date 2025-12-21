package model;

public class Attendance {
    private int studentId;
    private String courseCode;
    private boolean present;

    public Attendance(int studentId, String courseCode, boolean present) {
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.present = present;
    }

    public String toString() {
        return "Student ID: " + studentId +
               ", Course: " + courseCode +
               ", Present: " + present;
    }
}