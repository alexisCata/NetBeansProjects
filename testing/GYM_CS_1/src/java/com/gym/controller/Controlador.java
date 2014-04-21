/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.controller;

import com.gym.entities.AccesoUsuario;

import java.util.Map;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author alexis
 */
@Controller
public class Controlador {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String showIndex(Map<String, Object> map) {
        map.put("accesoUsuario", new AccesoUsuario());
        return "index";
    }

    @RequestMapping(value = "/inicio")
    public String inicio() {
        //map.put("accesoUsuario", new AccesoUsuario());
        return "inicio";
    }

    @RequestMapping(value = "/gestion")
    public String gestion() {
        //map.put("accesoUsuario", new AccesoUsuario());
        return "gestion";
    }
}
