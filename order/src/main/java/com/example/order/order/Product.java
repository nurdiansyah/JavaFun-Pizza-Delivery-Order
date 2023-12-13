package com.example.order.order;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private String id;
    private String imageNetwork;
    private String name;
    private String category;
    private String desc;
    private String iconPrep;
    private String iconCook;
    private double iconPrice;
    private   List<Bonus> bonusBundling = new ArrayList<>();


}
