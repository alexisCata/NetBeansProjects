
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;

import clases.*;

/**
 *
 * @author alexis
 */
public class PruebaHerencia{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Contacto unContacto = new Contacto();
        unContacto.setAltura("1.80");
        unContacto.setEdad(30);
        unContacto.setTelefono("629504128");
        System.out.println(unContacto.toString());
        
    }
    
}
