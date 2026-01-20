package Com.university.courses;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    // List to store all courses
    private List<Course> courses;

    public CourseManager() {
        this.courses = new ArrayList<>();
    }

    // Add a new course to the system
    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course added: " + course.getCourseName());
    }

    // Find a course by its ID
    public Course findCourseById(String courseId) {
        for (Course c : courses) {
            if (c.getCourseId().equalsIgnoreCase(courseId)) {
                return c;
            }
        }
        return null; // Return null if not found
    }

    // Enroll a student into a specific course
    public void enrollStudentInCourse(String courseId) {
        Course course = findCourseById(courseId);
        
        if (course != null) {
            if (course.hasSpace()) {
                course.enrollStudent();
                System.out.println("Successfully enrolled in: " + course.getCourseName());
            } else {
                System.out.println("Error: Course " + course.getCourseName() + " is full.");
            }
        } else {
            System.out.println("Error: Course ID " + courseId + " not found.");
        }
    }

    // Display status of all courses
    public void displayAllCourses() {
        System.out.println("\n--- University Course List ---");
        for (Course c : courses) {
            c.displayCourseInfo();
        }
    }
}
