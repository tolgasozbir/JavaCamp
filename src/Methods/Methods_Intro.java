package Methods;

public class Methods_Intro {
    public static void main(String[] args) {
        add();
        delete();
        update();

        int number=addition(5,7);
        System.out.println(number);

        System.out.println(addition(7,15));

        showCity("Kocaeli");
    }

    public static void add(){
        System.out.println("Added");
    }

    public static void delete(){
        System.out.println("Deleted");
    }

    public static void update(){
        System.out.println("Updated");
    }

    public static int addition(int num1,int num2){
        return num1+num2;
    }

    public static String showCity(String city){
        System.out.println(city);
        return city;
    }
}
