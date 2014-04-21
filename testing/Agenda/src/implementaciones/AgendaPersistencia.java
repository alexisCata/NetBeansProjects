/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package implementaciones;

import datos.Contacto;
import interfaces.IAgenda;
import interfaces.IPersistencia;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeMap;


/**
 *
 * @author alexis
 */
public class AgendaPersistencia implements IAgenda, IPersistencia{
    
    private TreeMap<String,Contacto> contactos;
    
    public AgendaPersistencia(){
        this.contactos = new TreeMap<String,Contacto>();
    }
    
    @Override
    public boolean insertarContacto(Contacto contacto) {
        
        contactos.put(contacto.getNombre(), contacto);
        
        return true;
        
    }

    @Override
    public boolean eliminarTelefono(String telefono) {
        
        Collection<Contacto> colContactos = contactos.values();
        
        Iterator<Contacto> it = colContactos.iterator();
        
        while (it.hasNext()){
            
            if (it.next().getTelefono().equals(telefono)){
                
                it.remove();
                
            }
        }
       
        return true;
    }

    public String MostrarTodo() {
       
        String mostrarContactos = null;
        
        Collection<Contacto> colContactos = contactos.values();
        
        Iterator<Contacto> it = colContactos.iterator();
        
        mostrarContactos = "\n";
        
        while (it.hasNext()){
            
            mostrarContactos = mostrarContactos + it.next().toString() + "\n";
                
            }
        
        return mostrarContactos;
    } 
    @Override
    public Collection<Contacto> obtenerContactos() {
        return this.contactos.values();
    }

    
    @Override
    public void cargarDatos() {
        
        File f = new File("contactos.txt");
        FileReader fr;
        try {
            fr = new FileReader(f);
        
            BufferedReader br = new BufferedReader(fr); 

            String linea;
            Contacto nuevoContacto;
            
            Integer indice1, indice2, indice3;
            String nom,tel,edad,altura;
            
            while((linea = br.readLine()) != null) {
                
                nuevoContacto = new Contacto();
                
                /* 
                //separacion de datos manual
                
                indice1 = linea.indexOf(";",0);
                indice2 = linea.indexOf(";",indice1+1);
                indice3 = linea.indexOf(";",indice2+1);
                nom = linea.substring(0, indice1);
                tel = linea.substring(indice1+1,indice2);
                edad = linea.substring(indice2+1,indice3);
                altura = linea.substring(indice3+1);
                
                nuevoContacto.setNombre(nom);
                nuevoContacto.setTelefono(tel);
                nuevoContacto.setEdad(Integer.parseInt(edad));
                nuevoContacto.setAltura(altura);
                */
                
                /*
                // separacion de datos con split
                
                String separa[] = linea.split(";");
                
                nuevoContacto.setNombre(separa[0]);
                nuevoContacto.setTelefono(separa[1]);
                nuevoContacto.setEdad(Integer.valueOf(separa[2]));
                nuevoContacto.setAltura(separa[3]);
                */
                
                //con StringTokenizer
                nuevoContacto = this.separaDatos(linea);
                      
                this.insertarContacto(nuevoContacto);
                
            }
        fr.close();
        } catch (Exception ex) {
            System.err.println(ex.toString());
        }
        
    }
    
    private Contacto separaDatos (String linea){
        Contacto c = new Contacto();
        
        StringTokenizer st = new StringTokenizer(linea,";");
        
        c.setNombre(st.nextToken());
        c.setTelefono(st.nextToken());
        c.setEdad(Integer.parseInt(st.nextToken()));
        c.setAltura(st.nextToken());
            
        return c;
    }
    
    @Override
    public void guardarDatos() {
        
        try{
            
            File f = new File ("contactos.txt");
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter (fw);

            Collection<Contacto> colContactos = this.contactos.values();

            Iterator<Contacto> it = colContactos.iterator();

            Contacto con;
            String linea;
            
            
            
            while (it.hasNext()){

                con = it.next();
                pw.println(con.getNombre() + ";" + con.getTelefono() + ";" + con.getEdad() + ";" + con.getAltura() );

                }

            pw.close ();     
        
        } catch (Exception ex) {
            System.err.println("errorrrrrrrr");
            ex.printStackTrace();
        }
    }

}


