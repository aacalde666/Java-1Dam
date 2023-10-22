package EjerciciosVariablesBucle;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Ejercicio4
		/*Programa que muestre la suma por pantalla todos los números naturales del 1 hasta a 500. */
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe un número desde el 1 hasta el 20 ");
		int n = teclado.nextInt();
		while (n>=1){
			int n1 = n;
			int suma = 0;
			while (suma<=500) {
				System.out.println("La suma es: "+suma);
				suma+=n*n1;
				n++;
			}
			System.out.print("Pon otro número ");
			n = teclado.nextInt();
		}System.out.println("Se termino");
	}

}
