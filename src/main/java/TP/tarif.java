package TP;

import java.math.BigDecimal;
import java.time.LocalDateTime;



public class tarif {
	Porte entree ;
	Porte sortie;
	BigDecimal prix;
	LocalDateTime DateValidite;
	
	public Porte getEntree() {
		return entree;
	}
	public void setEntree(Porte entree) {
		this.entree = entree;
	}
	public Porte getSortie() {
		return sortie;
	}
	public void setSortie(Porte sortie) {
		this.sortie = sortie;
	}
	public BigDecimal getPrix() {
		return prix;
	}
	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}
	public LocalDateTime getDateValidite() {
		return DateValidite;
	}
	public void setDateValidite(LocalDateTime dateValidite) {
		DateValidite = dateValidite;
	}
	
	@Override
	public String toString() {
		return "Tarif [entree=" + entree + ", sortie=" + sortie + ", prix=" + prix + ", DateValidite=" + DateValidite
				+ "]";
	}


}
