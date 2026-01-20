package Com.university.courses;

public class Course {

    // Encapsulation: private variables to protect data
    private String courseId;
    private String courseName;
    private int capacity;
    private int enrolledCount;

    public Course(String courseId, String courseName, int capacity) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.capacity = capacity;
        this.enrolledCount = 0;
    }

    // Getters: safe access to data
    public String getCourseName() { return courseName; }
    public String getCourseId() { return courseId; }
    
    // Method to check if there is available space (Validation)
    public boolean hasSpace() {
        return enrolledCount < capacity;
    }

    // Increase enrolled count when a new student enrolls
    public void enrollStudent() {
        if (hasSpace()) {
            enrolledCount++;
        }
    }

    // Display course information
    public void displayCourseInfo() {
        System.out.println(courseId + ": " + courseName +
                " (Capacity: " + enrolledCount + "/" + capacity + ")");
    }
}