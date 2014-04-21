/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gym.service;

import com.gym.dao.AccesoUsuarioDAO;
import com.gym.entities.AccesoUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author alexis
 */
@Service
public class AccesoUsuarioService {

    @Autowired
    private AccesoUsuarioDAO accesoUsuarioDAO;
    
    @Transactional
    public void addAccesoUsuario(AccesoUsuario accesoUsuario) {
        accesoUsuarioDAO.addAccesoUsuario(accesoUsuario);
    }

//    @Transactional
//    public List<AccesoUsuario> listAccesoUsuario() {
//        return accesoUsuarioDAO.listAccesoUsuario();
//    }
    
    @Transactional
    public AccesoUsuario getAccesoUsuario(String login, String pass) {
        return accesoUsuarioDAO.getAccesoUsuario(login, pass);
    }

    @Transactional
    public void removeAccesoUsuario(Integer id) {
        accesoUsuarioDAO.removeAccesoUsuario(id);
    }
    
    //public void modifyAccesoUsuario(AccesoUsuario accesoUsuario) {
    //    accesoUsuarioDAO.modifyAccesoUsuario(accesoUsuario);
    //}
}

