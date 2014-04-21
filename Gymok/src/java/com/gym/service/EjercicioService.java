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
//import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author alexis
 */
public class EjercicioService {
@Autowired
    private EjercicioDAO ejercicioDAO;

    //@Transactional
    public void addEjercicio(Ejercicio ejer) {
        ejercicioDAO.guardaEjercicio(ejer);
    }

    //@Transactional
    public List<Ejercicio> listEjercicio() {
        return ejercicioDAO.obtenListaEjercicios();
    }
    
    //@Transactional
    public Ejercicio getEjercicio(Integer id) {
        return ejercicioDAO.obtenEjercicio(id);
    }

    //@Transactional
    public void removeEjercicio(Ejercicio ejer) {
        ejercicioDAO.eliminaEjercicio(ejer);
    }

    public void modifyEjercicio(Ejercicio ejer) {
        ejercicioDAO.actualizaEjercicio(ejer);
    }
}

