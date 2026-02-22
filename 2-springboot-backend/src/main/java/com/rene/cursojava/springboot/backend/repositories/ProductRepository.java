package com.rene.cursojava.springboot.backend.repositories;

import com.rene.cursojava.springboot.backend.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
}
