package kh.com.wa.data.jpa.repository;

import kh.com.wa.data.jpa.enity.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerDbSeeder implements CommandLineRunner {
    private CustomerRepository customerRepository;

    public CustomerDbSeeder(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Customer customer1 = new Customer("nhan", "81-hcm","096186");
        Customer customer2 = new Customer("Ynhu", "456-hcm","017896");
        List<Customer> customers = new ArrayList<>();

        customers.add(customer1);
        customers.add(customer2);
        this.customerRepository.saveAll(customers);
    }
}
