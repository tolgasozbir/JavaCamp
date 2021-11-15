package Classes.ReCap;

public class Main {
    public static void main(String[] args) {
        MathOperations mathOperations=new MathOperations();
        double sum1 = mathOperations.addition(5,8);
        double sum2 = mathOperations.subtraction(5,8);
        double sum3 = mathOperations.multiplication(5,8);
        double sum4 = mathOperations.division(10,8);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }
}
