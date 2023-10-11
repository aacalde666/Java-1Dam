package EjerciciosVariablesIf;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Ejercicio5
		/*Realizar un programa que lea un número entero de tres cifras e indique si se 
		 *lee igual de izquierda a derecha que de derecha a izquierda.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe un número de 3 cifras: ");
		int n = teclado.nextInt();
		if (n>=100 && n<=999) {
			int d1 = n/100;
			int d3 = n%10;
			if (d1 == d3) {
				System.out.println("Se le igual de izquierda a derecha que de derecha a izquierda");
			}else {
				System.out.println("Los números son diferentes");
			}
		}else {
			if (n<100) {
				System.out.println("El número es menor de 3 cifras");
			}else if (n>999){
				System.out.println("El número es mayor de 3 cifras");
			}
		}
	}

}
