package dev.sgp.entite;
/* Classe qui définit les attributs d'un Collaborateur*/
import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {

	private String matricule;
	private String civilite;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private String adresse;
	private String numeroDeSecuriteSociale;
	private String numeroTelephone;
	private String emailPro;
	private String photo;
	private ZonedDateTime dateHeureCreation;
	private Boolean actif;
	private String intitulePoste;
	private Departement departement;
	private String banque; 
	private String bic;
	private String iban;
	
	
	
	public Collaborateur(String matricule, String civilite, String nom, String prenom, LocalDate dateNaissance,
			String adresse, String numeroDeSecuriteSociale, String numeroTelephone, String emailPro, String photo,
			ZonedDateTime dateHeureCreation, Boolean actif, String intitulePoste, Departement departement,
			String banque, String bic, String iban) {
		super();
		this.matricule = matricule;
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
		this.numeroTelephone = numeroTelephone;
		this.emailPro = emailPro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
		this.intitulePoste = intitulePoste;
		this.departement = departement;
		this.banque = banque;
		this.bic = bic;
		this.iban = iban;
	}



	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}



	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}



	/**
	 * @return the civilite
	 */
	public String getCivilite() {
		return civilite;
	}



	/**
	 * @param civilite the civilite to set
	 */
	public void setCivilite(String civilite) {
		this.civilite = civilite;
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



	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}



	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	/**
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}



	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}



	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}



	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	/**
	 * @return the numeroDeSecuriteSociale
	 */
	public String getNumeroDeSecuriteSociale() {
		return numeroDeSecuriteSociale;
	}



	/**
	 * @param numeroDeSecuriteSociale the numeroDeSecuriteSociale to set
	 */
	public void setNumeroDeSecuriteSociale(String numeroDeSecuriteSociale) {
		this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
	}



	/**
	 * @return the numeroTelephone
	 */
	public String getNumeroTelephone() {
		return numeroTelephone;
	}



	/**
	 * @param numeroTelephone the numeroTelephone to set
	 */
	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}



	/**
	 * @return the emailPro
	 */
	public String getEmailPro() {
		return emailPro;
	}



	/**
	 * @param emailPro the emailPro to set
	 */
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}



	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}



	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}



	/**
	 * @return the dateHeureCreation
	 */
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}



	/**
	 * @param dateHeureCreation the dateHeureCreation to set
	 */
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}



	/**
	 * @return the actif
	 */
	public Boolean getActif() {
		return actif;
	}



	/**
	 * @param actif the actif to set
	 */
	public void setActif(Boolean actif) {
		this.actif = actif;
	}



	/**
	 * @return the intitulePoste
	 */
	public String getIntitulePoste() {
		return intitulePoste;
	}



	/**
	 * @param intitulePoste the intitulePoste to set
	 */
	public void setIntitulePoste(String intitulePoste) {
		this.intitulePoste = intitulePoste;
	}



	/**
	 * @return the departement
	 */
	public Departement getDepartement() {
		return departement;
	}



	/**
	 * @param departement the departement to set
	 */
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}



	/**
	 * @return the banque
	 */
	public String getBanque() {
		return banque;
	}



	/**
	 * @param banque the banque to set
	 */
	public void setBanque(String banque) {
		this.banque = banque;
	}



	/**
	 * @return the bic
	 */
	public String getBic() {
		return bic;
	}



	/**
	 * @param bic the bic to set
	 */
	public void setBic(String bic) {
		this.bic = bic;
	}



	/**
	 * @return the iban
	 */
	public String getIban() {
		return iban;
	}



	/**
	 * @param iban the iban to set
	 */
	public void setIban(String iban) {
		this.iban = iban;
	}

	
	
}