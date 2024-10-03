package com.mongodbexample.firstmongodbweb.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;


@Configuration
public class Mongoconfig {


    @Bean
    public MongoClient mongoClient(){
        return MongoClients.create("mongodb+srv://aravindaru452:ZiYS9UzxmocA7V5t@cluster0.6qocl.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0");
    }


    @Bean
    public MongoTemplate mongoTemplate(){
        return new MongoTemplate(mongoClient(), "springmongodb");
    }
}
