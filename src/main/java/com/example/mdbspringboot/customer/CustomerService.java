package com.example.mdbspringboot.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public Customer add (Customer customer){
        customer.setId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(customer);
    }

    public List<Customer> findAll (){
        return repository.findAll();
    }

    public Customer update(String id, Customer updatedCustomer) {
        // Cari pelanggan berdasarkan ID
        Customer existingCustomer = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pelanggan tidak ditemukan dengan ID: " + id));

        // Update data pelanggan dengan data yang baru
        existingCustomer.setName(updatedCustomer.getName());
        existingCustomer.setAddress(updatedCustomer.getAddress());
        existingCustomer.setPhone(updatedCustomer.getPhone());

        // Simpan perubahan ke database
        return repository.save(existingCustomer);
    }

    public void delete(String id) {
        // Hapus pelanggan berdasarkan ID
        repository.deleteById(id);
    }

}
