package com.rene.cursojava.springboot.backend.services;

import com.rene.cursojava.springboot.backend.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    Optional<Product> findById(long id);
    Product save(Product product);
    Optional<Product> deleteById(long id);
}
