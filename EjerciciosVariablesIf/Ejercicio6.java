package EjerciciosVariablesIf;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Ejercicio6
		/*Realizar un programa que lea dos números y los muestre ordenados de menor a mayor.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe dos números enteros");
		int n1 = teclado.nextInt();
		int n2 = teclado.nextInt();
		if (n1<n2) {
			System.out.println("El orden de menor a mayor es el siguiente: "+n1+", "+n2);
		}else if (n2<n1) {
			System.out.println("El orden de menor a mayor es el siguiente: "+n2+", "+n1);
		}else {
			System.out.println("Los números son iguales: ("+n1+" = "+n2+")");
		}
	}

}
