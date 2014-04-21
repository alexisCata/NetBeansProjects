/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.controller;

import com.gym.entities.AccesoUsuario;
import com.gym.entities.Usuario;
import com.gym.entities.UsuarioValidator;
import com.gym.service.AccesoUsuarioService;
import com.gym.service.UsuarioService;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author alexis
 */
@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    public Collection<Integer> cargaEdad() {

        Collection<Integer> edad = new ArrayList<Integer>();

        Integer i;
        for (i = 5; i < 91; i++) {
            edad.add(i);
        }

        return edad;
    }

    public Collection<Integer> cargaAltura() {
        Collection<Integer> altura = new ArrayList<Integer>();

        Integer a;
        for (a = 90; a < 221; a++) {
            altura.add(a);
        }
        return altura;
    }

    public Collection<String> cargaPeso() {

        Collection<String> peso = new ArrayList<String>();
        //Collection<Float> peso = new ArrayList<Float>();

        //Float a = 40.0F;
        Double a = 40.0;

        DecimalFormat format = new DecimalFormat("0.0");

        //for (a=40.0F; a<140.0F; a=a+0.1F) {
        for (a = 40.0; a < 140; a = a + 0.1) {
            format.format(a);
            peso.add(format.format(a));
        }
        return peso;
    }

    @RequestMapping(value = "/registro")
    public String registro(Map<String, Object> map) {

        map.put("edad", cargaEdad());
        map.put("altura", cargaAltura());
        map.put("peso", cargaPeso());
        map.put("usuario", new Usuario());

        return "registro";
    }

    @RequestMapping(value = "/registro", method = RequestMethod.POST)
    public String registro(Map<String, Object> map, HttpServletRequest request,
            @Valid Usuario usuario, BindingResult result) {

        if (result.hasErrors()) {
            map.put("edad", cargaEdad());
            map.put("altura", cargaAltura());
            map.put("peso", cargaPeso());
            return "registro";
        }

        usuarioService.addUsuario(usuario);
//AccesoUsuario accesoOK = accesoUsuarioService.getAccesoUsuario(Usuario.getLogin(),accesoUsuario.getPassword());
         return "redirect:./index";
    }
    
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(new UsuarioValidator()); // registramos el validador
    }

}
