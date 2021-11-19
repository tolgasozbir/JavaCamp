package ReCap_HomeWork;

public class Main {
    public static void main(String[] args) {
        //Create Instructor
        Instructor enginDemirog=new Instructor();
        enginDemirog.setId(1);
        enginDemirog.setFirstName("Engin");
        enginDemirog.setLastName("Demirog");
        enginDemirog.setEmail("EnginDemirog@gmail.com");
        enginDemirog.setPassword("123456");
        enginDemirog.setExperience("Sertifikalar : MCT ,PMP ,ITIL");
        enginDemirog.setProgrammingLanguages(new String[]{"C#","Java","Dart","JavaScript"});

        //Add Instructor
        InstructorManager instructorManager=new InstructorManager();
        instructorManager.add(enginDemirog);
        //Show Instructors
        instructorManager.showInstructors(new Instructor[]{enginDemirog});


        //Create Course
        Course courseCsharp=new Course(1,"C#",enginDemirog);
        Course courseJava=new Course(2,"Java",enginDemirog);

        //Add Course
        CourseManager courseManager =new CourseManager();
        courseManager.addCourse(courseCsharp);
        courseManager.addCourse(courseJava);
        System.out.println("\n");
        //Show Courses
        courseManager.showCourses(new Course[]{courseCsharp,courseJava});

        //Create Student
        Student student1=new Student();
        student1.setId(1);
        student1.setFirstName("Tolga");
        student1.setLastName("Sözbir");
        student1.setEmail("tolgasoz1@gmail.com");
        student1.setPassword("123123");
        student1.setCourses(null);

        Student student2=new Student();
        student2.setId(2);
        student2.setFirstName("Levent");
        student2.setLastName("Orhan");
        student2.setEmail("Lewo@gmail.com");
        student2.setPassword("123123");
        student2.setCourses(new Course[]{courseJava,courseCsharp});

        //Add Student
        StudentManager studentManager=new StudentManager();
        studentManager.add(student1);
        studentManager.add(student2);
        System.out.println("\n");
        //show Students
        studentManager.showStudents(new Student[]{student1,student2});


    }
}
