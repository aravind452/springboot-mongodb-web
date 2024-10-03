package com.mongodbexample.firstmongodbweb.repo;

import com.mongodbexample.firstmongodbweb.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepo extends MongoRepository<Product,String> {
    List<Product> findByName(String name);
}
