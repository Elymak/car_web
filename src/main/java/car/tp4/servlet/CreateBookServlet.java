package car.tp4.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import car.tp4.entity.BibliothequeItf;

public class CreateBookServlet extends HttpServlet {

	@EJB(name="maBibliotheque")
	private BibliothequeItf bibliotheque;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/createBook.jsp");
	    dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		request.setCharacterEncoding("UTF-8");

	    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/editBook.jsp");
	    String titre = request.getParameter("titre");
	    String auteur = request.getParameter("auteur");
	    int annee = Integer.parseInt(request.getParameter("annee"));
	    request.setAttribute("titre", titre);
	    request.setAttribute("auteur", auteur);
	    request.setAttribute("annee", annee);
	    bibliotheque.createBook(titre, auteur, annee);
	    dispatcher.forward(request, response);
	}
	
}
