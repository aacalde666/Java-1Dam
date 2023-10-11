package EjerciciosVariablesIf;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Ejercicio2
		/*Realizar un programa que lea un año e indique si es o no bisiesto.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe un año para saber si es bisiesto o no: ");
		int n = teclado.nextInt();
		if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
			System.out.println("bisiesto");
		}else {
			System.out.println("no bisiesto");
		}
	}

}
