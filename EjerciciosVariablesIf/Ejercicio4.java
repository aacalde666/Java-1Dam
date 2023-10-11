package EjerciciosVariablesIf;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Ejercicio4
		/*Realizar un programa que lea un número (que debe ser menor de 10) e indique si es o no primo.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un número menor que 10 para saber si es primo o no");
		int n = teclado.nextInt();
		//Mas completo
		if (n>=0&&n<=10) {
			 if (n==2||n==3||n==5||n==7) {
                System.out.println("El número es primo.");
			}else {
				System.out.println("El número no es primo");
			}
		}else {
			if (n>10) {
			System.out.println("El número deve ser menor que 10");
			}else if (n<0) {
				System.out.println("El número deve ser menor que 0");
			}
		}
		//Mas simple
		System.out.println("********************************************************************");
		if (n>0&&n<=10&&(n==2||n==3||n==5||n==7)) {
            System.out.println("El número es primo.");
		}else {
			System.out.println("El número no es primo");
		}
	}

}
