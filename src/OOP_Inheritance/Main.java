package OOP_Inheritance;

public class Main {
    public static void main(String[] args) {
        IndividualCustomer tolga=new IndividualCustomer();
        tolga.customerNumber="123";

        CorporateCustomer hepsiBurada=new CorporateCustomer();
        hepsiBurada.customerNumber="321";

        CustomerManager customerManager=new CustomerManager();

        Customer[] customers={tolga,hepsiBurada};

        customerManager.addMultiple(customers);

    }
}
