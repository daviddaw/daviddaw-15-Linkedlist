package GasolineraFinal;

import java.util.LinkedList;

public class Surtidor {
	//A
	static int cont;
	
	 int codigo;
	 Coche coche;
	 boolean libre;
	private LinkedList<Coche> colaCoches;//cola de coches
	
	
	//C
	public Surtidor() {
		codigo= cont;
		cont++;
		this.coche = null;
		this.libre = true;
		
		setColaCoches(new LinkedList<Coche>());
		colaCoches=new LinkedList<Coche>();

		

	}
	
	public Surtidor(Coche coche) {
		codigo= cont;
		cont++;
		this.coche = coche;
		this.libre = false;
		this.setColaCoches(new LinkedList<Coche>());
	}
	
	
	
	
	
	
	
	//Los demas Metodos
	
	
	
	//T
	@Override
	public String toString() {
		return "Surtidor [coche=" + coche + ", libre=" + libre + ", colaCoches=" + getColaCoches() + "]";
	}

	//GYS
	public LinkedList<Coche> getColaCoches() { //devolvemos el atibuto colacoches la primera vez vacio
		System.out.println(colaCoches.isEmpty());
				return colaCoches;
	}

	public void setColaCoches(LinkedList<Coche> colaCoches) {
		this.colaCoches = colaCoches;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public Coche getCoche() {
		return coche;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}
	
	

	}
	
	

