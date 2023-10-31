package EjerciciosVariablesBucle;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		/*Programa que dado un número entero, muestre en líneas consecutivas cada una de sus cifras.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número ");
		int n=teclado.nextInt();
		int cociente= n, resto;
		while (cociente>0) {
			//sacamos cifra decimal:
			resto = cociente % 10;
			System.out.println(resto);
			cociente = cociente / 10;
		}
	}

}
