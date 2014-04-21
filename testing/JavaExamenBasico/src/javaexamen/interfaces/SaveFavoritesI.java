/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexamen.interfaces;

/**
 *
 * @author davidjgc
 */
public interface SaveFavoritesI {
    /**
     * Guarda los favoritos para que no se pierdan
     */
    public void saveFavoritos();
    
    /**
     * Carga los favoritos para utilizarlos
     */
    public void loadFavoritos();
    
    
}
