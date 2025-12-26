package core;

import model.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Core School class managing all entities and operations.
 */
public class School {

    private final List<Student> students;
    private final List<Teacher> teachers;
    private final List<Course> courses;
    private final List<Attendance> attendanceList;
    private final List<Result> results;
    private final List<Fee> fees;

    public School() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.attendanceList = new ArrayList<>();
        this.results = new ArrayList<>();
        this.fees = new ArrayList<>();
    }

    public void addStudent(Student s) {
        if (s != null) {
            students.add(s);
        }
    }

    public void addTeacher(Teacher t) {
        if (t != null) {
            teachers.add(t);
        }
    }

    public void addCourse(Course c) {
        if (c != null) {
            courses.add(c);
        }
    }

    public void addAttendance(Attendance a) {
        if (a != null) {
            attendanceList.add(a);
        }
    }

    public void addResult(Result r) {
        if (r != null) {
            results.add(r);
        }
    }

    public void addFee(Fee f) {
        if (f != null) {
            fees.add(f);
        }
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public List<Teacher> getTeachers() {
        return new ArrayList<>(teachers);
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    public List<Attendance> getAttendanceList() {
        return new ArrayList<>(attendanceList);
    }

    public List<Result> getResults() {
        return new ArrayList<>(results);
    }

    public List<Fee> getFees() {
        return new ArrayList<>(fees);
    }
}
