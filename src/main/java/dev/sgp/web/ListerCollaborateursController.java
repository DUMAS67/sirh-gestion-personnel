package dev.sgp.web;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListerCollaborateursController extends HttpServlet {

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */


	@Override
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/* Affectation données pour la liste*/
		
		req.setAttribute("listeNoms", Arrays.asList("Robert", "Jean", "Hugues")); 
		
		/* Dispatch vers fichiers JSP*/
		
		req.getRequestDispatcher("/WEB-INF/view/collab/listerCollaborateurs.jsp") .forward(req, resp);
		
		
		
	}
}
