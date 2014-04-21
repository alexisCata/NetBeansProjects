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
public abstract class Animal {
    
    private Integer numPatas;
    private String tipoPiel;
    
    public Animal(int numPatas, String tipoPiel){
            this.numPatas = numPatas;
            this.tipoPiel = tipoPiel;
    }
    
    public abstract void comer();
    
    public abstract void moverse();
    
    public void dormir(){
        System.out.println("Duerme a ratos");
    };
        
    @Override
    public String toString(){
            System.out.println("Patas: " + this.numPatas );
            System.out.println("Piel: " + this.tipoPiel );
            return "";
    }
    
}
