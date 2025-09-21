package com.victor.springboot.curso.crud.springboot_crud.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.victor.springboot.curso.crud.springboot_crud.Repository.RoleRepository;
import com.victor.springboot.curso.crud.springboot_crud.Repository.UserRepository;
import com.victor.springboot.curso.crud.springboot_crud.entitis.User;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired 
    private UserRepository repository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
     @Transactional(readOnly = true)
    public List<User> findAll() {
       return (List <User>) repository.findAll();
    }

    @Override
    @Transactional
    public User save(User user) {
      return repository.save(user);

    }

}
