/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alexis
 */
public class servlet1 extends HttpServlet {

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
        
        /*
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejemplo servlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Primer ejemplo Servlet servlet1 at " + request.getContextPath() + "</h1>");
            out.println("<h2>NOMBRE: " + request.getParameter("nombre") + "</h2>");
            out.println("<h2>TELÉFONO: " + request.getParameter("telf") + "</h2>");
            out.println("</body>");
            out.println("</html>");
        }
        */
        
        //REDIRECCION
        //response.sendRedirect("home.html");
                
        //request.getParameter("nombre");
        //request.getParameter("telf");
        
        String nom =  request.getParameter("nombre");
        String telf = request.getParameter("telf");
        
        HttpSession mise = request.getSession();
        
        //request.getSession().setAttribute("nombre", nom);
        //request.getSession().setAttribute("telf", telf);
        
        mise.setAttribute("nombre", nom);
        mise.setAttribute("telf", telf);
        
        response.sendRedirect("home.jsp");
                
        
        
        
        
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
