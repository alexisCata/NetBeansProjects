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
public class Pez extends Animal{

    public Pez(int numPatas, String tipoPiel) {
        super(numPatas, tipoPiel);
    }

    @Override
    public void comer() {
        System.out.println("Come agua");
    }

    @Override
    public void moverse() {
        System.out.println("Nada");
    }
    
    @Override
    public String toString(){
        super.toString();
        return null;
        
    }    
}
