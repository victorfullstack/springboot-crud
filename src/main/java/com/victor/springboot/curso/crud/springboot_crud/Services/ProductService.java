package com.victor.springboot.curso.crud.springboot_crud.Services;

import java.util.List;
import java.util.Optional;

import com.victor.springboot.curso.crud.springboot_crud.entitis.Product;

public interface ProductService {

    List<Product> findAll();

    Optional<Product> findById(Long id);

    Product save (Product product);
    
    Optional<Product> update (Long id, Product product);

    Optional<Product> delete (Long id);
}
