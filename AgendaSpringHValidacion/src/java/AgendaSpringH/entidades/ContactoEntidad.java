/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AgendaSpringH.controladores;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

/**
 *
 * @author angelaprades
 */
@Entity
@Table(name="contactos")
public class ContactoEntidad implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    private String nombre;
    
    @Column(unique=true)
    private String telefono;
    private String email;
    
    /*Es importante que para el tema de la persistencia se necesita el ctor vacio*/
    public ContactoEntidad(){
    }
    
    public ContactoEntidad(String nombre, String email, String telefono){
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String toString(){
        return this.getId()+" "+this.getNombre()+" "+this.getTelefono()+" "+this.getEmail();
    }
}

