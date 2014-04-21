/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebahebras;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexis
 */
public class OtraHebra implements Runnable{
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    @Override
    public void run() {
        for(int i =0;i<5;i++)
	        {
                    
                    try {
                        //esto hace que la hebra pare un segundo
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MiHebra.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    System.out.println(nombre);
	        }
	        System.out.println("Este proceso ha terminado:"+this.getNombre());
	    }
    }
    

