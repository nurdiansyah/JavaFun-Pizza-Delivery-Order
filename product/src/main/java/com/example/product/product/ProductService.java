package com.example.product.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product addProduct (Product product){
        product.setId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(product);
    }

    public List<Product> findAllProducts (){
        return repository.findAll();
    }

    public Product update(String id, Product updatedProduct) {
        // Cari produk berdasarkan ID
        Product existingProduct = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produk tidak ditemukan dengan ID: " + id));

        // Update data produk dengan data yang baru
        existingProduct.setImageNetwork(updatedProduct.getImageNetwork());
        existingProduct.setName(updatedProduct.getName());
        existingProduct.setCategory(updatedProduct.getCategory());
        existingProduct.setDesc(updatedProduct.getDesc());
        existingProduct.setIconPrep(updatedProduct.getIconPrep());
        existingProduct.setIconCook(updatedProduct.getIconCook());
        existingProduct.setIconPrice(updatedProduct.getIconPrice());
        existingProduct.setBonusBundling(updatedProduct.getBonusBundling());
        // Simpan perubahan ke database
        return repository.save(existingProduct);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
