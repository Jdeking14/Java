/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author jdeka
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    @Override  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Leer los parametros del formulario HTML
        String usuario = request.getParameter("usuario");
        String pass = request.getParameter("password");
        System.out.println("usureio: " + usuario);
        System.out.println("pass: " + pass);
        
        try (PrintWriter out = response.getWriter()) {
            out.print("<html>");
            out.print("<body>");
            out.print("El parametro usuario es: " + usuario + "<br>");
            out.print("El pass del pass es: " + pass);
            out.print("<body><html>");
        }
        
    }
}
