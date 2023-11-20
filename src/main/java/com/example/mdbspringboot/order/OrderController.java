package com.example.mdbspringboot.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService service;

    @PostMapping
    public Order create(@RequestBody Order order){
        return service.add(order);
    }

    @GetMapping
    public List<Order> get(){
        return service.findAll();
    }

    @PutMapping("/{id}")
    public Order update(@PathVariable String id, @RequestBody Order updatedOrder) {
        return service.update(id, updatedOrder);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
