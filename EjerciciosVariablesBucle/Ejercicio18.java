package EjerciciosVariablesBucle;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		/*Programa que lea un número natural y diga si es o no es triangular. 
		 *A saber: un número N es triangular si, y solamente si, es la suma de 
		 *los primeros M números naturales, para algún valor de M. Ejemplo: 
		 *6 es triangular pues 6 = 1 + 2 + 3.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe un número ");
		int n=teclado.nextInt();
		boolean estriangular=false;
		
			for (int i=0;i<n ;i++) {
				int suma=sumaInferiores(i);
				if (suma==n) 
					estriangular=true;
				}
			if (estriangular) {
				System.out.println("El numero es triangular");
			}else {
				System.out.println("El numero no es triangular");
			}
	}static int sumaInferiores(int n){
		int suma=0;
		for (int j=0;j<=n;j++) {
			suma+=j;
		}
		return suma;
	}

}
