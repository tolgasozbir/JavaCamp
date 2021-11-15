package Methods;

public class Methods2 {
    public static void main(String[] args) {
        int sum = addition(2,6,7,9,1,5);
        System.out.println(sum);

        int[] numbers={2,3,5,4,6,8};
        System.out.println(addition2(numbers));
    }

    public static int addition(int... numbers){
        int sum=0;
        for (int num:numbers) {
            sum+=num;
        }

        return sum;
    }

    public static int addition2(int[] numbers){
        int sum=0;
        for (int num:numbers) {
            sum+=num;
        }

        return sum;
    }
}
