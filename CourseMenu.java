package com.university.course;

import java.util.Scanner;

public class CourseMenu {

    private CourseService courseService;
    private Scanner scanner = new Scanner(System.in);

    public CourseMenu(CourseService courseService) {
        this.courseService = courseService;
    }

    public void showMenu() {
        int choice;
        do {
            System.out.println("\n--- Course Management ---");
            System.out.println("1. Add Course");
            System.out.println("2. View Courses");
            System.out.println("3. Update Course");
            System.out.println("4. Delete Course");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addCourse();
                case 2 -> courseService.viewAllCourses();
                case 3 -> updateCourse();
                case 4 -> deleteCourse();
            }
        } while (choice != 0);
    }

    private void addCourse() {
        System.out.print("Course Code: ");
        String code = scanner.nextLine();

        System.out.print("Course Name: ");
        String name = scanner.nextLine();

        System.out.print("Credit Hours: ");
        int credits = scanner.nextInt();

        System.out.print("Capacity: ");
        int capacity = scanner.nextInt();

        courseService.addCourse(new Course(code, name, credits, capacity));
    }

    private void updateCourse() {
        System.out.print("Enter Course Code: ");
        String code = scanner.nextLine();

        System.out.print("New Name: ");
        String name = scanner.nextLine();

        System.out.print("New Credits: ");
        int credits = scanner.nextInt();

        System.out.print("New Capacity: ");
        int capacity = scanner.nextInt();

        courseService.updateCourse(code, name, credits, capacity);
    }

    private void deleteCourse() {
        System.out.print("Enter Course Code: ");
        String code = scanner.nextLine();
        courseService.deleteCourse(code);
    }
}
