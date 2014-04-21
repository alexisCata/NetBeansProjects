/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaexamen.implementaciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javaexamen.interfaces.SaveFavoritesI;
import javaexamen.interfaces.SintonizadorAbstract;

/**
 *
 * @author alexis
 */
public class Sintonizador extends SintonizadorAbstract implements SaveFavoritesI{
    
    private float frecuen = 80.0f;
    private final static float maxFrencuencia = 108.0f;
    private final static float minFrencuencia = 80.0f;
    private HashMap<String,String> favoritos = new HashMap<String,String>();
    
    public Sintonizador(){
        this.frecuen = 80.0f;
    }
    
    public float getFrecuen() {
        return frecuen;
    }

    public void setFrecuen(float frencuencia) {
        this.frecuen = frencuencia;
    }

    public float getMaxFrencuencia() {
        return maxFrencuencia;
    }

    public float getMinFrencuencia() {
        return minFrencuencia;
    }

    public HashMap<String, String> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(HashMap<String, String> favoritos) {
        this.favoritos = favoritos;
    }

    
    
    @Override
    public float downFrecuency(float f, float salto) {
        this.frecuen = f - salto;
        return this.frecuen;
    }

    @Override
    public float upFrecuency(float f, float salto) {
        this.frecuen = f + salto;
        return this.frecuen;
    }

    @Override
    public void saveFrecuencia(String clave, String frecuencia) {
        this.favoritos.put(clave, frecuencia);
    }

    @Override
    public String getFrecuencia(String clave) {
        
        String frec;
        try{
            frec = this.favoritos.get(clave);
        }
        catch (Exception ex){
            frec = "";
        }
        
        return frec;
    }

    
    
    
    
    
    @Override
    public void imprimirFavoritos() {
        String mostrarContactos = null;
        
        Collection<String> colContactos = favoritos.values();
        
        Iterator<String> it = colContactos.iterator();
        
        while (it.hasNext()){
            
           System.out.println(it.next().toString());
                
            }
    }

    @Override
    public void saveFavoritos() {
        try{
            
            File f = new File ("favoritos.txt");
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter (fw);

            //Collection<String> colContactos = this.favoritos.values();
            //Iterator<String> it = colContactos.iterator();
            
            Set mapSet = (Set) this.favoritos.entrySet();
            Iterator mapIterator = mapSet.iterator();
            
            
            while (mapIterator.hasNext()){
                
                Map.Entry mapEntry = (Map.Entry) mapIterator.next();
                
                pw.println(mapEntry.getKey() + ";" +mapEntry.getValue());

                }

            pw.close ();     
        
        } catch (Exception ex) {
            System.err.println("errorrrrrrrr");
            ex.printStackTrace();
        }
    }

    @Override
    public void loadFavoritos() {
        File f = new File("favoritos.txt");
        FileReader fr;
        try {
            fr = new FileReader(f);
        
            BufferedReader br = new BufferedReader(fr); 

            String linea;
            
            String separa[];
            
            
            String clave;
            String frec;
            
            while((linea = br.readLine()) != null) {
                
                separa = linea.split(";");
                
                clave = separa[0];
                frec = separa[1];
                
                favoritos.put(clave, frec);
                
            }
        fr.close();
        } catch (Exception ex) {
            System.err.println(ex.toString());
        }
        
    }
    
}
