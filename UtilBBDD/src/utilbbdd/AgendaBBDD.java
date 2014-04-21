/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilbbdd;

import datos.Contacto;
import interfaces.IPersistencia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;


/**
 *
 * @author alexis
 */
public class AgendaBBDD extends AgendaTreeSet implements IPersistencia{
    
    private ConexionBBDD conex = new ConexionBBDD();
    
    public AgendaBBDD(){
    }
    
    public void ConectaBBDD(){
        
        conex.abreConex("org.postgresql.Driver",
                "jdbc:postgresql://localhost/agenda"
                ,"admin","admin");
        
    }
    
    public void desconectaBBDD(){
        
        conex.cierraConex();
        
    }

    
    @Override
    public void cargarDatos() {
    
        this.ConectaBBDD();
        
        try
        {
            Statement st = this.conex.getConn().createStatement();

            ResultSet rs = st.executeQuery("SELECT id, nombre, telefono, edad, altura FROM contactos;");

            Collection<Contacto> contactos = new TreeSet();
            Contacto unContacto;


            while ( rs.next() )
            {
              unContacto =  new Contacto();
              unContacto.setNombre(rs.getString("nombre"));
              unContacto.setTelefono(rs.getString("telefono"));
              unContacto.setEdad(rs.getInt("edad"));
              unContacto.setAltura(rs.getString("altura"));
              
              contactos.add(unContacto);

            }
            rs.close();
            st.close();

            this.setContactos(contactos);
            
            this.desconectaBBDD();
        }
        catch (SQLException e)
        {
          e.printStackTrace();
          System.exit(1);
        }
        
    }

    
    public void Modificar(String telefonoOrig, Contacto unContacto){
            //String telefonoOrig, String nombre, String telefono, Integer edad, String altura) {
    
        this.ConectaBBDD();
        
        try
        {
            String updateQuery = "Update contactos set nombre = ?," +
                                                "telefono = ?," +
                                                "edad = ?," +
                                                "altura = ?" +
                                          "where telefono = ?";
            
           
            
                
                    
                PreparedStatement ps = this.conex.getConn().prepareStatement(updateQuery);
                ps.setString(1, unContacto.getNombre());
                ps.setString(2, unContacto.getTelefono());
                ps.setInt(3, unContacto.getEdad());
                ps.setString(4, unContacto.getAltura());
                ps.setString(5, telefonoOrig);
                
                ps.executeUpdate();

            
        }
        catch (SQLException e)
        {
          e.printStackTrace();
          System.exit(1);
        }
        
        this.desconectaBBDD();
            
       
        
    }
        
    
    
    @Override
    public void guardarDatos() {
        
        Collection<Contacto> contactos = this.getContactos();
        Contacto unContacto = new Contacto();
        
        Iterator<Contacto> it = contactos.iterator();
        
        this.ConectaBBDD();
        
        String truncateTable = "Truncate table contactos";
        String insertQuery = "Insert into contactos(nombre,telefono,edad,altura)"
                            + "values (?,?,?,?)";
        try{
            
            PreparedStatement psT = this.conex.getConn().prepareStatement(truncateTable);
            psT.executeUpdate();
            
            while (it.hasNext()){
                
                unContacto = it.next();
                
                PreparedStatement ps = this.conex.getConn().prepareStatement(insertQuery);
                ps.setString(1, unContacto.getNombre());
                ps.setString(2, unContacto.getTelefono());
                ps.setInt(3, unContacto.getEdad());
                ps.setString(4, unContacto.getAltura());
                
                ps.executeUpdate();

                } 
            
        }
        catch (SQLException e)
        {
          e.printStackTrace();
          System.exit(1);
        }
        
        
    }
    
   

    
    
    
}
