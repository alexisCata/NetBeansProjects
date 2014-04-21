/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexamen.interfaces;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase que implementa la funcionalidad básica de nuestro sintonizador digital
 * @author davidjgc
 */
public abstract class SintonizadorAbstract {
    private Map<String, String> mapFavoritos = new HashMap<>(6);

    public Map<String, String> getMapFavoritos() {
        return mapFavoritos;
    }

    
    
    
    /**
     * Constructor
     * Inicializo el Map
     */
    public SintonizadorAbstract() {
        inicializarMap();
    }
    
    /**
     * Mostrar una frecuencia anterior
     * @param f
     * @param salto
     * @return 
     */
    public abstract float downFrecuency(float f, float salto);
    
    /**
     * Mostrar una frecuencia siguiente
     * @param f
     * @param salto
     * @return 
     */
    public abstract float upFrecuency(float f, float salto);
    
    /**
     * Almacena una frecuencia en los favoritos
     * @param clave
     * @param frecuencia
     */
    public abstract void saveFrecuencia(String clave, String frecuencia);


    /**
     * Devuelve una frecuencia almacenada en los favoritos
     * @param clave son las 6 posiciones existentes, las claves son
     * las cadenas: 1, 2, 3, 4, 5, 6
     * @return 
     */
    public abstract String getFrecuencia(String clave);
           
  

    /**
     * Inicializa a nada los seis favoritos
     */
    private void inicializarMap() {
        mapFavoritos.put("1", " ");
        mapFavoritos.put("2", " ");
        mapFavoritos.put("3", " ");
        mapFavoritos.put("4", " ");
        mapFavoritos.put("5", " ");
        mapFavoritos.put("6", " ");
    }
    
    /**
     * Nos muestra por consola el contenido guardado en los favoritos
     */
    public abstract void imprimirFavoritos();

    
    
}
