package InterfaceAbstractDemo;

import InterfaceAbstractDemo.Abstract.BaseCustomerManager;
import InterfaceAbstractDemo.Concrete.PersonCheckManager;
import InterfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import InterfaceAbstractDemo.Entities.Customer;

public class Main {
    public static void main(String[] args) {
        BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new PersonCheckManager());
        baseCustomerManager.save(new Customer(1,"Tolga","Sözbir","1996","123"));
    }
}
