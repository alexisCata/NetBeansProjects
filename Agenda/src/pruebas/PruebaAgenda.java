/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;

import datos.*;
import implementaciones.*;
import java.util.*;

/**
 *
 * @author alexis
 */
public class PruebaAgenda {
    
        
    public static void main(String[] args) {
        
        //Agenda unaAgenda = new Agenda(); //con Array
        //AgendaArrayList unaAgenda = new AgendaArrayList(); //con ArrayList
        //AgendaHashSet unaAgenda = new AgendaHashSet(); //con HashSet //en caso de insertar el mismo objeto dos veces, no lo inserta       
        //AgendaHashMap unaAgenda = new AgendaHashMap(); 
        //AgendaTreeSet unaAgenda = new AgendaTreeSet(); 
        //AgendaTreeMap unaAgenda = new AgendaTreeMap(); 
        AgendaPersistencia unaAgenda = new AgendaPersistencia();
        
        Contacto unContacto;
        
        String imprimirContactos = null;
        
        System.out.println("Insertamos Zorro");
        
        System.out.println("\n");
        
        unContacto = new Contacto();
        unContacto.setAltura("1.85");
        unContacto.setEdad(30);
        unContacto.setTelefono("629504128");
        unContacto.setNombre("Zorro");

        unaAgenda.insertarContacto(unContacto);
        
        System.out.println("Agenda1-----------");

        
        imprimirContactos = unaAgenda.MostrarTodo();
        System.out.println(imprimirContactos.toString());
        System.out.println("FIN Agenda1-----------");
        System.out.println("\n");

        System.out.println("Insertamos Buenorras");
        unContacto = new Contacto();
        unContacto.setAltura("1.75");
        unContacto.setEdad(25);
        unContacto.setTelefono("696969691");
        unContacto.setNombre("Tatiana");
        
        unaAgenda.insertarContacto(unContacto);
        
        unContacto = new Contacto();
        unContacto.setAltura("1.75");
        unContacto.setEdad(25);
        unContacto.setTelefono("696969692");
        unContacto.setNombre("Samantha");
        
        unaAgenda.insertarContacto(unContacto);
        
        unContacto = new Contacto();
        unContacto.setAltura("1.75");
        unContacto.setEdad(25);
        unContacto.setTelefono("696969693");
        unContacto.setNombre("Mishel");
        
        unaAgenda.insertarContacto(unContacto);
        
        unContacto = new Contacto();
        unContacto.setAltura("1.75");
        unContacto.setEdad(25);
        unContacto.setTelefono("696969694");
        unContacto.setNombre("Foxy");
        
        unaAgenda.insertarContacto(unContacto);
        
        System.out.println("\n");
        System.out.println("Agenda2-----------");
        imprimirContactos = unaAgenda.MostrarTodo();
        System.out.println(imprimirContactos.toString());
        System.out.println("FIN Agenda2-----------");
        System.out.println("\n");
        
        System.out.println("\n");
        
        /* //PRUEBAS AGENDA SIN FICHEROS
        System.out.println("Eliminamos Zorro");
        unaAgenda.eliminarTelefono("629504128");
        
        System.out.println("\n");
        
        System.out.println("Agenda3-----------");
        imprimirContactos = unaAgenda.MostrarTodo();
        System.out.println(imprimirContactos.toString());
        System.out.println("FIN Agenda3-----------");
        System.out.println("\n");
        
        System.out.println("\n");unaAgenda.eliminarTelefono("629504128");
        
        System.out.println("Eliminamos Tatiana");
        unaAgenda.eliminarTelefono("696969691");
        
        System.out.println("\n");
        
        System.out.println("Agenda4-----------");
        imprimirContactos = unaAgenda.MostrarTodo();
        System.out.println(imprimirContactos.toString());
        System.out.println("FIN Agenda4-----------");
        System.out.println("\n");      
        */
        
        //PRUEBAS AGENDA CON FICHEROS
        //creo el fichero
        unaAgenda.guardarDatos();
        
        unaAgenda = new AgendaPersistencia();
        
        System.out.println("Agenda Vaciada");
        System.out.println("--------------");
        imprimirContactos = unaAgenda.MostrarTodo();
        System.out.println(imprimirContactos.toString());
        
        unaAgenda.cargarDatos();
        
        System.out.println("Agenda Rellena");
        System.out.println("--------------");
        imprimirContactos = unaAgenda.MostrarTodo();
        System.out.println(imprimirContactos.toString());
        
        
    }
}
