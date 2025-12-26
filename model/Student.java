package model;

/**
 * Student model class representing a student in the school system.
 */
public class Student {
    private final int id;
    private final String name;
    private final String level;

    public Student(int id, String name, String level) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be empty");
        }
        if (level == null || level.trim().isEmpty()) {
            throw new IllegalArgumentException("Student level cannot be empty");
        }
        this.id = id;
        this.name = name.trim();
        this.level = level.trim();
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

    @Override
    public String toString() {
        return id + " - " + name + " (" + level + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}