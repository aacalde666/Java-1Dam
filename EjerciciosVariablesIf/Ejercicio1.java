package EjerciciosVariablesIf;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Ejercicio1
		/*Realizar un programa que dados dos números enteros leídos por teclados, 
		 *diga si alguno de los dos es múltiplo de otro.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe el primer número entero: ");
		int n1 = teclado.nextInt();
		System.out.print("Escribe el segundo número entero: ");
		int n2 = teclado.nextInt();
		if (n1%n2==0||n2%n1==0) {
			System.out.println("Si, es múltiplo del otro");
			if (n1>n2) {
				System.out.println("El Primer número es multiplo del segundo número");
			}else {
				System.out.println("El segundo número es multiplo del primer número");
			}
		}else {
			System.out.println("Ninguno es multiplo del otro");
		}
	}

}
