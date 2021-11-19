package ReCap_HomeWork;

public class Course {
    private int courseId;
    private String courseName;
    private User courseInstructor;

    public Course(int courseId, String courseName, User courseInstructor) {
        this.setCourseId(courseId);
        this.setCourseName(courseName);
        this.setCourseInstructor(courseInstructor);
    }

    public Course() {
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public User getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(User courseInstructor) {
        this.courseInstructor = courseInstructor;
    }
}
