package GasolineraFinal;

import java.util.Scanner;

import GasolineraFinal.Coche;
import GasolineraFinal.Gasolinera;


public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Gasolinera repsol = new Gasolinera();
		Coche coche = new Coche("bmw");//new Coche
		Coche coche2 = new Coche("peugeot");
		
		//pruebas
		//Posicion 0
		
		repsol.getArraySurtidores()[0].getColaCoches().offerLast(new Coche("citroen"));	
		repsol.getArraySurtidores()[0].setCoche(coche);
		repsol.getArraySurtidores()[0].getColaCoches().offerLast(new Coche("Renault"));
		repsol.getArraySurtidores()[0].getColaCoches().offerLast(new Coche("Porche"));
		repsol.getArraySurtidores()[0].getColaCoches().offerLast(new Coche("Audi"));

		//Posicion1 
		repsol.getArraySurtidores()[1].getColaCoches().offerLast(new Coche("skoda"));
		
		//Posicion2 vacio

	
		//posicion3
		repsol.getArraySurtidores()[3].getColaCoches().offerLast(new Coche("seat"));
		
		repsol.getArraySurtidores()[3].getColaCoches().offerLast(new Coche("dacia"));

		
		
		
/*		Coche coche2 = new Coche("22222","Clio","Renault");
		Coche coche3 = new Coche("33333","Rapid","Skoda");
		Coche coche4 = new Coche("44444","Evoque","Range Rover");*/
		int key;
		String respuesta;
		//Coche coche1 = new Coche();
		//Creamosgasolinera
		
	System.out.println("Gasolinera");
	System.out.println(" ");
		do {
		System.out.println("Elige una opcion\r\n"+
				"\n 1.	Llegada de un coche a la gasolinera para repostar\n" + 
				"\n 2.	Salida del coche de la gasolinera después de repostar\n" +
				"\n 3.	Listado de los datos de los surtidores (si esta libre u ocupado, el coche que lo ocupa en ese caso y  los coches que hay en las colas).\n");
		key=in.nextInt();
		switch (key) {
		case 1:		
			//repsol.case1(coche4,coche3);
			
			repsol.metodo1(coche);
			

			break;
		case 2:
			repsol.metodo2();
			
			;
			break;
		case 3:	
			repsol.metodo3();
			break;
		default:System.out.println("Opcion Invalida");
			break;
		}
		System.out.println("�Quieres seguir con las opciones del menu? S/N");
		respuesta=in.next();
	} while (respuesta.equalsIgnoreCase("S"));
		
		
		
		}

	}


