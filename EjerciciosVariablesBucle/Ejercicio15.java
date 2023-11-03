package EjerciciosVariablesBucle;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		/*Programa que calcule el mínimo, el máximo y la media
		 *de una lista de números enteros positivos introducidos por el usuario.
		 *La lista finalizará cuando se introduzca un número negativo.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		// Maximo y minimo:
		int suma=0, cont=0;
		int n, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
		do {
			System.out.print("Introduzca valor ");
			n=teclado.nextInt();
			suma=(n>=0)?suma+n:suma;
			cont=(n>=0)?cont+1:cont;
			if (n>0&& n>max) {
				max=n;
			}if (n>0&& n<min) {
				min=n;
			}
		}while(n>=0);
		System.out.println("El maximo es "+max);
		System.out.println("El minimo es "+min);
		System.out.println("Esta es la media de maximo y minimo: "+ (double)suma/cont);
		
	}

}
