package model;

/**
 * Teacher model class representing a teacher in the school system.
 */
public class Teacher {
    private final int id;
    private final String name;
    private final String courseAssigned;

    public Teacher(int id, String name, String courseAssigned) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Teacher name cannot be empty");
        }
        if (courseAssigned == null || courseAssigned.trim().isEmpty()) {
            throw new IllegalArgumentException("Course assigned cannot be empty");
        }
        this.id = id;
        this.name = name.trim();
        this.courseAssigned = courseAssigned.trim();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourseAssigned() {
        return courseAssigned;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (Course: " + courseAssigned + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return id == teacher.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}