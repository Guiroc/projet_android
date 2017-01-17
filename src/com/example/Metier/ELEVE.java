package com.example.Metier;

import java.util.*;

public  class ELEVE  { 

	private Integer idEleve;
	private String NomEleve;
	private String PrenomEleve;
	private Date DateNaissEleve;
	
	CLASSE uneClasse;

	public ELEVE(Integer idEleve, String nomEleve, String prenomEleve,Date dateNaissEleve) {
		super();
		this.idEleve = idEleve;
		NomEleve = nomEleve;
		PrenomEleve = prenomEleve;
		DateNaissEleve = dateNaissEleve;
	}

	public Integer getIdEleve() {
		return idEleve;
	}

	public void setIdEleve(Integer idEleve) {
		this.idEleve = idEleve;
	}

	public String getNomEleve() {
		return NomEleve;
	}

	public void setNomEleve(String nomEleve) {
		NomEleve = nomEleve;
	}

	public String getPrenomEleve() {
		return PrenomEleve;
	}

	public void setPrenomEleve(String prenomEleve) {
		PrenomEleve = prenomEleve;
	}

	public Date getDateNaissEleve() {
		return DateNaissEleve;
	}

	public void setDateNaissEleve(Date dateNaissEleve) {
		DateNaissEleve = dateNaissEleve;
	}	
}


