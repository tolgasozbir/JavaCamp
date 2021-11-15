package Classes.Intro;

import Classes_Intro.CustomerManager;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager();
        customerManager.add();
        customerManager.delete();
        customerManager.update();
    }
}
