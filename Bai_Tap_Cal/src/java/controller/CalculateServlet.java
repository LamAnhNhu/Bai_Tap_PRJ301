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
@WebServlet(name = "CalculateServlet", urlPatterns = {"/select"})
public class CalculateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        
        String n1 = request.getParameter("num1");
        int num1 = Integer.parseInt(n1);
        String n2 = request.getParameter("num2");
        int num2 = Integer.parseInt(n2);
        String op = request.getParameter("op");
        
        Calculate result = new Calculate(num1, num2);
        PrintWriter pw = response.getWriter();
        float value = 0;
        String error = null;
        
        if(op.equals("+")){
            value = (float)result.total(num1, num2);
        }
        
        if(op.equals("-")){
            value =(float) result.difference(num1, num2);
        }
        
        if(op.equals("*")){
            value =(float) result.product(num1, num2);
        }
        
        if(op.equals("/")){
            if(num2 != 0){
                value =(float) result.quotient(num1, num2);
            }else{
                error = "Khong the chia cho 0";
            }
        }
        
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("op", op);
        request.setAttribute("value", value);
        request.setAttribute("error", error);
        
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
