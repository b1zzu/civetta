package com.example.civetta.resource;

import com.example.civetta.model.Product;
import com.example.civetta.service.ProductService;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;

import javax.inject.Inject;
import java.util.List;

@GraphQLApi
public class ProductResource {

    @Inject
    ProductService service;

    @Query("allProducts")
    public List<Product> getAllProducts() {
        return Product.listAll();
    }

    @Mutation
    public Product createProduct(String name, String description, String image, Float price) {
        return service.createProduct(name, description, image, price);
    }

    @Mutation
    public Product updateProduct(Long id, String name, String description, String image, Float price) {
        return service.updateProduct(id, name, description, image, price);
    }

    @Mutation
    public Long deleteProduct(Long id) {
        return service.deleteProduct(id);
    }
}