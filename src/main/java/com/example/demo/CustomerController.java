package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

//    @GetMapping("/customerDetails/{id}")
//    public Customer getCustomerDetail(@RequestParam (value = "id") Long id){
//        Customer customer = customerRepository.findById(id);
//        return customer;
//    }

//    @GetMapping("/customerDetails/{lastname}")
//    public Customer getCustomerDetail(@RequestParam (value = "lastname") String lastname) {
//        Customer customer = customerRepository.findByLastName("Polu").forEach(bauer -> {
//        });
//        return customer;
//    }
}
