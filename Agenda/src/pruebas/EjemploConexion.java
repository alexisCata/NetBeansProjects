/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;

import java.sql.*;
import java.util.*;

/**
 *
 * @author alexis
 */
public class EjemploConexion {
    
    class atletas
    {
    public int id;
    public String nombre;
    }

  public static void main(String[] args)
  {
    new EjemploConexion();
  }

  public EjemploConexion() 
  {
    Connection conn = null;
    LinkedList listOfBlogs = new LinkedList();

    // connect to the database
    conn = connectToDatabaseOrDie();

    // get the data
    populateListOfTopics(conn, listOfBlogs);
    
    // print the results
    printTopics(listOfBlogs);
  }
  
  private void printTopics(LinkedList listOfBlogs)
  {
    Iterator it = listOfBlogs.iterator();
    while (it.hasNext())
    {
      atletas at = (atletas)it.next();
      System.out.println("id: " + at.id + ", nombre: " + at.nombre);
    }
  }

  private void populateListOfTopics(Connection conn, LinkedList listOfBlogs)
  {
    try 
    {
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery("SELECT id, nombre FROM atletas");
      while ( rs.next() )
      {
        atletas blog = new atletas();
        blog.id        = rs.getInt    ("id");
        blog.nombre   = rs.getString ("nombre");
        
        listOfBlogs.add(blog);
      }
      rs.close();
      st.close();
    }
    catch (SQLException se) {
      System.err.println("Threw a SQLException creating the list of blogs.");
      System.err.println(se.getMessage());
    }
  }

  private Connection connectToDatabaseOrDie()
  {
    Connection conn = null;
    try
    {
      Class.forName("org.postgresql.Driver");
      String url = "jdbc:postgresql://localhost/atletismo";
      conn = DriverManager.getConnection(url,"admin", "admin");
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
    return conn;
  }

}
