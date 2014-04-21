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
import com.gym.dao.AccesoUsuarioDAO;
import com.gym.dao.UsuarioDAO;
import com.gym.service.AccesoUsuarioService;
import com.gym.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author daniel
 */
public class UsuarioValidator implements Validator {

    //@Autowired
    //private AccesoUsuarioService accesoUsuarioService;
    
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
            
            Usuario user = (Usuario) target;
//            
//            AccesoUsuarioService accesoUsuarioService = new AccesoUsuarioService();
//            String login = user.getAccesoUsuario().getLogin();
//            //AccesoUsuarioDAO uuu = new AccesoUsuarioDAO();
//            //AccesoUsuario accesoOK = uuu.getAccesoUsuarioLogin(login);
//            AccesoUsuario accesoOK = accesoUsuarioService.getAccesoUsuarioLogin(login);
//            
//            if (accesoOK != null){
//                errors.rejectValue("accesoUsuario.login", "field.userexist");
//            }
           // AccesoUsuarioService accesoUsuarioService = new AccesoUsuarioService();
            
            //AccesoUsuario accesoOK = accesoUsuarioService.getAccesoUsuarioLogin(user.getAccesoUsuario().getLogin());

            //if (accesoOK != null){
            //if (user.getAccesoUsuario().getLogin() != null){
             //   errors.rejectValue("altura", user.getAccesoUsuario().getLogin());
                //errors.rejectValue("accesoUsuario.login", "field.userexist");
            //}
            
      
            
        }
        
    }
    
}
