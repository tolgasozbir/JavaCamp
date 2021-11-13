package OOP_Intro_ReCap;

public class Course {
    int id;
    String name;
    String title;
    String instructor;

    public Course(){
        System.out.println("This is Constructor");
    }

    public Course(int id,String name, String title,String instructor){
        this.id=id;
        this.name=name;
        this.title=title;
        this.instructor=instructor;
    }

}
