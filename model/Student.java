package model;

public class Student {
    private int id;
    private String name;
    private String level;

    public Student(int id, String name, String level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public String toString() {
        return id + " - " + name + " (" + level + ")";
    }
}