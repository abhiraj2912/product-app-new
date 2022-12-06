package com.example.productappnewbackend.dao;

import com.example.productappnewbackend.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Integer> {
}
