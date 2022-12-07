package com.example.productappnewbackend.controller;

import com.example.productappnewbackend.dao.ProductDao;
import com.example.productappnewbackend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao dao;

    @CrossOrigin("*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> AddProduct(@RequestBody Product p){
        dao.save(p);
        HashMap<String,String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin("*")
    @GetMapping("/view")
    public List<Product> ViewAll(){
        return (List<Product>) dao.findAll();
    }
}
