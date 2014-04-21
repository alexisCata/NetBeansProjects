/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

/**
 *
 * @author alexis
 */
public class Persona{	
	
	private String nombre;
        private int edad;
	private String altura;
        
	//constructores
	public Persona(){
	}
        
        public Persona(String nombre){
		this.nombre = nombre;
	}

	public Persona(String nombre, int edad){
		this.nombre = nombre;
                this.edad = edad;
	}
        public Persona(String nombre, String altura){
		this.nombre = nombre;
                this.altura = altura;
	}
        public Persona(String nombre, int edad, String altura){
		this.nombre = nombre;
                this.edad = edad;
		this.altura = altura;
	}
   
   //setters & getters
        public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return this.nombre;
	}
        
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
		return "Nombre: " + this.nombre + "\n" + 
                        "Edad: " + edadString + "\n" + 
                        "Altura: " + this.altura;
	}
}