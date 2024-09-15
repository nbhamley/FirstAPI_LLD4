package com.example.demo_10sep24.services;

import com.example.demo_10sep24.dtos.FakeProductServerDto;
import com.example.demo_10sep24.models.Category;
import com.example.demo_10sep24.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductServerImpl implements ProductService{

    private RestTemplate restTemplate;

    @Autowired
    public FakeStoreProductServerImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private Product convertDtoToProduct(FakeProductServerDto dto) {
        Product product = new Product();
        product.setId(dto.getId());
        product.setTitle(dto.getTitle());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setImage(dto.getImage());
        Category category = new Category();
        category.setName(dto.getCategory());
        product.setCategory(category);
        return product;
    }

    @Override
    public Product getProductById(long id) {
        // RestTemplate restTemplate = new RestTemplate();
        FakeProductServerDto product=this.restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeProductServerDto.class);
        return convertDtoToProduct(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }
}
