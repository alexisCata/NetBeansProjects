/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author alexis
 */
public class Contacto extends Persona{
    
    private String telefono;
    
    public Contacto(){
        super();
    }
    public Contacto(String telefono){
        super();
        this.telefono = telefono;
    }
    public Contacto(String telefono, Integer edad){
        super(edad);
        this.telefono = telefono;
        
    }
    public Contacto(String telefono, Integer edad, String altura){
        super(edad,altura);
        this.telefono = telefono;
        
    }    
    
  //setters & getters
    public void setTelefono(String telefono){
	this.telefono = telefono;
    }

    public String getTelefono(){
	return this.telefono;
    }
    
    
    public String toString(){
            
            return super.toString() + "\n" +  this.telefono;
            
    }
    
}
