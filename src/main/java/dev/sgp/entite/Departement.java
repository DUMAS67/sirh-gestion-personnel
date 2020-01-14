package dev.sgp.entite;

/* Classe qui définit les attibuts et les méthods relative à un Département*/
public class Departement {

	
	private int id;
	private String nom;
	
	
	
	public Departement(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}



	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}



	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}



	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
	
	
}
