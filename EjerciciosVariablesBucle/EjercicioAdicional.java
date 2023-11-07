package EjerciciosVariablesBucle;

import java.util.Scanner;

public class EjercicioAdicional {

	public static void main(String[] args) {
		/*Programa que solicita de forma repetida una cadena y un numero.
		 *Se terminara de pedir datos cuando cadena tenga como longituz el numero introducido
		 *a continuacion mostrara la concatenacion de las cadenas y las sumas de los numeros*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int n=1, suma=0;
		String cad="", concat="";
		while (cad.length()!=n) {
			System.out.print("Introduzca cadena ");
			cad=teclado.nextLine();
			System.out.print("Introduzca número ");
			n=teclado.nextInt();
			teclado.nextLine();
			suma+=n;
			concat+=cad;
		}
		System.out.println("La concat es "+concat);
		System.out.println("La suma es: "+suma);
	}

}
