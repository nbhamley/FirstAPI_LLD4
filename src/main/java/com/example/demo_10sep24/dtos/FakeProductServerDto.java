package com.example.demo_10sep24.dtos;

import com.example.demo_10sep24.models.Category;
import lombok.Data;

@Data
public class FakeProductServerDto {
    private long id;
    private String title;
    private String description;
    private double price;
    private String image;
    private String category;
}
