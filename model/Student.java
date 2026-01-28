package model;

public class Student {
    public int id;
    public String name;
    public String level;

    public Student(int id, String name, String level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public void display() {
        System.out.println(id + " - " + name + " (" + level + ")");
    }
}