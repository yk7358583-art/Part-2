package com.university.course;

import java.util.ArrayList;
import java.util.List;

public class CourseService {

    private List<Course> courses = new ArrayList<>();

    // CREATE
    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course added successfully.");
    }

    // READ
    public void viewAllCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }
        for (Course c : courses) {
            c.displayCourse();
        }
    }

    // UPDATE
    public void updateCourse(String courseCode, String newName, int newCredits, int newCapacity) {
        for (Course c : courses) {
            if (c.getCourseCode().equalsIgnoreCase(courseCode)) {
                c.setCourseName(newName);
                c.setCreditHours(newCredits);
                c.setCapacity(newCapacity);
                System.out.println("Course updated successfully.");
                return;
            }
        }
        System.out.println("Course not found.");
    }

    // DELETE
    public void deleteCourse(String courseCode) {
        boolean removed = courses.removeIf(
                c -> c.getCourseCode().equalsIgnoreCase(courseCode)
        );

        if (removed) {
            System.out.println("Course deleted successfully.");
        } else {
            System.out.println("Course not found.");
        }
    }

    // Helper method
    public Course findCourseByCode(String courseCode) {
        for (Course c : courses) {
            if (c.getCourseCode().equalsIgnoreCase(courseCode)) {
                return c;
            }
        }
        return null;
    }
            }
