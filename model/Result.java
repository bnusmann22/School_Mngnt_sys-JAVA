package model;

public class Result {
    private int studentId;
    private String courseCode;
    private int score;

    public Result(int studentId, String courseCode, int score) {
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.score = score;
    }

    public String getGrade() {
        if (score >= 70) return "A";
        if (score >= 60) return "B";
        if (score >= 50) return "C";
        if (score >= 45) return "D";
        return "F";
    }

    public String toString() {
        return "Student ID: " + studentId +
               ", Course: " + courseCode +
               ", Score: " + score +
               ", Grade: " + getGrade();
    }
}