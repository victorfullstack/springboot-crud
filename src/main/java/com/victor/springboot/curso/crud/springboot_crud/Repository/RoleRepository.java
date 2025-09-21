package com.victor.springboot.curso.crud.springboot_crud.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.victor.springboot.curso.crud.springboot_crud.entitis.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Optional<Role> findByName(String name);

    
} 
