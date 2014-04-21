/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

/**
 *
 * @author alexis
 */
public class Contacto extends Persona implements Comparable<Contacto>{
    
    private String telefono;
    
    public Contacto(){
        super();
    }
    public Contacto(String nombre, String telefono){
        super(nombre);
        this.telefono = telefono;
    }
    public Contacto(String nombre, Integer edad, String telefono){
        super(nombre,edad);
        this.telefono = telefono;
    }
    public Contacto(String nombre, String altura, String telefono){
        super(nombre,altura);
        this.telefono = telefono;
    }
    public Contacto(String nombre, Integer edad, String altura, String telefono){
        super(nombre,edad, altura);
        this.telefono = telefono;
    }  
    
  //setters & getters
    public void setTelefono(String telefono){
	this.telefono = telefono;
    }

    public String getTelefono(){
	return this.telefono;
    }
    
    public void setNombre(String nombre){
	super.setNombre(nombre);
    }

    public String getNombre(){
        return super.getNombre();
    }
    
    
    public String toString(){
            
            return super.toString() + "\n" + "Telefono: " + this.telefono;
            
    }

    @Override
    public int compareTo(Contacto t) {
        
        Integer resul = 0;
        Integer resultado = 0;
        
        if (this.getNombre().equals(t.getNombre())){
            return 0;
        }else if (this.getNombre().charAt(0)< t.getNombre().charAt(0)){
            return -1;
        }else{
            return 1;
        }

    }
    
}
