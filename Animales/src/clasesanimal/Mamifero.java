/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesanimal;

/**
 *
 * @author alexis
 */
public class Mamifero extends Animal{

    public Mamifero(int numPatas, String tipoPiel) {
        super(numPatas, tipoPiel);
    }

    @Override
    public void comer() {
        System.out.println("Come de to");
    }

    @Override
    public void moverse() {
        System.out.println("Se mueve a dos o cuatro patas, si es cojo a tres o una");
    }
    
    @Override
    public String toString(){
        super.toString();
        return null;
        
    }
    

}
