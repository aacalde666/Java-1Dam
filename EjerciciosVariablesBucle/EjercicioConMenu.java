package EjerciciosVariablesBucle;

import java.util.Scanner;

public class EjercicioConMenu {

	public static void main(String[] args) {
		/*Programa que muestre de forma repetida un menu de op
		 *a. Potencia
		 *b. Factorial
		 *c. Mostrar arbol
		 *d. Salir*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int opcion;
		do {
			//mostrar menu
			System.out.println("1. Potencia");
			System.out.println("2. Factorial");
			System.out.println("3. Arbol de N lineas");
			System.out.println("4. Salir");
			//leer opcion
			opcion=teclado.nextInt();
			//switch case con la opcion
			switch (opcion) {
			case 1:
				System.out.print("Introduzca base ");
				int base=teclado.nextInt();
				System.out.print("Introduzca exponiente ");
				int exp=teclado.nextInt();
				int potencia=potencia(base,exp);
				System.out.println(potencia);
				break;
			case 2:
				System.out.print("Introduze número ");
				int n=teclado.nextInt();
				int fact=factorial(n);
				System.out.println(fact);
				break;
			case 3:
				System.out.println("introduce un numero");
				int n1=teclado.nextInt();
				arbol(n1);
				break;
			case 4:
				System.out.println("Saliendo programa");
				break;

			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		}while (opcion!=4);
	}static int potencia(int base,int exp) {
		int mult=1;
		for (int i=0;i<exp;i++) {
			mult=mult*base;
		}return mult;
	}static int factorial(int n) {
		int result=1;
		for (int m=n;m>=1;m--) {
			result=result*m;
		}return result;

	}static void arbol(int n1) {
		for (int i=0;i<n1;i++) {
			for (int j=0;j<n1-1-i;j++) {
				System.out.print(" ");
			}
			for (int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}System.out.println();
		}for (int i=n1-1;i>1;i--) {
			for (int j=0;j<n1-i;j++) {
				System.out.print(" ");
			}
			for (int j=0;j<2*i-1;j++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}

}
