package ReCap_HomeWork;

public class StudentManager extends UserManager{
    public void registeredCourses(){

    }

    public void showStudents(Student[] students){
        System.out.println("Öğrenci Listesi");
        for (Student student:students) {
            System.out.println("Adı Soyadı : " +student.getFirstName() + " " + student.getLastName());
            System.out.println("E-Mail : " +student.getEmail());
            System.out.println("Kayıtlı olduğu Kurslar");
            if (student.getCourses() == null){
                System.out.println("Kayıt Olduğu Kurs Yok");
            }else{
                for (Course course:student.getCourses()) {
                    System.out.println(course.getCourseName() + " " +
                            course.getCourseInstructor().getFirstName() + " " + course.getCourseInstructor().getLastName());
                }
            }
            System.out.println("---");
        }
    }
}
