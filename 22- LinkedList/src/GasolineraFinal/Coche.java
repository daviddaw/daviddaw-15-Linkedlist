package GasolineraFinal;

public class Coche {
	String modelo;

	public Coche(String modelo) {//constructor de coche
		this.modelo = modelo;//modelo pasado por parametro
	}

	
	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + "]";
	}
	
	

}
