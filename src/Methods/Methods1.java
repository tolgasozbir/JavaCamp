package Methods;

public class Methods1 {
    public static void main(String[] args) {
        doSomething();
    }

    public static void doSomething(){
        int num=0;
        if (num>0) {
            showMessage("Bigger than 0 : " + num);
        }
        else if(num<0){
            showMessage("Less than 0 : " + num);
        }
        else {
            showMessage("Equel to 0 : " + num);
        }
    }

    public static void showMessage(String message){
        System.out.println(message);
    }
}
