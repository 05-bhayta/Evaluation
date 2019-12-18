package TP;

import java.util.Comparator;

public class OrderPorteComparator implements Comparator<Porte> {
	public int compare(Porte a,Porte b) {
		return a.getNumeroDuPorte()-b.getNumeroDuPorte();
	}

}
