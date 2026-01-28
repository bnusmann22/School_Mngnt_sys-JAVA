package model;

public class Result {
    public int studentId;
    public String courseCode;
    public int score;

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

    public void display() {
        System.out.println("Student ID: " + studentId + ", Course: " + courseCode + 
                         ", Score: " + score + ", Grade: " + getGrade());
    }
}