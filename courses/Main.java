package Com.university.courses;

public class Main {
    public static void main(String[] args) {
        // 1. Create the CourseManager object
        CourseManager manager = new CourseManager();

        // 2. Create some Course objects
        Course javaCourse = new Course("CS101", "Java Programming", 2); // Capacity: 2
        Course dbCourse = new Course("DB202", "Database Systems", 30);

        // 3. Add courses to the manager
        System.out.println("--- Initializing System ---");
        manager.addCourse(javaCourse);
        manager.addCourse(dbCourse);

        // 4. Display all courses
        manager.displayAllCourses();

        // 5. Test Enrolling students (Testing Capacity)
        System.out.println("\n--- Testing Enrollment ---");
        manager.enrollStudentInCourse("CS101"); // Student 1
        manager.enrollStudentInCourse("CS101"); // Student 2
        manager.enrollStudentInCourse("CS101"); // Student 3 (Should fail - Full)

        // 6. Test Enrolling in a non-existent course
        manager.enrollStudentInCourse("ENG101"); // (Should fail - Not found)

        // 7. Display final status
        manager.displayAllCourses();
    }
}