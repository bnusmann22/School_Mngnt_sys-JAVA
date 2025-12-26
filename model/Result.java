package model;

/**
 * Result model class representing student academic results.
 */
public class Result {
    private static final int GRADE_A_THRESHOLD = 70;
    private static final int GRADE_B_THRESHOLD = 60;
    private static final int GRADE_C_THRESHOLD = 50;
    private static final int GRADE_D_THRESHOLD = 45;

    private final int studentId;
    private final String courseCode;
    private final int score;

    public Result(int studentId, String courseCode, int score) {
        if (courseCode == null || courseCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Course code cannot be empty");
        }
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
        this.studentId = studentId;
        this.courseCode = courseCode.trim();
        this.score = score;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getScore() {
        return score;
    }

    public String getGrade() {
        if (score >= GRADE_A_THRESHOLD) return "A";
        if (score >= GRADE_B_THRESHOLD) return "B";
        if (score >= GRADE_C_THRESHOLD) return "C";
        if (score >= GRADE_D_THRESHOLD) return "D";
        return "F";
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId +
               ", Course: " + courseCode +
               ", Score: " + score +
               ", Grade: " + getGrade();
    }
}