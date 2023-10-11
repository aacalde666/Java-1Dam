package EjerciciosVariablesIf;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Ejercicio3
		/*Realizar un programa que dado un número entero indique si es o no par.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un número para saber si es par o impar");
		int n = teclado.nextInt();
		if (n%2==0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
	}

}
