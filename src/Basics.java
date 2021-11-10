public class Basics {
    public static void main(String[] args) {
        variables();
        ifElse();
        loops();
    }

    public static void variables(){
        int num=55;
        int credit=10000;
        double average=12.5;
        String name="Tolga";
        boolean isLogin=false;

        System.out.println("number: "+num);
        System.out.println(credit);
        System.out.println(average);
        System.out.println("Name "+name);
        System.out.println("logged? " +isLogin);
    }

    private static void ifElse() {
        int value=32;

        if (value >= 55 && value <= 100) {
            System.out.println("successful");
        }
        else if(value<55)
            System.out.println("unsuccessful");
        else{
            System.out.println("invalid value");
        }
    }

    private static void loops() {
        System.out.println("********** for **********");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        /////////////
        System.out.println("********** while **********");
        int num=10;
        while (num<=100){
            System.out.println(num);
            num+=10;
        }

        /////////////
        System.out.println("**********  do while **********");
        int num2=1;
        do {
            System.out.println(num2);
            num2++;
        }while (num2>2);
    }

}
