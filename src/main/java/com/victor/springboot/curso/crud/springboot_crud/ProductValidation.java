package com.victor.springboot.curso.crud.springboot_crud;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.victor.springboot.curso.crud.springboot_crud.entitis.Product;

@Component
public class ProductValidation implements Validator{

    @Override
    public boolean supports(Class<?> clazz) {
    return Product.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Product product = (Product) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", null, "es requerido");
        if (product.getDescription() == null || product.getDescription().isBlank()) {
            errors.rejectValue("description",null, "es requerido, gracias! ._.");
            
        }
        if (product.getPrice() == null ) {
            errors.rejectValue("Price",null, "no puede estar vacio!");
        }else if(product.getPrice() < 500){
            errors.rejectValue("Price", null, "debe ser mayor de 500!");
          
        }
       
    }

}
