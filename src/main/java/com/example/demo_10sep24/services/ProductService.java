package com.example.demo_10sep24.services;

import com.example.demo_10sep24.models.Product;

import java.util.List;

public interface ProductService {

    public Product getProductById(long id);

    public List<Product> getAllProducts();
}
