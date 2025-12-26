package model;

/**
 * Attendance model class tracking student attendance for courses.
 */
public class Attendance {
    private final int studentId;
    private final String courseCode;
    private final boolean present;

    public Attendance(int studentId, String courseCode, boolean present) {
        if (courseCode == null || courseCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Course code cannot be empty");
        }
        this.studentId = studentId;
        this.courseCode = courseCode.trim();
        this.present = present;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public boolean isPresent() {
        return present;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId +
               ", Course: " + courseCode +
               ", Present: " + present;
    }
}