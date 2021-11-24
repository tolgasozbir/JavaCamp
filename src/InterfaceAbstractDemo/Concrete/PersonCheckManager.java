package InterfaceAbstractDemo.Concrete;

import InterfaceAbstractDemo.Abstract.PersonCheckService;
import InterfaceAbstractDemo.Entities.Customer;

public class PersonCheckManager implements PersonCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return false;
    }
}
