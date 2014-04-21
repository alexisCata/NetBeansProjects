/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author alexis
 */
@Entity
public class Usuario implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellidos;
    @NotEmpty
    private String sexo;
    @NotNull
    private Integer edad;
    @NotNull
    private Integer altura;
    @NotNull
    private String peso;

    @OneToOne(cascade={CascadeType.ALL})
    private AccesoUsuario accesoUsuario;
    //private AccesoUsuario accesoUsuario = new AccesoUsuario();
    @OneToMany
    private Collection<HistDatosUsuario> datosUsuario;

    public Usuario() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public AccesoUsuario getAccesoUsuario() {
        return accesoUsuario;
    }

    public void setAccesoUsuario(AccesoUsuario accesoUsuario) {
        this.accesoUsuario = accesoUsuario;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Collection<HistDatosUsuario> getDatosUsuario() {
        return datosUsuario;
    }

    public void setDatosUsuario(Collection<HistDatosUsuario> datosUsuario) {
        this.datosUsuario = datosUsuario;
    }


}
