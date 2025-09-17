package com.victor.springboot.curso.crud.springboot_crud.Repository;

import org.springframework.data.repository.CrudRepository;

import com.victor.springboot.curso.crud.springboot_crud.entitis.Product;

public interface ProductRepository extends CrudRepository <Product ,Long> {

}
