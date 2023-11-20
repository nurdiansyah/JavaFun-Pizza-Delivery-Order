package com.example.mdbspringboot.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping
    public Customer create(@RequestBody Customer customer){
        return service.add(customer);
    }

    @GetMapping
    public List<Customer> get(){
        return service.findAll();
    }

    @PutMapping("/{id}")
    public Customer update(@PathVariable String id, @RequestBody Customer updatedCustomer) {
        return service.update(id, updatedCustomer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
