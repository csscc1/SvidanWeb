/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author Admin
 */
@WebServlet(urlPatterns = {"/ServletResult"})
public class ServletResult extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<html lang=\"ru\">\n" +
"    <head>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"initial-scale=1.0, width=device-width\">\n" +
"        <title>Kursach</title>\n" +
"        <link rel=\"stylesheet\" type= \"text/css\" href=\"css/style.css\">\n" +
"    </head>\n" +
"    <body>\n" +
"        <div class=\"first_block\">\n" +
"            <div class=\"bg_gradient blur\">\n" +
"                <div class=\"container\">\n" +
"                    <div class=\"space\"></div>\n" +
"                    <h1 class=\"placeName\"></h1>\n" +
"                    <img class=\"placeImg\" id=\"placeImg\" src=\"\" alt=\"\" >\n" +
"                    <h2 class=\"placeDiscription\"></h2>\n" +
"                    <div class=\"space\"></div>\n" +
"                    <h2 class=\"placeAdress\"></h2>\n" +
"                    \n" +
"                    <a href=\"index.jsp\" class=\"btn again\">???????????? ?????? ??????</a>\n" +
"                </div>\n" +
"                \n" +
"            </div>\n" +
"            \n" +
"        </div>\n" +
"        <script src=\"JSON\\places.json\"></script>\n" +
"        <script src=\"scripts\\resultPage.js\"></script>\n" +
"    </body>\n" +
"</html>\n" +
"");
            
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
