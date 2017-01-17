package com.example.Metier;

import java.util.*;

import android.R.integer;



public  class DEVOIR  { 
	
		private Integer idDevoir;
		private Date DateDevoir;
	
		List<ELEVE> LesEleves;
		Map<ELEVE,Float> Participer;
		MATIERE uneMatiere;
		
		public DEVOIR(Integer idDevoir, Date DateDevoir, MATIERE uneMatiere) {
			super();
			this.idDevoir = idDevoir;
			this.DateDevoir = DateDevoir;
			this.uneMatiere = uneMatiere;
			this.Participer = new Hashtable<ELEVE,Float>();
		}

		public Integer getIdDevoir() {
			return idDevoir;
		}

		public void setIdDevoir(Integer idDevoir) {
			this.idDevoir = idDevoir;
		}

		public Date getDateDevoir() {
			return DateDevoir; 
		}

		public void setDateDevoir(Date dateDevoir) {
			DateDevoir = dateDevoir;
		}
		
		
		public List<ELEVE> getLesEleves() {
			return LesEleves;
		}

		public void setLesEleves(List<ELEVE> lesEleves) {
			LesEleves = lesEleves;
		}
		
		public void addEleves(ELEVE unEleve){
			this.LesEleves.add(unEleve);
		}

		public void removeEleves(ELEVE unEleve){
			this.LesEleves.remove(unEleve);
		}
		
		public Map<ELEVE, Float> getParticiper() {
			return Participer;
		}

		public ELEVE removeLesEleves(int index) {
			ELEVE traitementSupprime=null;
			if (index>0 && index < this.LesEleves.size()) traitementSupprime=this.LesEleves.remove(index);
			return traitementSupprime;
		}

		public void removeAllLesEleves() {
			this.LesEleves.clear();
		}

		public ELEVE getLesEleves(int index) {
			ELEVE traitementTrouve=null;
			if (index>0 && index < this.LesEleves.size()) traitementTrouve=this.LesEleves.get(index);
			return traitementTrouve;
		}
		
		public boolean searchKeyParticiper(ELEVE search){
			return (Participer.containsKey(search));
		}

		public boolean searchValueParticiper(integer search){
			return (Participer.containsValue(search));
		}
		
		public void setParticiper(Map<ELEVE, Float> participer) {
			Participer = participer;
		}
		
		public void setParticipereleve(ELEVE unEleve, Float uneNote){
			Participer.put(unEleve, uneNote);
		}

		public MATIERE getUneMatiere() {
			return uneMatiere;
		}

		public void setUneMatiere(MATIERE uneMatiere) {
			this.uneMatiere = uneMatiere;
		}	
}