package com.example.productappnewbackend.controller;

import com.example.productappnewbackend.dao.ProductDao;
import com.example.productappnewbackend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductDao dao;

    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String AddProduct(@RequestBody Product p){
        dao.save(p);
        return "Product added Successfully";
    }
}
