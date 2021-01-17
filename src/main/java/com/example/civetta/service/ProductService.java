package com.example.civetta.service;

import com.example.civetta.model.Product;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
public class ProductService {

    @Transactional
    public Product createProduct(String name, String description, String image, Float price) {
        Product p = new Product();
        p.name = name;
        p.description = description;
        p.image = image;
        p.price = price;
        p.persist();
        return p;
    }

    @Transactional
    public Product updateProduct(Long id, String name, String description, String image, Float price) {
        Product p = Product.findById(id);
        p.name = name;
        p.description = description;
        p.image = image;
        p.price = price;
        p.persist();
        return p;
    }

    @Transactional
    public Long deleteProduct(Long id) {
        Product.findById(id).delete();
        return id;
    }
}
