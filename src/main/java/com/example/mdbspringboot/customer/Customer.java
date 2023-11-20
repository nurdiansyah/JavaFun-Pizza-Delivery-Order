package com.example.mdbspringboot.customer;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Customer {
    @Id
    private String id;
    private String name;
    private String address;
    private String phone;
}
