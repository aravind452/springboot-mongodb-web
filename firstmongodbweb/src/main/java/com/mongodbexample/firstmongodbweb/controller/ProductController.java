package com.mongodbexample.firstmongodbweb.controller;


import com.mongodbexample.firstmongodbweb.model.Product;
import com.mongodbexample.firstmongodbweb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/addproduct")
    public void addProduct(@RequestBody  Product product) {
        productService.addProduct(product);
    }

    @GetMapping("/search")
    public List<Product> findByName(String name) {
        return productService.findByName(name);
    }
}
