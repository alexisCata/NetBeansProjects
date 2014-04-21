/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import clases.ContactoAnotDAO;
import entidades.ContactoAnot;
import entidades.DireccionAnot;
import static java.awt.SystemColor.window;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

/**
 *
 * @author alexis
 */
public class ServAddHib extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String nom =  request.getParameter("nombre");
            String telf = request.getParameter("telf");
            String edad =  request.getParameter("edad");
            String altura = request.getParameter("altura");
            String direccion =  request.getParameter("direccion");
            String cp = request.getParameter("cp");
            
            
            ContactoAnot unContacto = new ContactoAnot();
            DireccionAnot direc = new DireccionAnot();
            ContactoAnotDAO contactoDAO = new ContactoAnotDAO();
            
            direc.setCalle(direccion);
            direc.setCodigopostal(cp);
            
            unContacto.setNombre(nom);
            unContacto.setTelefono(telf);
            unContacto.setEdad(Integer.valueOf(edad));
            unContacto.setAltura(altura);
            unContacto.setDireccion(direc);
            
            HttpSession misesion = request.getSession();
        
            misesion.setAttribute("unContacto", unContacto);
            
            try{
                contactoDAO.guardaContacto(unContacto);
                misesion.setAttribute("unContacto", null);
                response.sendRedirect("ServCargaLista?accion=sho");
            }
            catch(Exception e){
                //out.println("Error");
                //response.sendRedirect("ErrorTelf.jsp");
                
                response.sendRedirect("addContact.jsp");
                
            }
            
            
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
