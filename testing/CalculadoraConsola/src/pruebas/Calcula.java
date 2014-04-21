package pruebas;
import java.io.*;
import java.text.DecimalFormat;
import util.*;

public class Calcula{
	
	public static void main(String[] args){
		
/*		
		Integer valor1 = Integer.valueOf(args[0]);		
		String operacion = args[1];
		Integer valor2 = Integer.valueOf(args[2]);
*/
				
		//Calculadora unaCalculadora = new Calculadora(valor1,valor2);
		CalculadoraConsola unaCalculadora = new CalculadoraConsola();
      
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try{
		   
		   boolean ok1 = false;
			while (!ok1){
				try{
				System.out.println("Introduzca valor 1:");
				String param1 = br.readLine();
				unaCalculadora.setValor1(Double.valueOf(param1));
				ok1 = true;
				}
				catch(NumberFormatException en)	{
				System.err.println("Debe introducir un numero");// + en.getMessage()); //Salida estándar para errores System.err.println
				System.out.println("----------------------------------------------------");		
				}		
			}	
			
			boolean ok2 = false;
			while (!ok2){
				try{
				System.out.println("Introduzca valor 2:");
				String param2 = br.readLine();
				unaCalculadora.setValor2(Double.valueOf(param2));
				ok2 = true;
				}
				catch(NumberFormatException en)	{
				System.err.println("Debe introducir un numero");// + en.getMessage()); //Salida estándar para errores System.err.println
				System.out.println("----------------------------------------------------");		
				}		
			}	
			
			boolean ok3 = false;
			String op = "";
			while (!ok3){			
				System.out.println("Introduzca operación -> sumar(+), restar(-), multiplicar(.), dividir(/):");
				String operacion = br.readLine();
				
				if (operacion.equals("+") || 
				    operacion.equals("-") || 
				    operacion.equals(".") || 
				    operacion.equals("/")){
					ok3 = true;
					op = operacion;
				}
				else{
					System.out.println("Operación no reconocida");
					System.out.println("----------------------------------------------------");
				}
			} 			
			
			Double resul = 0.0;      
	      String errorOp = "";		
			
			switch (op){
				case "+":
					resul = unaCalculadora.suma();
					break;
				case "-":
					resul = unaCalculadora.resta();
					break;
				case ".":
					resul = unaCalculadora.multiplica();
					break;
				case "/":
					resul = unaCalculadora.divide();
					break;
/*			   default:
			   	errorOp = "Operación no reconocida. Operaciones válidas: mas, menos, por, entre";
			   	break;*/
			}
			
			if (errorOp.equals("")){
				System.err.println("--------------");	
                                DecimalFormat valor1 = new DecimalFormat("#.####");
                                DecimalFormat valor2 = new DecimalFormat("#.####");
                                DecimalFormat resulD = new DecimalFormat("#.####");
                                
                                
				System.out.println(valor1.format(unaCalculadora.getValor1()) + " " + op + " " + valor1.format(unaCalculadora.getValor2()) + " = " + valor1.format(resul));
				System.err.println("--------------");
				}
			else{
				System.out.println(errorOp);
				}
		}
		catch(IOException e1){
			//System.out.println("Error: " + e);			
			System.err.println("Error1: " + e1.getMessage()); //Salida estándar para errores System.err.println
		}
		catch(ArithmeticException e2){
			System.err.println("Error, división entre 0");	
		}
	}
}