package com.example.mdbspringboot.order;

import com.example.mdbspringboot.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private Product product;
    private int qty;
}
