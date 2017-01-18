/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Joueur;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author p1505089
 */
@WebServlet(name = "Controller", urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {

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
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8"); 
        String action = request.getParameter("action");
        String vue = "index.html";
        String pseudo;
        HttpSession session;
        session = request.getSession();
        
        switch (action)
        {
        case "Commencer":
            pseudo = request.getParameter("pseudo");
            session.setAttribute("joueur",new Joueur(pseudo));
            vue="Depart.jsp";
            break;
        
        //Depart
        case "Continuer":
            ((Joueur) session.getAttribute("joueur")).setPoints(0);
            vue="p1.jsp";
            break;
        //p1
        case "Droite":
            vue="p2.jsp";
            break;
        case "Gauche":
            vue="p3.jsp";
            break; 
        //p2
        case "La suivre":
            ((Joueur) session.getAttribute("joueur")).setPoints(((Joueur) session.getAttribute("joueur")).getPoints()+1);
            vue="p4.jsp";
            break;  
        case "Continuer dans l'obscurite":
            ((Joueur) session.getAttribute("joueur")).setPoints(((Joueur) session.getAttribute("joueur")).getPoints()-1);
            vue="p5.jsp";
            break;  
        //p3
        case "Sacrifier le mouton":
            ((Joueur) session.getAttribute("joueur")).setPoints(((Joueur) session.getAttribute("joueur")).getPoints()+1);
            vue="p6.jsp";
            break;  
        case "Tuer le pretre":
            ((Joueur) session.getAttribute("joueur")).setPoints(((Joueur) session.getAttribute("joueur")).getPoints()-1);
            vue="p5.jsp";
            break;  
        case "Se sacrifier a la place":
            vue="Fin.jsp";
            break;  
        //p4
        case "Plonger avec elle":
            ((Joueur) session.getAttribute("joueur")).setPoints(((Joueur) session.getAttribute("joueur")).getPoints()+1);
            vue="p7.jsp";
            break;  
        case "Chercher une autre issue":
            ((Joueur) session.getAttribute("joueur")).setPoints(((Joueur) session.getAttribute("joueur")).getPoints()-1);
            vue="p8.jsp";
            break;  
        //p5
        case "Tuer le chasseur":
            ((Joueur) session.getAttribute("joueur")).setPoints(((Joueur) session.getAttribute("joueur")).getPoints()-1);
            vue="p8.jsp";
            break;  
        case "Tuer l'enfant":
            ((Joueur) session.getAttribute("joueur")).setPoints(((Joueur) session.getAttribute("joueur")).getPoints()-2);
            vue="p8.jsp";
            break;  
        case "Tuer les deux":
            ((Joueur) session.getAttribute("joueur")).setPoints(((Joueur) session.getAttribute("joueur")).getPoints()-1);
            vue="p8.jsp";
            break;  
        case "Passer votre chemin":
            vue="p8.jsp";
            break;     
        //p6
        case "Accepter":
            ((Joueur) session.getAttribute("joueur")).setPoints(((Joueur) session.getAttribute("joueur")).getPoints()+1);
            vue="p9.jsp";
            break;  
        case "Refuser":
            ((Joueur) session.getAttribute("joueur")).setPoints(((Joueur) session.getAttribute("joueur")).getPoints()-1);
            vue="p9.jsp";
            break;  
        case "Donner votre repas aux habitants":
            ((Joueur) session.getAttribute("joueur")).setPoints(((Joueur) session.getAttribute("joueur")).getPoints()+2);
            vue="p9.jsp";
            break; 
        //p7
        case "Boire le vin":
            ((Joueur) session.getAttribute("joueur")).setPoints(((Joueur) session.getAttribute("joueur")).getPoints()+1);
            vue="Fin.jsp";
            break;  
        case "Manger la viande":
            ((Joueur) session.getAttribute("joueur")).setPoints(((Joueur) session.getAttribute("joueur")).getPoints()-1);
            vue="Fin.jsp";
            break;  
        case "Aller dormir":
            vue="p1.jsp";
            break; 
        //p8
        case "Entrer dans un trou":
            ((Joueur) session.getAttribute("joueur")).setPoints(((Joueur) session.getAttribute("joueur")).getPoints()-1);
            vue="Fin.jsp";
            break;  
        case "Rester a l'exterieur":
            ((Joueur) session.getAttribute("joueur")).setPoints(((Joueur) session.getAttribute("joueur")).getPoints()+1);
            vue="Fin.jsp";
            break;  
        //p9
        case "Cueillir des roses":
            ((Joueur) session.getAttribute("joueur")).setPoints(((Joueur) session.getAttribute("joueur")).getPoints()-1);
            vue="Fin.jsp";
            break;  
        case "Passer une nuit a observer les etoiles":
            ((Joueur) session.getAttribute("joueur")).setPoints(((Joueur) session.getAttribute("joueur")).getPoints()+1);
            vue="Fin.jsp";
            break;
        case "Continuer a errer":
            vue="p10.jsp";
            break;  
        //p10
        case "La peur":
            vue="p11.jsp";
            break;
        case "La violence":
            vue="p12.jsp";
            break;  
        case "Je ne sais pas, j'hesite...":
            vue="p13.jsp";
            break;
        case "Se retrouver face a la peur":
            vue="p3.jsp";
            break;
        case "Se retrouver face a la violence":
            vue="p5.jsp";
            break;  
        case "Se laisser porter":
            ((Joueur) session.getAttribute("joueur")).setPoints(0);
            vue="p1.jsp";
            break; 
        case "Recommencer":
            vue="index.html";
            break;  
        }
        RequestDispatcher rd=request.getRequestDispatcher(vue);
        rd.forward(request, response);
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
