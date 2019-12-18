package tpnote;

import java.util.List;

public class Route {
	List<Porte> portes;
	
	public void addPorte (Porte a) {
		portes.add(a);
	}

	@Override
	public String toString() {
		return "Route [portes=" + portes + "]";
	}
	

}
