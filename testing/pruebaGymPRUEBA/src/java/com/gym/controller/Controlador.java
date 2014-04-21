/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.controller;

import com.gym.entities.AccesoUsuario;
import com.gym.service.AccesoUsuarioService;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author alexis
 */
@Controller
public class Controlador {

    @Autowired
    private AccesoUsuarioService accesoUsuarioService;

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
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Map<String, Object> map, HttpServletRequest request,
            @Valid AccesoUsuario accesoUsuario, BindingResult result) {

        if (result.hasErrors()) {
            return "index";
        }

        AccesoUsuario accesoOK = accesoUsuarioService.getAccesoUsuario(accesoUsuario.getLogin(), accesoUsuario.getPassword());

        if (accesoOK == null) {
            map.put("error", "error");
            return "index";
        } else {
            HttpSession misesion = request.getSession();
            misesion.setAttribute("accesoUsuario", accesoOK);

            return "redirect:./inicio";
        }
    }
}
