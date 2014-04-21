/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.contact.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author juan
 */
@Entity
@Table(name="contactos")
public class Contacto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String nombre;
    
    private String altura;
    
    private int edad;
    
    @Column(unique=true)
    private String telefono;
    
    public Contacto(){}
    
    public Contacto(String nombre, String altura, int edad, String telefono) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
        this.telefono = telefono;
    }
    
    public long getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getAltura() {
        return altura;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setAltura(String altura) {
        this.altura = altura;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
