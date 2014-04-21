/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gym.service;

import com.gym.dao.GrupoMuscularDAO;
import com.gym.entities.GrupoMuscular;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author alexis
 */
@Service
public class GrupoMuscularService {
    @Autowired
    private GrupoMuscularDAO grupoDAO;
    
    @Transactional
    public void addGrupoMuscular(GrupoMuscular grupo) {
        grupoDAO.addGrupoMuscular(grupo);
    }

    @Transactional
    public List<GrupoMuscular> listGrupoMuscular() {
        return grupoDAO.listGrupoMuscular();
    }
    
    @Transactional
    public GrupoMuscular getGrupoMuscular(Integer id) {
        return grupoDAO.getGrupoMuscular(id);
    }

    @Transactional
    public void removeGrupoMuscular(Integer id) {
        grupoDAO.removeGrupoMuscular(id);
    }

    public void modifyGrupoMuscular(GrupoMuscular grupo) {
        grupoDAO.modifyGrupoMuscular(grupo);
    }
}
