package OOP_Intro_ReCap;

public class Main {
    public static void main(String[] args) {
        Course course1=new Course();
        course1.id=1;
        course1.name="Java";
        course1.title="Java & React Kursu";
        course1.instructor="Engin Demirog";

        Course course2=new Course(2,"C#","C# & Angular Kursu","Engin Demirog");

        Course[] courses={course1,course2};

        CourseManager courseManager=new CourseManager();

        courseManager.showCourses(courses);

        courseManager.registerCourse(course1);
    }
}
