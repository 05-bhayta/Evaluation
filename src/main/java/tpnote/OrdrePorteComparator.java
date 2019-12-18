package tpnote;

import java.util.Comparator;

public class OrdrePorteComparator implements Comparator<Porte> {
	public int compare(Porte a,Porte b) {
		return a.getNumeroDePorte()-b.getNumeroDePorte();
	}
	

}
