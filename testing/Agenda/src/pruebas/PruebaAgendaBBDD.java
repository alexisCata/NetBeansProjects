/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;

import datos.Contacto;
import implementaciones.AgendaBBDD;

/**
 *
 * @author alexis
 */
public class PruebaAgendaBBDD {
    
    public static void main(String[] args) {
        AgendaBBDD agenda = new AgendaBBDD();
        
        agenda.ConectaBBDD();
        

        agenda.cargarDatos();
        
        System.out.println("Agenda 1");
        System.out.println("--------------");
        String imprimirContactos = agenda.MostrarTodo();
        System.out.println(imprimirContactos.toString());
        
        Contacto unContacto = new Contacto();
        
        unContacto = new Contacto();
        unContacto.setAltura("1.75");
        unContacto.setEdad(25);
        unContacto.setTelefono("696969694");
        unContacto.setNombre("Foxy");        
        
        agenda.insertarContacto(unContacto);
        
        System.out.println("Agenda 1");
        System.out.println("--------------");
        imprimirContactos = agenda.MostrarTodo();
        System.out.println(imprimirContactos.toString());
        
        agenda.guardarDatos();
        
    }
    
}
