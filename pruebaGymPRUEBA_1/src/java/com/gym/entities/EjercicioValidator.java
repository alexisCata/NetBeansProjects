/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gym.entities;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author alexis
 */
public class EjercicioValidator  implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return (Ejercicio.class.equals(clazz));
    }

    @Override
    public void validate(Object target, Errors errors) {
        
         if (target instanceof Ejercicio) {
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "grupoMuscular.id", "field.required");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ejercicio", "field.required");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "descripcion", "field.required");
            
        }
    }
}
