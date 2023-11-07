package EjerciciosVariablesBucle;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		/*Realizar un programa usando bucles que muestre por pantalla la siguiente figura
		 *(siendo el número de filas un valor que se solicita por teclado:
		 *a)    *
		 	   ***
		 	  *****
		 	 *******
		 	 
		 *b)    *
		 	   ***
		 	  *****
		 	 *******
		 	  *****
		 	   ***
		 	    *  */
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		boolean fin=false;
		while (!fin) {
			System.out.print("Introduce un número ");
			int n=teclado.nextInt();
			teclado.nextLine();
			System.out.println("Figura A:");
			for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = i; j >= 1; j--) {
	                System.out.print(j);
	            }
	            for (int j = 2; j <= i; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	        System.out.println("Figura B:");
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = i; j >= 1; j--) {
	                System.out.print(j);
	            }
	            for (int j = 2; j <= i; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	        for (int i = n - 1; i >= 1; i--) {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = i; j >= 1; j--) {
	                System.out.print(j);
	            }
	            for (int j = 2; j <= i; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
			System.out.println("Quieres volver intertarlo? s/n");
			String s=teclado.nextLine();
			s=s.toLowerCase();
			if (s.equals("s")) {
			}else {
				fin=true;
			}
		}System.out.println("---Se termino---");
	}

}
