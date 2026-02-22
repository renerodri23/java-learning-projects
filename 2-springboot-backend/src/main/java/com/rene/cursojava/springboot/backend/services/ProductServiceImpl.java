package com.rene.cursojava.springboot.backend.services;

import com.rene.cursojava.springboot.backend.entities.Product;
import com.rene.cursojava.springboot.backend.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    final private ProductRepository repo;

    public ProductServiceImpl(ProductRepository repo) {
        this.repo = repo;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Product> findAll() {
        return(List<Product>)repo.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Product> findById(long id) {
        return repo.findById(id);
    }

    @Transactional
    @Override
    public Product save(Product product) {
        return repo.save(product);
    }

    @Transactional
    @Override
    public Optional<Product> deleteById(long id) {
        Optional<Product> optionalProduct = repo.findById(id);
        if(optionalProduct.isPresent()){
            repo.deleteById(id);
            return optionalProduct;
        } else {
            return Optional.empty();
        }

    }
}
