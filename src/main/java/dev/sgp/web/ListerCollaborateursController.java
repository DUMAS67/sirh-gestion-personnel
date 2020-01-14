package dev.sgp.web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;
import dev.sgp.util.Constantes;

public class ListerCollaborateursController extends HttpServlet {

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
	private DepartementService deptService = Constantes.DEPT_SERVICE;
	List<Departement> departement = deptService.listerDepartement();

	@Override

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		/* Affectation données pour la liste */
		resp.setContentType("text/html; charset=UTF-8");
		req.setAttribute("listeDepartement", deptService.listerDepartement());
		req.setAttribute("listeCollaborateur", collabService.listerCollaborateurs());

		
		/* Dispatch vers fichiers JSP */

		req.getRequestDispatcher("/WEB-INF/view/collab/listerCollaborateurs.jsp").forward(req, resp);
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		/* Dispatch vers fichiers JSP */

		req.getRequestDispatcher("/WEB-INF/view/collab/EditerCollaborateur.jsp").forward(req, resp);
	}

}
