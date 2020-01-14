/**
 * 
 */
package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Departement;

/**
 * @author Stagiaire
 *
 */
public class DepartementService {
	

	List<Departement> listeDepartement = new ArrayList<>(0);

	public final String COLLAB_COMPTABILITE = "Comptabilité";
	public final String COLLAB_RH = "Ressources Humaines";
	public final String COLLAB_INFORMATQUE = "Informatique";
	public final String COLLAB_ADMINISTRATIF = "Administratif";

	

	public DepartementService() {
		super();
		/* affecte la liste avec les valeurs des constantes de département*/
		Departement dep0 = new Departement(0, COLLAB_ADMINISTRATIF);
		Departement dep1 = new Departement(1, COLLAB_COMPTABILITE);
		Departement dep2 = new Departement(2, COLLAB_INFORMATQUE);
		Departement dep3 = new Departement(3, COLLAB_RH);
		sauvegarderDepartement(dep0);
		sauvegarderDepartement(dep1);
		sauvegarderDepartement(dep2);
		sauvegarderDepartement(dep3);
		this.listeDepartement=listerDepartement();
	}

	public List<Departement> listerDepartement() {
		return listeDepartement;
	}

	public void sauvegarderDepartement(Departement dep) {
		listeDepartement.add(dep);
		
	}

}
