package car.tp4.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditBookServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/editBook.jsp");
	    dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		request.setCharacterEncoding("UTF-8");

	    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/editBook.jsp");
	    request.setAttribute("titre", request.getParameter("titre"));
	    request.setAttribute("auteur", request.getParameter("auteur"));
	    request.setAttribute("annee", request.getParameter("annee"));
	    dispatcher.forward(request, response);
	}
	
}
