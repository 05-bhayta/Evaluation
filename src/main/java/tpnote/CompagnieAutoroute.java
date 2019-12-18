package tpnote;

import java.math.BigDecimal;
import java.util.List;

public class CompagnieAutoroute {
	List<Route> routes;
	List<Tarif> tarifs;
	
	public BigDecimal ObtenirTarif(Porte a,Porte b){
		return null;	
	}
	private Tarif getTarifCalculé(Porte a,Porte b) {
		return null;
	}
	private Tarif getTarifExacte(Porte a,Porte b) {
		return null;
	}
	
	
	public void ajouterTarif (Tarif a) {
		tarifs.add(a);
	}
	public void ajouterRoute (Route a) {
		routes.add(a);
	}
	
}