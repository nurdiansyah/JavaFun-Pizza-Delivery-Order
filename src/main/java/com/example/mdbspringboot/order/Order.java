package com.example.mdbspringboot.order;


import com.example.mdbspringboot.customer.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
@Document(collection = "orders")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    private String id;
    private String dateNow;
    private Customer customer;
    private List<Item> items;
}
