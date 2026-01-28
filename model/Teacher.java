package model;

public class Teacher {
    public int id;
    public String name;
    public String courseAssigned;

    public Teacher(int id, String name, String courseAssigned) {
        this.id = id;
        this.name = name;
        this.courseAssigned = courseAssigned;
    }

    public void display() {
        System.out.println(id + " - " + name + " (Course: " + courseAssigned + ")");
    }
}