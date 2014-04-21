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
public class Persona {
    
    private String nombre;
    private int edad;
    private String altura;

    
    
    public Persona(String nombre, int edad, String altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }


    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
    
    
    
}
