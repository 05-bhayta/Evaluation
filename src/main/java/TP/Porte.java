package TP;

public class Porte {
	
	protected Integer numeroDuPorte;
	
	public Integer getNumeroDuPorte() {
		return numeroDuPorte;
	}

	public void setNumeroDuPorte(Integer numeroDuPorte) {
		this.numeroDuPorte = numeroDuPorte;
	}
	
	
	

	@Override
	public String toString() {
		return "Porte [numeroDuPorte=" + numeroDuPorte + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDuPorte == null) ? 0 : numeroDuPorte.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Porte other = (Porte) obj;
		if (numeroDuPorte == null) {
			if (other.numeroDuPorte != null)
				return false;
		} else if (!numeroDuPorte.equals(other.numeroDuPorte))
			return false;
		return true;
	}
	

	
}
