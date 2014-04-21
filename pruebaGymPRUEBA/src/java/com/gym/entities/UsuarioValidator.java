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
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author daniel
 */
public class UsuarioValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return (Usuario.class.equals(clazz));
    }

    @Override
    public void validate(Object target, Errors errors) {
        
        if (target instanceof Usuario) {
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "field.required");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "apellidos", "field.required");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sexo", "field.required");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "edad", "field.required");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "altura", "field.required");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "edad", "field.required");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "peso", "field.required");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "accesoUsuario.login", "field.required");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "accesoUsuario.password", "field.required");
            
        }
    }
}
