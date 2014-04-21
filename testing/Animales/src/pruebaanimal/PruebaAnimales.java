/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebaanimal;

import clasesanimal.*;
/**
 *
 * @author alexis
 */
public class PruebaAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Animal unAnimal = new Animal();
        Mamifero unMamifero = new Mamifero(4,"piel");
        Ave unAve = new Ave(2,"plumas");
        Pez unReptil = new Pez(0,"escamas");
        Leon unLeon = new Leon(4,"pelo",400);
        
        System.out.println("Mamifero");
        unMamifero.comer();
        unMamifero.moverse();
        unMamifero.dormir();
        unMamifero.toString();
        System.out.println("Ave");
        unAve.comer();
        unAve.moverse();
        unAve.dormir();
        unAve.toString();
        System.out.println("Reptil");
        unReptil.comer();
        unReptil.moverse();
        unReptil.dormir();  
        unReptil.toString();  
        System.out.println("Mamifero Leon");
        unLeon.comer();
        unLeon.moverse();
        unLeon.dormir();     
        unLeon.toString();
        
        
        //prueba herencia
        //Hombre h = new Hombre(4,"piel");
        
        //h.comer();  // de la clase hombre
        //h.dormir(); //d la clase animal
        
    }
    
}
