package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
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

public class CreerCollaborateurController extends HttpServlet {

	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
	private DepartementService dpService = Constantes.DEPT_SERVICE;
	List<Departement> listDep = dpService.listerDepartement();

	@Override

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html; charset=UTF-8");

		/* Dispatch vers fichiers JSP */

		req.getRequestDispatcher("/WEB-INF/view/collab/creerCollaborateurs.jsp").forward(req, resp);

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
		resp.setContentType("text/html; charset=UTF-8");

		// recupere la valeur d'un nom
		String nom = req.getParameter("nom");
		// recupere la valeur d'une date
		String prenom = req.getParameter("prenom");
		String dateNaissance = req.getParameter("dateNaissance");
		// recupere la valeur d'une adresse
		String adresse = req.getParameter("adresse");
		// recupere la valeur du numéro Sécurité Sociale
		String numeroSS = req.getParameter("numeroSS");
	

		Boolean param1 = true;
		Boolean param2 = true;
		Boolean param3 = true;
		Boolean param4 = true;
		Boolean param5 = true;
		Boolean param6 = true;

		if ((nom == null) || ("".equals(nom.trim()))) {
			param1 = false;
		}
		if ((prenom == null) || ("".equals(prenom.trim()))) {
			param2 = false;
		}
		if (dateNaissance == null) {
			param3 = false;
		}
		if ((adresse == null) || ("".equals(adresse.trim()))) {
			param4 = false;
		}
		if ((numeroSS == null) || ("".equals(numeroSS.trim()))) {
			param5 = false;
		} else if (numeroSS.length() <= 15) {
			param5 = true;
		} else {
			param6 = false;
		}

		int i = collaborateurs.size() + 1;

		/* Création du Collaborateur avec valeur par défaut et valeur renseignée par le Client*/
		if (param1 & param2 & param3 & param4 & param5 & param6) {
			resp.setStatus(201);
			String matricule = "M-" + i;
			String civilite = "";
			String emailPro = prenom + "." + nom + "@societe.com";
			String photo = "actif";
			String banque = "";
			String iban = "";
			String bic = "";
			Boolean actif = true;
			String numeroTel = "";
			ZonedDateTime zTime = ZonedDateTime.now();
			String fonction = "";
			Departement departement = listDep.get(0);
			LocalDate dateNaissanceLocal = LocalDate.parse(dateNaissance);
			Collaborateur addCollab = new Collaborateur(matricule, civilite, nom, prenom, dateNaissanceLocal, adresse,
					numeroSS, numeroTel, emailPro, photo, zTime, actif, fonction, departement, banque, bic, iban);
			collabService.sauvegarderCollaborateur(addCollab);
			resp.sendRedirect("/sgp/collaborateurs/lister");
		} else {
			resp.setStatus(400);
			req.getRequestDispatcher("/WEB-INF/view/collab/creerCollaborateurs.jsp").forward(req, resp);
		}

	}

}
