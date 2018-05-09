package GasolineraMarc;

import java.util.Arrays;
import java.util.Scanner;

public class Gasolinera {

	Scanner entrada= new Scanner(System.in);
	Surtidor arraySurtidores[];
	
	public Gasolinera() {
		arraySurtidores= new Surtidor[4];

		for(int i=0; i<arraySurtidores.length; i++)
			arraySurtidores[i]= new Surtidor(); 
		
	}

	public Surtidor[] getArraySurtidores() {
		return arraySurtidores;
	}

	public void setArraySurtidores(Surtidor[] arraySurtidores) {
		this.arraySurtidores = arraySurtidores;
	}

	


	
	public void nuevoCoche(){ //busco el surtidor con menos cola y agrego el coche nuevo a ese surtidor
		String mat, mod, mar;
		Surtidor surtidorMenosCola;
		
		System.out.println("Introduce la matricula del coche");
		mat=entrada.next();
		System.out.println("Introduce la modelo del coche");
		mod=entrada.next();
		System.out.println("Introduce la marca del coche");
		mar=entrada.next();
		
		Coche coche= new Coche(mat, mod, mar);
		
		surtidorMenosCola=arraySurtidores[0];
		
		for(int i=1; i<arraySurtidores.length; i++)
			if(arraySurtidores[i].getColaCoches().size() < surtidorMenosCola.getColaCoches().size())
				surtidorMenosCola=arraySurtidores[i];

		surtidorMenosCola.getColaCoches().add(coche);
		surtidorMenosCola.setLibre(false);

		System.out.println("El coche con matricula "+ coche.getMatricula()+ " ha entrado en el surtidor "+ surtidorMenosCola.getNum()
				+" El surtidor tiene una cola de "+ surtidorMenosCola.getColaCoches().size());
	}




	public void sacarCoche(int nSurtidor){ //de surtidor

		arraySurtidores[nSurtidor-1].getColaCoches().poll();
		if(arraySurtidores[nSurtidor-1].getColaCoches().isEmpty())
			arraySurtidores[nSurtidor-1].setLibre(true);

		if(arraySurtidores[nSurtidor-1].isLibre()){
			System.out.println("El surtidor esta vacio");
			arraySurtidores[nSurtidor-1].setCoche(null);
		}
		else 
			System.out.println("Al surtidor " +arraySurtidores[nSurtidor-1].getNum()  +" aun le quedan "+ arraySurtidores[nSurtidor-1].getColaCoches().size()+ " coches");

	}

	
	@Override
	public String toString() {
		return "Gasolinera [arraySurtidores=" + Arrays.toString(arraySurtidores) + "]";
	}

}
