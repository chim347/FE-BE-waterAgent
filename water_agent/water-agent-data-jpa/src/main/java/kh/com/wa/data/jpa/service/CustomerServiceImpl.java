package kh.com.wa.data.jpa.service;

import kh.com.wa.data.jpa.enity.Customer;
import kh.com.wa.data.jpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> fetchCustomerList() {
        return (List<Customer>) customerRepository.findAll() ;
    }

    @Override
    public Customer updateCustomer(Customer customer, Integer id) {
        return null;
    }

    @Override
    public void deleteDepartmentById(Integer id) {

    }
}
