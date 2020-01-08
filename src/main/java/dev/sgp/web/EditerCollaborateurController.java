package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		resp.getWriter().write("<h1>Edition d'un collaborateur </h1>");

		// recupere la valeur d'un matricule
		String matricule = req.getParameter("matricule");

		if ((matricule == null) || "".equals(matricule.trim())) {
			resp.setStatus(400);
			resp.getWriter().write("Un matricule est attendu ");
		} else {
			resp.getWriter().write("<h4> Matricule :" + matricule + " </h4>");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// recupere la valeur d'un matricule
		String matricule = req.getParameter("matricule");
		// recupere la valeur d'un titre
		String titre = req.getParameter("titre");
		// recupere la valeur d'un nom
		String nom = req.getParameter("nom");
		// recupere la valeur d'un prenom
		String prenom = req.getParameter("prenom");

		boolean param1 = true;
		boolean param2 = true;
		boolean param3 = true;
		boolean param4 = true;

		if ((matricule == null) || ("".equals(matricule.trim()))) {
			param1 = false;
		}
		if ((titre == null) || ("".equals(titre.trim()))) {
			param2 = false;
		}
		if ((nom == null) || ("".equals(nom.trim()))) {
			param3 = false;
		}
		if ((prenom == null) || ("".equals(prenom.trim()))) {
			param4 = false;
		}

		if (param1 & param2 & param3 & param4) {
			resp.setStatus(201);
			resp.getWriter().write("<h4> Matricule :" + matricule + " </h4>");
			resp.getWriter().write("Creation d’un collaborateur avec les informations suivantes :" + "<p> matricule="
					+ matricule + ",titre=" + titre + ",nom=" + nom + ",prenom=" + prenom+"</p>");
		} else {
			resp.getWriter().write("Les paramètres suivants sont incorrects :");
			resp.setStatus(400);
			if (!param1) {
				resp.getWriter().write("<p>il manque le matricule</p>");
			}
			if (!param2) {
				resp.getWriter().write("<p>il manque le titre</p>");
			}
			if (!param3) {
				resp.getWriter().write("<p>il manque le nom</p>");
			}
			if (!param4) {
				resp.getWriter().write("<p>il manque le prenom</p>");
			}
		}
	}

}
