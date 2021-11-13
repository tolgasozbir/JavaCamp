package OOP_Intro_ReCap;

public class CourseManager {
    public void showCourses(Course[] courses){
        for (Course course:courses) {
            System.out.println("Course : " + course.name);
            System.out.println(course.title);
            System.out.println("Instructor : "+course.instructor);
            System.out.println("Price : Free");
            System.out.println("-----------------");
        }
    }

    public void registerCourse(Course course){
        System.out.println("You attended the " +course.name+ " course");
    }
}
