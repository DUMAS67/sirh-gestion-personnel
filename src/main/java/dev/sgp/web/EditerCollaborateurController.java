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

public class EditerCollaborateurController extends HttpServlet {

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 * 
	 * 
	 */
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
	private DepartementService deptService = Constantes.DEPT_SERVICE;
	List<Departement> departement = deptService.listerDepartement();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html; charset=UTF-8");
		String matricule = req.getParameter("matricule");

		/* recherche du matricule dans la liste des collaborateurs */
		int j = 0;
		for (int i = 0; i < collaborateurs.size(); i++) {

			if (collaborateurs.get(i).getMatricule().equals(matricule)) {
				j = i;
			}
		}
		req.setAttribute("colMatr", collaborateurs.get(j));
		req.setAttribute("listeDepartement", deptService.listerDepartement());
		req.getRequestDispatcher("/WEB-INF/view/collab/EditerCollaborateur.jsp").forward(req, resp);
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

		/*
		 * affectation des valeurs venant du formulaire, les valeurs par défaut
		 * sont : departement =administratif; les valeurs non sauvegardées sont
		 * initialisées par la création du collaborateur dans la classe
		 * CréerCollaboratuer
		 */
		String matricule = req.getParameter("matricule");
		// recupere la valeur de la civilité
		String civilite = req.getParameter("civilite");
		// recupere la valeur de l'adresse si modification
		String adresse = req.getParameter("adresse");
		// recupere la valeur du numero de téléphone
		String telephone = req.getParameter("telephone");
		// recupere la valeur du Departement
		String departement1 = req.getParameter("departement");
		// recupere la valeur de la fonction
		String fonction = req.getParameter("fonction");
		// recupere la valeur de la banque
		String banque = req.getParameter("banque");
		// recupere la valeur du Iban du compte bancaire
		String iban = req.getParameter("iban");
		// recupere la valeur du Bic du compte bancaire
		String bic = req.getParameter("bic");

		boolean param1 = true;
		boolean param5 = true;
		boolean param2 = true;
		boolean param6 = true;
		boolean param3 = true;
		boolean param7 = true;
		boolean param4 = true;
		boolean param8 = true;
		boolean param9 = true;

		/* Test pour qu'il n'y ait pas de données à null */

		if (civilite == null) {
			param1 = false;
		}
		if (adresse == null) {
			param2 = false;
		}
		if (telephone == null) {
			param3 = false;
		}
		if (departement1 == null) {
			param4 = false;
		}
		if (fonction == null) {
			param5 = false;
		}
		if (banque == null) {
			param6 = false;
		}
		if (iban == null) {
			param7 = false;
		}
		if (bic == null) {
			param8 = false;
		}
		if (matricule == null) {
			param9 = false;
		}

		/*
		 * Cohérence des données saisies et affectations des nouvelles données
		 * pour le collaborateur
		 * 
		 */
		if (param1 & param2 & param3 & param4 & param5 & param6 & param7 & param8 & param9) {
			resp.setStatus(201);

			int j = 0;
			// recherche matricule envoyé sur le formulaire
			for (int i = 0; i < collaborateurs.size(); i++) {
				if (collaborateurs.get(i).getMatricule().equals(matricule)) {
					j = i;
				}
			}
			collaborateurs.get(j).setCivilite(civilite);
			// Réinitiale l'adresse si pas de saisie dans le formulaire à l'état
			// antérieur
			String adresseTampon = collaborateurs.get(j).getAdresse();

			if ("".equals(adresse.trim())) {
				collaborateurs.get(j).setAdresse(adresseTampon);
			} else {
				collaborateurs.get(j).setAdresse(adresse);
			}

			collaborateurs.get(j).setNumeroTelephone(telephone);
			// test si rééllement un département a été choisie, valeur par
			// défaut ="Administratif"
			if (!departement1.equals("Choose...")) {
				collaborateurs.get(j).setDepartement(departement.get(Integer.parseInt(departement1)));
			} else {
				collaborateurs.get(j).setDepartement(departement.get(0));
			}
			collaborateurs.get(j).setIntitulePoste(fonction);
			collaborateurs.get(j).setBanque(banque);
			collaborateurs.get(j).setIban(iban);
			collaborateurs.get(j).setBic(bic);

			req.setAttribute("listeDepartement", deptService.listerDepartement());

			req.setAttribute("listeCollaborateur", collabService.listerCollaborateurs());
			req.getRequestDispatcher("/WEB-INF/view/collab/listerCollaborateurs.jsp").forward(req, resp);

		} else {

			resp.setStatus(400);
			req.setAttribute("listeDepartement", deptService.listerDepartement());

			req.setAttribute("listeCollaborateur", collabService.listerCollaborateurs());
			req.getRequestDispatcher("/WEB-INF/view/collab/listerCollaborateurs.jsp").forward(req, resp);
		}

	}

}
