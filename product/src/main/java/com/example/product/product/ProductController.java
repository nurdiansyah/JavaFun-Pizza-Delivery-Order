package com.example.product.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@RequestMapping("/products")
@RestController
//@Controller (buat tymleaf)
public class ProductController {
    @Autowired
    private ProductService service;
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product){
        return service.addProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.findAllProducts();
    }

    @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable String id, @RequestBody Product updatedProduct) {
        return service.update(id, updatedProduct);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable String id) {
        service.delete(id);
    }
}
