/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gym.controller;


import com.gym.entities.GrupoMuscular;
import com.gym.service.GrupoMuscularService;
import com.gym.service.UsuarioService;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author alexis
 */
@Controller
public class GrupoController {
    
    @Autowired
    private GrupoMuscularService grupoService;
    
    @RequestMapping(value = "/gestgrupos")
    public String gestiongrupos(Map<String, Object> map) {
         map.put("gruposList", grupoService.listGrupoMuscular());
        return "grupos";
    }
    
    @RequestMapping(value = "/nuevogrupo", method = RequestMethod.GET)
    public String nuevoGrupo(Map<String, Object> map) {
        
        map.put("grupo", new GrupoMuscular());
        return "nuevogrupo";
    }
    
    @RequestMapping(value = "/nuevogrupo", method = RequestMethod.POST)
    public String nuevoGrupo(@Valid GrupoMuscular grupo, BindingResult result) {
        
       if (result.hasErrors()) {
            return "nuevogrupo";
        }

        grupoService.addGrupoMuscular(grupo);

        return "redirect:./gestgrupos";
    }    
    
    @RequestMapping("/borraGr/{grupoId}")
    public String borraGrupo(@PathVariable("grupoId") Integer grupoId) {
        grupoService.removeGrupoMuscular(grupoId);
        return "redirect:../gestgrupos";
    }
    
    @RequestMapping(value = "/modGr/{GrupoMuscular.id}", method = RequestMethod.GET)
    public String modificaGrupo(@PathVariable("GrupoMuscular.id") Integer grupoId, Map<String, Object> map) {
        
        map.put("grupo", grupoService.getGrupoMuscular(grupoId));
        
        return "modgrupo";
    }
    
    @RequestMapping(value = "/modGr/{GrupoMuscular.id}", method = RequestMethod.POST)
    public String modificaGrupo(@Valid GrupoMuscular grupo, BindingResult result, @PathVariable("GrupoMuscular.id") Integer grupoId) {
        grupo.setId(grupoId);
        if (result.hasErrors()) {
            return "modgrupo";
        }
        grupoService.modifyGrupoMuscular(grupo);
        
        return "redirect:../gestgrupos";
    }
    
}
