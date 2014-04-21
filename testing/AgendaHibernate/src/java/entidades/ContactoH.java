/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.io.Serializable;

/**
 *
 * @author alexis
 */
public class ContactoH implements Serializable{
    
    private Integer id;
    private String nombre;
    private String telefono;
    private Integer edad;
    private String altura;
    
    public ContactoH(){
    }
    
    public ContactoH(String nom, String telf, Integer edad, String altura){
        
        this.nombre = nom;
        this.telefono = telf;
        this.edad = edad;
        this.altura = altura;
        
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
    
    
    
}
