package khannedy.designpattern.facade.facade;

import khannedy.designpattern.facade.entity.Address;
import khannedy.designpattern.facade.entity.Customer;
import khannedy.designpattern.facade.repository.AddressRepository;
import khannedy.designpattern.facade.repository.CustomerRepository;

public class CustomerFacade {

  private CustomerRepository customerRepository = new CustomerRepository();

  private AddressRepository addressRepository = new AddressRepository();

  public void save(Customer customer){
    customerRepository.save(customer);

    for(Address address : customer.getAddresses()){
      addressRepository.save(address);
    }
  }

}
