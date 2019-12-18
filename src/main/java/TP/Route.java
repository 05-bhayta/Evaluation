package TP;

import java.util.List;

public class Route {
	List<Porte> portes;
	public void addPorte(Porte p) {portes.add(p);}
	@Override
	public String toString() {
		return "Route [portes=" + portes + "]";
	}


}
