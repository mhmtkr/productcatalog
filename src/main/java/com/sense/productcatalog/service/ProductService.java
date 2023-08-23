package com.sense.productcatalog.service;

import com.sense.productcatalog.entity.Product;
import com.sense.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product) {

        // Perform any required validations or transformations
        // Save the product to the database
        return productRepository.save(product);
    }

    public Product getProductById(String id) {
        return productRepository.findById(id).orElse(null);
    }

}
