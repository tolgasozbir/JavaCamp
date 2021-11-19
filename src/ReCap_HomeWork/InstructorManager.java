package ReCap_HomeWork;

public class InstructorManager extends UserManager{
    public void add(Instructor instructor){
        System.out.println("Eğitmen Eklendi : " + instructor.getFirstName() + " " +instructor.getLastName());
    }

    public void showInstructors(Instructor[] instructors){
        System.out.println("\nEğitmen Listesi\n");
        for (Instructor instructor:instructors) {
            System.out.println(instructor.getFirstName() + " " +instructor.getLastName());
            System.out.println(instructor.getEmail());
            System.out.println(instructor.getExperience());
            for (String language:instructor.getProgrammingLanguages()) {
                System.out.print(language + " ");
            }
            System.out.println("\n");
        }
    }
}
