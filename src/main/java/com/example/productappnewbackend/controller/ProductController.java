package com.example.productappnewbackend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String AddProduct(){
        return "Product added Successfully";
    }
}
