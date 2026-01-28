package model;

public class Course {
    public String code;
    public String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public void display() {
        System.out.println(code + " - " + title);
    }
}