package khannedy.designpattern.facade;

import khannedy.designpattern.facade.entity.Account;
import khannedy.designpattern.facade.entity.Address;
import khannedy.designpattern.facade.entity.Customer;
import khannedy.designpattern.facade.facade.BankFacade;
import khannedy.designpattern.facade.facade.CustomerFacade;
import khannedy.designpattern.facade.repository.AccountRepository;
import khannedy.designpattern.facade.repository.AddressRepository;
import khannedy.designpattern.facade.repository.CustomerRepository;

public class FacadeApp {

  public static void main(String[] args) {

    Customer customer = new Customer("1", "Eko");

    Address address1 = new Address("1", "Subang", "Indonesia");
    Address address2 = new Address("2", "Jakarta", "Indonesia");

    customer.getAddresses().add(address1);
    customer.getAddresses().add(address2);

    CustomerFacade customerFacade = new CustomerFacade();
    customerFacade.save(customer);

    // ===========================

    BankFacade bankFacade = new BankFacade();
    bankFacade.transfer("0001", "0002", 1000000L);
    bankFacade.transfer("0003", "0004", 500000L);
  }

}
