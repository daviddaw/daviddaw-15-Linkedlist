package GasolineraMarc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada= new Scanner(System.in);

		Gasolinera gasolinera= new Gasolinera();
		int n;
		String repetir;

		/*	
		Coche c1 = new Coche("asd", "dsd", "asd");

		//Surtidor s1 = new Surtidor(); 

		for(int i=0; i<g1.getArraySurtidores().length; i++)
			g1.getArraySurtidores()[i]= new Surtidor(); 


		//s1.getColaCoches().add(c1);


		System.out.println(g1.toString());

		//System.out.println(s1.toString());

		g1.getArraySurtidores()[1].getColaCoches().add(c1);

		System.out.println(g1.toString());

		 */


		gasolinera.arraySurtidores[0].getColaCoches().add(new Coche("AAA", "BBB", "12345C"));
		gasolinera.arraySurtidores[0].setCoche(new Coche("AAA", "BBB", "12345C"));
		gasolinera.arraySurtidores[0].setLibre(false);
		gasolinera.arraySurtidores[0].getColaCoches().add(new Coche("AAA", "BBB", "9"));
		gasolinera.arraySurtidores[0].getColaCoches().add(new Coche("AAA", "BBB", "0"));
		gasolinera.arraySurtidores[0].getColaCoches().add(new Coche("AAA", "BBB", "11111"));


		gasolinera.arraySurtidores[1].getColaCoches().add(new Coche("AAA", "BBB", "2222"));
		gasolinera.arraySurtidores[1].setCoche(new Coche("AAA", "BBB", "2222"));
		gasolinera.arraySurtidores[1].setLibre(false);
		gasolinera.arraySurtidores[1].getColaCoches().add(new Coche("AAA", "BBB", "555555"));
		gasolinera.arraySurtidores[1].getColaCoches().add(new Coche("AAA", "BBB", "8"));


		gasolinera.arraySurtidores[2].getColaCoches().add(new Coche("AAA", "BBB", "33333"));	
		gasolinera.arraySurtidores[2].setCoche(new Coche("AAA", "BBB", "33333"));
		gasolinera.arraySurtidores[2].setLibre(false);
		gasolinera.arraySurtidores[2].getColaCoches().add(new Coche("AAA", "BBB", "6"));
		gasolinera.arraySurtidores[2].getColaCoches().add(new Coche("AAA", "BBB", "7"));



		gasolinera.arraySurtidores[3].getColaCoches().add(new Coche("AAA", "BBB", "44444"));
		gasolinera.arraySurtidores[3].setCoche(new Coche("AAA", "BBB", "44444"));
		gasolinera.arraySurtidores[3].setLibre(false);



		do{

			System.out.println("Menu:\n"
					+ "1.	Llegada de un coche a la gasolinera para repostar\n"
					+ "2.	Salida del coche de la gasolinera despu�s de repostar\n"
					+ "3.	Listado de los datos de los surtidores (si est� libre u ocupado, el coche que lo ocupa en ese caso y  los coches que hay en las colas).\n");
			n= entrada.nextInt();

			switch(n){

			case 1:
				gasolinera.nuevoCoche();
				break;

			case 2:
				int nSurtidor;
				System.out.println("Introduce el numero del surtidor");
				nSurtidor=entrada.nextInt();
		
				while(nSurtidor<1 || nSurtidor>4){
					System.out.println("Surtidor incorrecto.");
					System.out.println("Introduce el numero del surtidor");
					nSurtidor=entrada.nextInt();
				}

				gasolinera.sacarCoche(nSurtidor);
				break;

			case 3:
				System.out.println(gasolinera.toString());
				break;
			}
			System.out.println("Deseas realizar otra operacion S/N");
			repetir=entrada.next();
		}while(repetir.equalsIgnoreCase("s"));


		//comprobar el set null coche cuando se saca de la cola en el surtidor 4
	
		



	}
	
}
