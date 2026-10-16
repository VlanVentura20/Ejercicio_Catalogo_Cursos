package org.cuatrovientos;

public class Course {

    private long id;
    private String name;
    private int capacity;
    private int availableSeats;
    private String teacher;
    private String description;

    public Course(long id, String name, int capacity, int availableSeats, String teacher, String description) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.availableSeats = availableSeats;
        this.teacher = teacher;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}