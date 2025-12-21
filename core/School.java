package core;

import model.*;
import java.util.ArrayList;

public class School {

    public ArrayList<Student> students = new ArrayList<>();
    public ArrayList<Teacher> teachers = new ArrayList<>();
    public ArrayList<Course> courses = new ArrayList<>();
    public ArrayList<Attendance> attendanceList = new ArrayList<>();
    public ArrayList<Result> results = new ArrayList<>();
    public ArrayList<Fee> fees = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void addTeacher(Teacher t) {
        teachers.add(t);
    }

    public void addCourse(Course c) {
        courses.add(c);
    }
}
