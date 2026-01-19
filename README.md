package com.university.course;

import java.io.Serializable;

public class Course implements Serializable {

    private String courseCode;
    private String courseName;
    private int creditHours;
    private int capacity;

    public Course(String courseCode, String courseName, int creditHours, int capacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.capacity = capacity;
    }

    // Getters
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public int getCapacity() {
        return capacity;
    }

    // Setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void displayCourse() {
        System.out.println(courseCode + " | " + courseName +
                " | Credits: " + creditHours +
                " | Capacity: " + capacity);
    }
}
