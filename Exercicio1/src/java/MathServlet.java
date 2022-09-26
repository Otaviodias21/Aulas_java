/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fatec
 */
@WebServlet(urlPatterns = {"/math.html"})
public class MathServlet extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MathServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h4><a href='index.html'>voltar</a></h4>");
            out.println("        <form action=\"math.html\"> \n" +
"            <input type=\"radio\" name=\"op\" value=\"1\"  checked=\"checked\">\n" +
"            <label>Soma</label><br>\n" +
"            <input type=\"radio\" name=\"op\" value=\"2\">\n" +
"            <label>Subtração</label><br>\n" +
"            <input type=\"radio\" name=\"op\" value=\"3\">\n" +
"            <label>Divisão</label><br>\n" +
"            <input type=\"radio\" name=\"op\" value=\"4\">\n" +
"            <label>Multiplicação</label><br>\n" +
"            <input type=\"number\" name=\"n1\" value=\"1\"/><br> \n" +
"            <input type=\"number\" name=\"n2\" value=\"1\"/><br>\n" +
"            <input type=\"submit\" name=\"somar\" value=\"Calcular\"/><br>\n" +
"        </form>");
            double n1 = 1;
            double n2 = 1;
            double total = 0;
            int op = 1;
            try{
                 n1 = Double.parseDouble(request.getParameter("n1"));
                 n2 = Double.parseDouble(request.getParameter("n2"));
                 op = Integer.parseInt(request.getParameter("op"));
            }catch(Exception ex){
                out.println("<div style='color:red'>" + "Parametro invalido " + "</div>");
            }
            switch (op){
                case 1:
                    total = n1+n2;
                    break;
                case 2:
                    total = n1-n2;
                    break;
                case 3:
                    total = n1/n2;
                    break;
                case 4:
                    total = n1*n2;
                    break;
            }
            out.println("Resultado = " + total);
            out.println("</body>");
            out.println("</html>");
            out.println("</body>");
            out.println("</html>");
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
