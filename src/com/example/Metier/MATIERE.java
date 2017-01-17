package com.example.Metier;

public  class MATIERE  { 

	private Integer idMatiere;
	private String NomMatiere;
	private Integer CoefMatiere;
	
	public MATIERE(Integer idMatiere, String nomMatiere, Integer coefMatiere) {
	super();
	this.idMatiere = idMatiere;
	NomMatiere = nomMatiere;
	CoefMatiere = coefMatiere;
	}

	public Integer getIdMatiere() {
		return idMatiere;
	}

	public void setIdMatiere(Integer idMatiere) {
		this.idMatiere = idMatiere;
	}

	public String getNomMatiere() {
		return NomMatiere;
	}

	public void setNomMatiere(String nomMatiere) {
		NomMatiere = nomMatiere;
	}

	public Integer getCoefMatiere() {
		return CoefMatiere;
	}

	public void setCoefMatiere(Integer coefMatiere) {
		CoefMatiere = coefMatiere;
	}
}
