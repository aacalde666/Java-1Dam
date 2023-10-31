package EjerciciosVariablesBucle;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Programa que lea un número N mayor que 0 y calcule la siguiente suma: 1+2+3+...+N
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe un número: ");
		int N=teclado.nextInt();
		int n1=-1;
		int suma=0;
		while (N>0&&n1<=N) {
			n1++;
			System.out.println("un numero: "+n1);
			suma+=n1;
			System.out.println("Esta es la suma: "+suma);
		}System.out.println("La suma consecutiva es: "+suma);
		System.out.println("---Se termino---");
	}

}
