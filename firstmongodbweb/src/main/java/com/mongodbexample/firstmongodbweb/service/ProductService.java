package com.mongodbexample.firstmongodbweb.service;


import com.mongodbexample.firstmongodbweb.model.Product;
import com.mongodbexample.firstmongodbweb.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public void addProduct(Product product) {
        productRepo.save(product);
    }

    public List<Product> findByName(String name) {
        return productRepo.findByName(name);
    }
}
