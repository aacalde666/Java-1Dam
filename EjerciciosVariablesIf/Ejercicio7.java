package EjerciciosVariablesIf;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Ejercicio7
		/*Realizar un programa que lea tres números enteros e indique cuál es el mayor de los tres.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe el primer número");
		int n1 = teclado.nextInt();
		System.out.println("Escribe el segundo número");
		int n2 = teclado.nextInt();
		System.out.println("Escribe el tercer número");
		int n3 = teclado.nextInt();
		if (n1>n2&&n1>n3) {
			System.out.println("El primer número es el mayo de los 3");
		}else if (n2>n1&&n2>n3) {
			System.out.println("El segundo número es el mayo de los 3");
		}else if (n3>n1&&n3>n2) {
			System.out.println("El tercer número es el mayo de los 3");
		}
	}

}
