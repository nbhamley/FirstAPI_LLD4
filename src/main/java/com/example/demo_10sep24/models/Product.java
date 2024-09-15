package com.example.demo_10sep24.models;

import lombok.Data;

@Data
public class Product {
    private long id;
    private String title;
    private String description;
    private double price;
    private String image;
    private Category category;
}
