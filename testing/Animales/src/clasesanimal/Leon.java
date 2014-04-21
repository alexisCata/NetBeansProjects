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
public class Leon extends Mamifero{
    
    private Integer peso;

    public Leon(int numPatas, String tipoPiel, int peso) {
        super(numPatas, tipoPiel);
        this.peso = peso;
    }
    
    public void moverse(){
        System.out.println("Se mueve a 4 patas");
    }
    @Override
    public String toString(){
        super.toString();
        System.out.println("Peso: " + this.peso );
        return null;
        
    }
    
}
