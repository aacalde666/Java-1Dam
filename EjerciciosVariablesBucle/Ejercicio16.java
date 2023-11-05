package EjerciciosVariablesBucle;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		/*Programar un juego de adivinanza. El programa pedirá al usuario dos números,
		 *max y min, y un número de intentos, n. El programa obtendrá a continuación un
		 *número aleatorio entre max y min, y el usuario deberá adivinarlo utilizando como
		 *mucho n intentos. Cada vez que el usuario introduce un número, el programa le dice
		 *si es mayor o menor. Al final el programa  indica si se ha ganado o no (para generar
		 *un número aleatorio se puede utilizar la clase Random).*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		boolean fin=false;
		while (!fin) {
			boolean esCorrecto=false;
			System.out.println("A continuación introduce los números que seran el maximo y minimo");
			System.out.print("Introduze el primer número ");
			int n1=teclado.nextInt();
			System.out.print("Introduze el segundo número ");
			int n2=teclado.nextInt();
			System.out.print("Introduze el número de intentos para poder adivinar el número que estara entre el maximo y minimo ");
			int intentos=teclado.nextInt();
			System.out.println("Tienes "+intentos+" intentos");
			if (n1>n2) {
				int temp=n1;
				n1=n2;
				n2=temp;
			}int n3=(int)(Math.random()*(n2-n1))+n1;
			System.out.println("Número aleatorio: "+n3);
			while (!esCorrecto&&intentos>0) {
				intentos--;
				System.out.println("Adivina el numero que se a generado entre maximo y minimo");
				int n=teclado.nextInt();
				teclado.nextLine();
				if (n==n3) {
					esCorrecto=true;
				}
				System.out.println("Te quedan "+intentos+" intentos");
			}if (intentos>0) {
				System.out.println("Lo has adivinado");
			}else if (intentos==0) {
				System.out.println("Se te acabaron los intentos");
			} System.out.println("Quieres volver intertarlo? s/n");
			String s=teclado.nextLine();
			s=s.toLowerCase();
			if (s.equals("s")) {
			}else {
				fin=true;
			}
		}System.out.println("---Se termino---");
	}

}
