/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebahebras;

/**
 *
 * @author alexis
 */
public class PruebaHebras{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*   
        // herencia
        MiHebra hebra1 = new MiHebra("h1");
        MiHebra hebra2 = new MiHebra("h2");
        MiHebra hebra3 = new MiHebra("h3");
        */
        
        // implementacion
        OtraHebra hebra1 = new OtraHebra();
        Thread hebra11 = new Thread(hebra1);
        
        OtraHebra hebra2 = new OtraHebra();
        Thread hebra22 = new Thread(hebra2);
        
        OtraHebra hebra3 = new OtraHebra();
        Thread hebra33 = new Thread(hebra3);
        
        
        hebra1.setNombre("Mensaje de la hebra 1");
        hebra2.setNombre("Mensaje hebra 2");
        hebra3.setNombre("Mensaje para hebra 3");
        
        /*
        hebra1.start();
        hebra2.start();
        hebra3.start();
        */
        
        hebra11.start();
        hebra22.start();
        hebra33.start();
        
    }
    
}
