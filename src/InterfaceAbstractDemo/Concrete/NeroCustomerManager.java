package InterfaceAbstractDemo.Concrete;

import InterfaceAbstractDemo.Abstract.BaseCustomerManager;
import InterfaceAbstractDemo.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
    @Override
    public void save(Customer customer) {
        super.save(customer);
    }
}
