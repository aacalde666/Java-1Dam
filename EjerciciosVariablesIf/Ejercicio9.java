package EjerciciosVariablesIf;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Ejercicio9
		/*Una compañía dedicada al alquiler de coches cobra un monto fijo de 200 euros 
		 *para los primeros 300 km de recorrido. Para más de 300 km y hasta 1000 km, 
		 *cobra un monto adicional de 15 euros por cada kilómetro en exceso sobre 300, además del fijo. 
		 *Para más de 1000 km cobra un monto adicional de 10 euros por cada kilómetro en exceso sobre 1000, 
		 *además del fijo y de la cantidad extra correspondiente por los kilómetros entre 300 y 1000. 
		 *Realizar un programa que dada la cantidad de kilómetros muestre la cantidad a pagar.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe los km que has hecho con tu coche: ");
		int km=teclado.nextInt();
		System.out.println("Estos son los km que indico: "+km);
		int x;
		if (km<300) {
			System.out.println("El monto a pagar es de 200€");
		}else if (km>300&&km<1000) {
			x = (km-300)*15+200;
			System.out.println("El monto a pagar es de "+x+"€");
		}else if (km>1000) {
			x = (1000-300)*15+(km-1000)*10+200;
			System.out.println("El monto a pagar es de "+x+"€");
		}
	}

}
