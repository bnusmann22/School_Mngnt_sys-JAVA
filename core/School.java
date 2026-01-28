package core;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class School {
    public List<Student> students = new ArrayList<>();
    public List<Teacher> teachers = new ArrayList<>();
    public List<Course> courses = new ArrayList<>();
    public List<Attendance> attendanceList = new ArrayList<>();
    public List<Result> results = new ArrayList<>();
    public List<Fee> fees = new ArrayList<>();
}
