package com.victor.springboot.curso.crud.springboot_crud.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.victor.springboot.curso.crud.springboot_crud.Repository.ProductRepository;
import com.victor.springboot.curso.crud.springboot_crud.entitis.Product;

@Service
public class ProductServiceimpl  implements ProductService{
    
    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    @Override
    public List<Product> findAll() {
       
        return (List<Product>) repository.findAll();
    }
     
    @Transactional(readOnly = true)
    @Override
    public Optional<Product> findById(Long id) {
     
        return repository.findById(id);
    }
    
    @Transactional
    @Override
    public Product save(Product product) {
        
        return repository.save(product);
    }
    
    @Transactional
    @Override
    public Optional<Product> update(Long id, Product product) {
       Optional <Product> productOptional = repository.findById(id);
    if(productOptional.isPresent()){
        Product productdb =productOptional.orElseThrow();
          productdb.setName(product.getName());
          productdb.setDescription(product.getDescription());
          productdb.setPrice(product.getPrice());
          return Optional.of(repository.save(productdb));

      }
      return productOptional;    
    }
    @Transactional
    @Override
    public Optional<Product> delete(Long id) {
      Optional <Product> productOptional = repository.findById(id);
      productOptional.ifPresent(productdb ->{
          repository.delete(productdb);

      });
      return productOptional;
             
        }

    

}
