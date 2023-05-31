package kh.com.wa.data.jpa.service;

import kh.com.wa.data.jpa.enity.Customer;
import kh.com.wa.data.jpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomerService {
    //save
    Customer saveCustomer(Customer customer);

    //read
    List<Customer> fetchCustomerList();

    //update
    Customer updateCustomer(Customer customer, Integer id);

    //delete
    void deleteDepartmentById(Integer id);
}
