/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gym.controller;

import com.gym.entities.AccesoUsuario;
import com.gym.entities.Ejercicio;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author alexis
 */
@Controller
public class EjercicioController {
    
    @RequestMapping(value = "/ejercicios", method = RequestMethod.GET)
    public String showIndex(Map<String, Object> map) {
        map.put("ejercicio", new Ejercicio());
        return "index";
    }
    
}
