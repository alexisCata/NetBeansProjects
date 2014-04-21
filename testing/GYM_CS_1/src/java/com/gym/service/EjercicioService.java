/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gym.service;

import com.gym.dao.EjercicioDAO;
import com.gym.entities.Ejercicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author alexis
 */

@Service
public class EjercicioService {
    @Autowired
    private EjercicioDAO ejercicioDAO;
    
    @Transactional
    public void addEjercicio(Ejercicio ejercicio) {
        ejercicioDAO.addEjercicio(ejercicio);
    }

    @Transactional
    public List<Ejercicio> listEjercicio() {
        return ejercicioDAO.listEjercicio();
    }
    
    @Transactional
    public Ejercicio getEjercicio(Integer id) {
        return ejercicioDAO.getEjercicio(id);
    }

    @Transactional
    public void removeEjercicio(Integer id) {
        ejercicioDAO.removeEjercicio(id);
    }

    public void modifyEjercicio(Ejercicio ejercicio) {
        ejercicioDAO.modifyEjercicio(ejercicio);
    }
}
