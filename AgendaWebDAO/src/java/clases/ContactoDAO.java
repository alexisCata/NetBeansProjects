package clases;

import datos.Contacto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.TreeSet;
import utilbbdd.ConexionBBDD;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexis
 */
public class ContactoDAO extends Contacto{

    
    private ConexionBBDD conex = new ConexionBBDD();
    
    public ContactoDAO (){
        
    }
    
    public void guardarContacto(Contacto unContacto){
        
        this.conex.abreConex("org.postgresql.Driver",
                "jdbc:postgresql://localhost/agenda"
                ,"admin","admin");
        
        try
        {
            String insertQuery = "Insert into contactos(nombre,telefono,edad,altura) " 
                               + " values (?,?,?,?)";
                
                    
                PreparedStatement ps = this.conex.getConn().prepareStatement(insertQuery);
                ps.setString(1, unContacto.getNombre());
                ps.setString(2, unContacto.getTelefono());
                ps.setInt(3, unContacto.getEdad());
                ps.setString(4, unContacto.getAltura());
                
                ps.executeUpdate();

            
        }
        catch (SQLException e)
        {
          e.printStackTrace();
          System.exit(1);
        }
        
        conex.cierraConex();
        
    }
    
    public void modificarContacto(Contacto unContacto, String telefono, String nombre){
        
        this.conex.abreConex("org.postgresql.Driver",
                "jdbc:postgresql://localhost/agenda"
                ,"admin","admin");
        
        try
        {
            String updateQuery = "Update contactos set nombre = ?," +
                                                "telefono = ?," +
                                                "edad = ?," +
                                                "altura = ?" +
                                          "where telefono = ?" +
                                          "  and nombre   = ?";
                
                    
                PreparedStatement ps = this.conex.getConn().prepareStatement(updateQuery);
                ps.setString(1, unContacto.getNombre());
                ps.setString(2, unContacto.getTelefono());
                ps.setInt(3, unContacto.getEdad());
                ps.setString(4, unContacto.getAltura());
                
                ps.setString(5, telefono);
                ps.setString(6, nombre);
                
                ps.executeUpdate();

            
        }
        catch (SQLException e)
        {
          e.printStackTrace();
          System.exit(1);
        }
        
        conex.cierraConex();
        
    }
    
    public void eliminarContacto(String telf){
        
        this.conex.abreConex("org.postgresql.Driver",
                "jdbc:postgresql://localhost/agenda"
                ,"admin","admin");
        
        try
        {
            String deleteQuery = "delete from contactos where telefono = ?";
                
                    
                PreparedStatement ps = this.conex.getConn().prepareStatement(deleteQuery);
                ps.setString(1, telf);
                
                ps.executeUpdate();

            
        }
        catch (SQLException e)
        {
          e.printStackTrace();
          System.exit(2);
        }
        
        conex.cierraConex();
        
    }
    
    
    public Collection<Contacto> devuelveContactos(){
        
        this.conex.abreConex("org.postgresql.Driver",
                "jdbc:postgresql://localhost/agenda"
                ,"admin","admin");
        
        
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
            
            
            conex.cierraConex();
            
            return contactos;
            
        }
        catch (SQLException e)
        {
          e.printStackTrace();
          System.exit(3);
        }
        
        conex.cierraConex();
        
        return null;
        
    }
    
}
