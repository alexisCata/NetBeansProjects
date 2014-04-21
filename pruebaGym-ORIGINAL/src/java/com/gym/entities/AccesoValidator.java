/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gym.entities;

/**
 *
 * @author alexis
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author daniel
 */
public class AccesoValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return (AccesoUsuario.class.equals(clazz));
    }

    @Override
    public void validate(Object target, Errors errors) {
        
        if (target instanceof AccesoUsuario) {
            
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "login", "field.required");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "field.required");
            
        }
    }
}