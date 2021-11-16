package OOP_Inheritance;

public class CustomerManager {
    public void add(Customer customer){
        System.out.println(customer.customerNumber + " Added");
    }

    public void addMultiple(Customer[] customers){
        for (Customer customer:customers) {
            add(customer);
        }
    }
}
