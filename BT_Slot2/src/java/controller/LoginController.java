/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "LoginController", urlPatterns = {"/process"})
public class LoginController extends HttpServlet {

   
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter pw = response.getWriter();
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        String confPass = request.getParameter("confPass");
        if(name.equals("Admin") && pass.equals("123") && confPass.equals(pass)){
            //request.setAttribute("username", name);
            request.getRequestDispatcher("success.jsp").forward(request, response);
        }else{
            String msg = "Login failed!<br> Check password or confirm password!!!<br>";
            request.setAttribute("Error", msg);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
