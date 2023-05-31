package kh.com.wa.rest.controller;

import kh.com.wa.data.jpa.enity.Customer;
import kh.com.wa.data.jpa.enity.ResponseObject;
import kh.com.wa.data.jpa.repository.CustomerRepository;
import kh.com.wa.data.jpa.service.CustomerService;
import kh.com.wa.rest.dto.TestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/api")
public class PingEndpoint {
    @Autowired
    private CustomerRepository customerRepository;


    @GetMapping("/ping")
    @CrossOrigin
    public ResponseEntity<TestDTO> ping() {
        LOG.info("Ping endpoint reached");
        return ResponseEntity.ok(new TestDTO("pong"));
    }

//    @PostMapping("/new")
//    @CrossOrigin
//    public List<Customer> createCustomer(@RequestBody Customer newCustomer) {
////        List<Customer> foundCustomer = repository.findByPhoneCustomer(newCustomer.getPhone().trim());
////        if(foundCustomer.size() > 0) {
////            return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(
////                    new ResponseObject("Failed", "Have a customer to registry by phone", "")
////            );
////        }
////        return ResponseEntity.status(HttpStatus.OK).body(
////                    new ResponseObject("Success", "Insert Customer Successfully", repository.save(newCustomer))
////        );
//        return customerService.saveCustomer(newCustomer);
//    }

    @GetMapping("/customer/{id}")
    public Optional<Customer> getCustomer(@PathVariable Integer id) {
        Optional<Customer> customers = this.customerRepository.findById(id);
        return customers;
    }


}
