package GasolineraFinal;

import java.util.Scanner;

public class Gasolinera {
private Surtidor[] arraySurtidores;

public Gasolinera() {
	this.setArraySurtidores(new Surtidor[4]);//IMPORTANTE solo HA DECLARADO QUE HAY posiciones quevalen null
	
	for (int i = 0; i < getArraySurtidores().length; i++) {
		getArraySurtidores()[i]=new Surtidor();//secrean surtidores pero con sus campos a null,0,o false(Por defecto)
	}
	
}


public void metodo1(Coche coche) 
{
	
	boolean vacio = false;
	for (int i = 0;  i < getArraySurtidores().length &&  vacio ; i++) {
	/*	System.out.println(vacio);
		System.out.println("hola");
		if(arraySurtidores[i].getColaCoches().isEmpty())
			vacio=true;
		System.out.println(arraySurtidores[i].getColaCoches().isEmpty()+" "+i);
		
*/
		if (getArraySurtidores()[i].getColaCoches().isEmpty()) {//en el primero vacio
			System.out.println("I F");
			getArraySurtidores()[i].setCoche(coche);
			//System.out.println(arraySurtidores[i].getColaCoches().offerLast(coche));
			vacio =true;

		}else {//si niguno vacio
			System.out.println("E L S E");
			Surtidor surtidor;
			surtidor=buscarSurtidor();
			surtidor.getColaCoches().offerLast(coche);
		}

		
	}	
		
}

public void metodo2() {
	Scanner in = new Scanner(System.in);
	System.out.println("Elige el surtidor");
	int numero;
	numero=in.nextInt();
	System.out.println("acaba de abandonar la cola el vehiculo "+getArraySurtidores()[numero].getColaCoches().pop());
}

public void metodo3() {


	for (int i = 0; i < getArraySurtidores().length; i++) {
		System.out.println(getArraySurtidores()[i].toString());
	}
	
	
	//System.out.println(colaSurtidor.toString());
	// (si está libre u ocupado, el coche que lo ocupa en ese caso y  los coches que hay en las colas).
}



public Surtidor buscarSurtidor() {
	int minimo=Integer.MAX_VALUE;
	int posicion = 0;
	for (int i = 0; i < getArraySurtidores().length; i++) {
		/*arraySurtidores[i].codigo=i;*/ //otra forma de meter el codigo
		   if (getArraySurtidores()[i].getColaCoches().size() < minimo) {
			minimo=getArraySurtidores()[i].getColaCoches().size();//numero de coches
			posicion=i;
		}
		
		
	}
	//System.out.println("El surtidor con menos coches es el "+(minimo+1)+" "+arraySurtidores[minimo]);
	return getArraySurtidores()[posicion];
	
}


public Surtidor[] getArraySurtidores() {
	return arraySurtidores;
}


public void setArraySurtidores(Surtidor[] arraySurtidores) {
	this.arraySurtidores = arraySurtidores;
}




}
