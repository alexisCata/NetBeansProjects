/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilbbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alexis
 */
public class ConexionBBDD {
    
    private Connection conn = null;

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    public ConexionBBDD(){
    }
    
    public void abreConex(String driver,String url, String user, String pass){
        
        try
        {
            /*
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost/agenda";
            this.conn = DriverManager.getConnection(url,"admin", "admin");
            */
            Class.forName(driver);
            String surl = url;
            this.conn = DriverManager.getConnection(surl, user, pass);
            
            
        }
        catch (ClassNotFoundException e)
        {
          e.printStackTrace();
          System.exit(1);
        }
        catch (SQLException e)
        {
          e.printStackTrace();
          System.exit(2);
        }
        
        
    }
   
    public void cierraConex(){
      
        try{
            this.conn.close();
        }
        catch(SQLException e)
        {
          e.printStackTrace();
          System.exit(1);
        }
      

        
    }
    
}
