/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.controller;

import com.gym.entities.AccesoUsuario;
import com.gym.entities.Ejercicio;
import com.gym.entities.GrupoMuscular;
import com.gym.service.EjercicioService;
import com.gym.service.GrupoMuscularService;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author alexis
 */
@Controller
public class EjercicioController {

    @Autowired
    private EjercicioService ejercicioService;

    @Autowired
    private GrupoMuscularService grupoService;

    @RequestMapping(value = "/gestejercicios")
    public String gestionejercicios(Map<String, Object> map) {
        map.put("ejerciciosList", ejercicioService.listEjercicio());
        
        return "ejercicios";
    }

    @RequestMapping(value = "/nuevoejercicio", method = RequestMethod.GET)
    public String nuevoGrupo(Map<String, Object> map) {
        map.put("gruposList", grupoService.listGrupoMuscular());
        map.put("ejercicio", new Ejercicio());
        return "nuevoejercicio";
    }

    @RequestMapping(value = "/nuevoejercicio", method = RequestMethod.POST)
    public String nuevoGrupo(@Valid Ejercicio ejercicio, BindingResult result,Map<String, Object> map) {

        if (result.hasErrors()) {
            map.put("gruposList", grupoService.listGrupoMuscular());
            return "nuevoejercicio";
        }

        ejercicioService.addEjercicio(ejercicio);

        return "redirect:./gestejercicios";
    }

    @RequestMapping("/borraEj/{ejercicioId}")
    public String borraGrupo(@PathVariable("ejercicioId") Integer grupoId) {
        ejercicioService.removeEjercicio(grupoId);
        return "redirect:../gestejercicios";
    }

    @RequestMapping(value = "/modEj/{ejercicio.id}", method = RequestMethod.GET)
    public String modificaGrupo(@PathVariable("ejercicio.id") Integer ejercicioId, Map<String, Object> map) {

        map.put("ejercicio", ejercicioService.getEjercicio(ejercicioId));

        return "modejercicio";
    }

    @RequestMapping(value = "/modEj/{ejercicio.id}", method = RequestMethod.POST)
    public String modificaGrupo(@Valid Ejercicio ejercicio, BindingResult result, @PathVariable("ejercicio.id") Integer ejercicioId) {
        ejercicio.setId(ejercicioId);
        if (result.hasErrors()) {
            return "modejercicio";
        }
        ejercicioService.modifyEjercicio(ejercicio);

        return "redirect:../gestejercicios";
    }

}
