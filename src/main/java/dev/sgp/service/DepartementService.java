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


	public List<Departement> listerDepartement() {
		return listeDepartement;
	}

	public void sauvegarderDepartement(Departement dep) {
		listeDepartement.add(dep);
		
	}

}
