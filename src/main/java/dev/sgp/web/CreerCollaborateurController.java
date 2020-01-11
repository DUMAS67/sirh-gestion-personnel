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
	

	public final String COLLAB_COMPTABILITE = "Comptabilité";
	public final String COLLAB_RH = "Ressources Humaines";
	public final String COLLAB_INFORMATQUE = "Informatique";
	public final String COLLAB_ADMINISTRATIF = "Administratif";	
	
	@Override

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

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

		Departement dep0 = new Departement(0, COLLAB_ADMINISTRATIF);
		Departement dep1 =new Departement(1, COLLAB_COMPTABILITE);
		Departement dep2 =new Departement(2, COLLAB_INFORMATQUE);
		Departement dep3 =new Departement(3, COLLAB_RH);
		
		if (listDep.isEmpty()) {
		dpService.sauvegarderDepartement(dep0);
		dpService.sauvegarderDepartement(dep1);
		dpService.sauvegarderDepartement(dep2);
		dpService.sauvegarderDepartement(dep3);
		}
		
		// recupere la valeur d'un nom
		String nom = req.getParameter("nom");
		// recupere la valeur d'une date
		String prenom = req.getParameter("prenom");
		String dateNaissance = req.getParameter("dateNaissance");
		// recupere la valeur d'une adresse
		String adresse = req.getParameter("adresse");
		// recupere la valeur du numéro Sécurité Sociale
		String numeroSS = req.getParameter("numeroSS");
		// recupere la valeur de la fonction
		String fonction = req.getParameter("fonction");
		// recupere la valeur du Departement
		String departement = req.getParameter("departement");

		Boolean param1 = true;
		Boolean param2 = true;
		Boolean param3 = true;
		Boolean param4 = true;
		Boolean param5 = true;
		Boolean param6 = true;
		Boolean param7 = true;		

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
			param5 = false;
		}
		if ((fonction == null) || ("".equals(fonction.trim()))) {
			param6 = false;
		}
		
		
		int indice=0;
		int i = collaborateurs.size()+1;
		Boolean dpOk= true;
		if (param1 & param2 & param3 & param4 & param5 & param6 &param7) {
			resp.setStatus(201);
			String matricule = "M-" + i;
			String emailPro = prenom + "." + nom + "@societe.com";
			String photo = "actif";
			Boolean actif = true;
			ZonedDateTime zTime = ZonedDateTime.now();
			boolean boucle =true;
			int j=0;
			while (boucle && j<listDep.size()) {
				if (departement.equals(listDep.get(j).getNom())) {
					boucle=false;
					dpOk=true;
					indice=j;
				} else { 
					dpOk = false;
				}
				j++;
			}
			if (!dpOk) {
				indice=listDep.size();
				dpService.sauvegarderDepartement(new Departement(indice, departement));
				} 
			Departement departement1 =dpService.listerDepartement().get(indice);
		
			LocalDate dateNaissanceLocal = LocalDate.parse(dateNaissance);
			Collaborateur addCollab = new Collaborateur(matricule, nom, prenom, dateNaissanceLocal, adresse, numeroSS,
					emailPro, photo, zTime, actif, fonction, departement1);
			collabService.sauvegarderCollaborateur(addCollab);
			resp.sendRedirect("/sgp/collaborateurs/lister");
			
		} else {
			resp.setStatus(400);
			req.getRequestDispatcher("/WEB-INF/view/collab/creerCollaborateurs.jsp").forward(req, resp);
		}

	}

}
