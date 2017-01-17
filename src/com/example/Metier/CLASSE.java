package com.example.Metier;

import java.util.ArrayList;
import java.util.List;

public  class CLASSE  { 
	
	private Integer idClasse;
	private String LibClasse;
	private Integer NbClasse;

	private List<ELEVE> lesEleves;
	
	public CLASSE(Integer idClasse, String libClasse, Integer nbClasse) {
	super();
	this.idClasse = idClasse;
	LibClasse = libClasse;
	NbClasse = nbClasse;
	lesEleves = new ArrayList<ELEVE>();
	}

	public Integer getIdClasse() {
		return idClasse;
	}

	public void setIdClasse(Integer idClasse) {
		this.idClasse = idClasse;
	}
	
	public String getLibClasse() {
		return LibClasse;
	}

	public void setLibClasse(String libClasse) {
		LibClasse = libClasse;
	}

	public Integer getNbClasse() {
		return NbClasse;
	}

	public void setNbClasse(Integer nbClasse) {
		NbClasse = nbClasse;
	}

	public List<ELEVE> getLesEleves() {
		return lesEleves;
	}

	public void setEleves(ELEVE unEleve) {
		this.lesEleves.add(unEleve);
	}
	
	public boolean searchEleves(ELEVE unEleve){
		return(this.lesEleves.contains(unEleve));
	}
	
	public void removeEleves(ELEVE unEleve){
		this.lesEleves.remove(unEleve);
	}
}


