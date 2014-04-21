/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gym.service;

import com.gym.dao.UsuarioDAO;
import com.gym.entities.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author alexis
 */
@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioDAO usuarioDAO;
    
    @Transactional
    public void addUsuario(Usuario usuario) {
        usuarioDAO.addUsuario(usuario);
    }

    @Transactional
    public List<Usuario> listUsuario() {
        return usuarioDAO.listUsuario();
    }
    
    @Transactional
    public Usuario getUsuario(Integer id) {
        return usuarioDAO.getUsuario(id);
    }

    @Transactional
    public void removeUsuario(Integer id) {
        usuarioDAO.removeUsuario(id);
    }

    public void modifyUsuario(Usuario usuario) {
        usuarioDAO.modifyUsuario(usuario);
    }
}
