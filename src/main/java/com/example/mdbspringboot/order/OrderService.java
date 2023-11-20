package com.example.mdbspringboot.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public Order add (Order order){
        order.setId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(order);
    }

    public List<Order> findAll (){
        return repository.findAll();
    }

    public Order update(String id, Order updatedOrder) {
        Order existingOrder = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pesanan tidak ditemukan dengan ID: " + id));

        existingOrder.setDateNow(updatedOrder.getDateNow());
        existingOrder.setCustomer(updatedOrder.getCustomer());
        existingOrder.setItems(updatedOrder.getItems());
        return repository.save(existingOrder);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
