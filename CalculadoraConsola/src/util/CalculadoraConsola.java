/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

/**
 *
 * @author alexis
 */
public class CalculadoraConsola {
        Double valor1 ;
	Double valor2;
	
	
	//constructores
	public CalculadoraConsola(){

	}

	public CalculadoraConsola(Double valor1, Double valor2){

		this.valor1 = valor1;
		this.valor2 = valor2;
		
	}
  
   //setters & getters
	public void setValor1(Double valor1){
	
		this.valor1 = valor1;
	
	}

	public Double getValor1(){
	
		return this.valor1;
	
	}

	public void setValor2(Double valor2){
	
		this.valor2 = valor2;
	
	}

	public Double getValor2(){
	
		return this.valor2;
	
	}

	public String toString(){
				
		String Valor1String = String.valueOf(this.valor1.floatValue());
		String Valor2String = String.valueOf(this.valor2.floatValue());
		
		return "Valor1: " + Valor1String + "\n" + "Valor2: " + Valor2String;
		
	}

	public Double suma(){

		Double resultadoSum;
		resultadoSum = this.valor1 + this.valor2;
		return resultadoSum;
		
	}

	public Double resta(){

		Double resultadoRes;
		resultadoRes = this.valor1 - this.valor2;
		return resultadoRes;
		
	}

	public Double multiplica(){

		Double resultadoMulti;
		resultadoMulti = this.valor1 * this.valor2;
		return resultadoMulti;
		
	}

	public Double divide(){

		Double resultadoDiv;
		resultadoDiv = this.valor1 / this.valor2;
		return resultadoDiv;
		
	}



}