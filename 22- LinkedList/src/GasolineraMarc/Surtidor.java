package GasolineraMarc;

import java.util.*;

public class Surtidor {
	
	private int num; 
	private boolean libre=true; 
	private Coche coche; 
	private Queue<Coche> colaCoches;
	private static int c=1;

	public Surtidor() {
		colaCoches= new LinkedList<Coche>();
		this.coche = null;
		this.num=c;
		c++;
	}


	public boolean isLibre() {
		return libre;
	}


	public void setLibre(boolean libre) {
		this.libre = libre;
		int num;//borrar
		num=5;
	}


	public Coche getCoche() {
		return coche;
	}


	public void setCoche(Coche coche) {
		this.coche = coche;
	}

	
	
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public Queue<Coche> getColaCoches() {
		return colaCoches;
	}


	public void setColaCoches(Queue<Coche> colaCoches) {
		this.colaCoches = colaCoches;
	}


	@Override
	public String toString() {
		return "Surtidor [num=" + num + ", libre=" + libre + ", coche=" + coche + ", colaCoches=" + colaCoches + "]";
	}


	
	
}
