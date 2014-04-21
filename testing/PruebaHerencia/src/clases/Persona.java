/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author alexis
 */
public class Persona{	
	
	private int edad;
	private String altura;
	
	//constructores
	public Persona(){
	}
        
        public Persona(int edad){
		this.edad = edad;
	}

	public Persona(int edad, String altura){
		this(edad);
		this.altura = altura;
	}
   
   //setters & getters
	public void setEdad(int edad){
		this.edad = edad;
	}

	public int getEdad(){
		return this.edad;
	}

        public void setAltura(String altura){
		this.altura = altura;
	}

	public String getAltura(){
		return this.altura;
	}

	public String toString(){
		//return "Edad: " + edad;   //aquí se hace casting y convierte todo a String al concatenar el texto con edad que es integer
		String edadString = String.valueOf(edad);
		return "Edad: " + edadString + "\n" + "Altura: " + this.altura;
	}
}