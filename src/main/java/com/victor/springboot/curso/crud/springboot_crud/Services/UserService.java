package com.victor.springboot.curso.crud.springboot_crud.Services;

import java.util.List;

import com.victor.springboot.curso.crud.springboot_crud.entitis.User;

public interface UserService {

 
    List <User> findAll();

    User save(User  user);
}
