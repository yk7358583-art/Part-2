Description
This component handles all operations related to courses in the University Management System.
It allows the system to create, read, update, and delete courses (CRUD operations), track enrolled students, and manage course prerequisites.
2. Features
Create a Course: Add a new course with attributes like Course ID, Name, Credit Hours, Capacity, and Prerequisites.
View Courses: List all courses with details.
Update Course: Edit course information, including name, capacity, or prerequisites.
Delete Course: Remove a course from the system.
Check Capacity: Ensure enrollment does not exceed the maximum allowed.
Prerequisite Validation: Support prerequisite courses for enrollment checks.
3. Classes
Course
Represents a course with fields like:
courseId
courseName
creditHours
capacity
prerequisites
enrolledStudents
CourseManager
Handles all CRUD operations:
addCourse()
updateCourse()
deleteCourse()
viewCourses()
checkCapacity()
4. File Structure
نسخ التعليمات البرمجية

/com/university/course
 ├── Course.java          # Course class
 ├── CourseManager.java   # Handles CRUD operations
 └── Main.java            # To test Course component
5. How to Use
Compile Java files:
نسخ التعليمات البرمجية

javac Course.java CourseManager.java Main.java
Run Main class:
نسخ التعليمات البرمجية

java Main
Follow the menu to:
Add a course
View courses
Update a course
Delete a course
6. OOP Principles Demonstrated
Encapsulation: All class fields are private, accessed via getters/setters.
Abstraction: CourseManager hides internal data structure and provides simple methods.
Inheritance: Can extend Course for future course types (optional).
Polymorphism: Methods like displayCourseInfo() can be overridden for different course types (optional).
7. Design Decisions
Used ArrayList to store courses for easy addition/removal.
Prerequisites stored as a list of Course IDs for easy checking.
All CRUD operations validate input to prevent errors (e.g., duplicate Course ID, invalid capacity).
8. Author
Student Name: __________
Component: Course Management (Component 2)
