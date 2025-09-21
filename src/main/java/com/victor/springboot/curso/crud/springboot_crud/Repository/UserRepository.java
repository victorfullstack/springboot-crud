package com.victor.springboot.curso.crud.springboot_crud.Repository;

import org.springframework.data.repository.CrudRepository;

import com.victor.springboot.curso.crud.springboot_crud.entitis.User;

public interface UserRepository extends CrudRepository<User, Long>{

    
}
