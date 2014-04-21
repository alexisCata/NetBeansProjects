/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

/**
 *
 * @author davidjgc
 */
public class Contacto extends Persona{

    private String telefono;
    
    public Contacto(String nombre, int edad, String altura) {
        super(nombre, edad, altura);
    }

    public Contacto(String telefono, String nombre, int edad, String altura) {
        super(nombre, edad, altura);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
}
