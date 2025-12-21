package model;

public class Teacher {
    private int id;
    private String name;
    private String courseAssigned;

    public Teacher(int id, String name, String courseAssigned) {
        this.id = id;
        this.name = name;
        this.courseAssigned = courseAssigned;
    }

    public String toString() {
        return id + " - " + name + " (Course: " + courseAssigned + ")";
    }
}