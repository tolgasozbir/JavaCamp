package InterfaceAbstractDemo.Concrete;

import InterfaceAbstractDemo.Abstract.BaseCustomerManager;
import InterfaceAbstractDemo.Abstract.PersonCheckService;
import InterfaceAbstractDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

    private PersonCheckService personCheckService;

    public StarbucksCustomerManager(PersonCheckService personCheckService){
        this.personCheckService=personCheckService;
    }

    @Override
    public void save(Customer customer) {
        if (personCheckService.checkIfRealPerson(customer)){
            System.out.println("Saved to db Starbucks : " + customer.getFirstName());
        }else {
            System.out.println("Not a valid person");
        }
    }
}
