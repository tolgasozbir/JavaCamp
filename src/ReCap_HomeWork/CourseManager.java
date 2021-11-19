package ReCap_HomeWork;

public class CourseManager {
    public void addCourse(Course course){
        System.out.println(course.getCourseName() + " Kursu Eklendi");
        System.out.println("Eğitmen : " + course.getCourseInstructor().getFirstName() + " "
                + course.getCourseInstructor().getLastName());
    }

    public void showCourses(Course[] courses){
        System.out.println("--- Kurslar ---");
        for (Course course:courses){
            System.out.print(course.getCourseName() + " ");
            System.out.println(course.getCourseInstructor().getFirstName() + " " + course.getCourseInstructor().getLastName());
        }
        System.out.println("---------------");
    }
}
