package ReCap_HomeWork;

public class Student extends User {
    private Course[] courses;

    public Student(Course[] courses) {
        this.setCourses(courses);
    }

    public Student(){

    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
