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
public class Ave extends Animal{

    public Ave(int numPatas, String tipoPiel) {
        super(numPatas, tipoPiel);
    }

    @Override
    public void comer() {
        System.out.println("Come insectos");
    }

    @Override
    public void moverse() {
        System.out.println("Vuela");
    }
    
    @Override
    public String toString(){
        super.toString();
        return null;
        
    }
}
