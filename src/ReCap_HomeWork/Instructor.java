package ReCap_HomeWork;

public class Instructor extends User{
    private String experience;
    private String[] programmingLanguages;

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }
}
