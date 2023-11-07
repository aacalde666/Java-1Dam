package EjerciciosVariablesBucle;

import java.util.Scanner;

public class EjemploFor {

	public static void main(String[] args) {
		/*Programa dadso un número N solicite tantas cadenas como número se haya introducido
		 *y para cada cadena muestre*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un número ");
		int N=teclado.nextInt();
		teclado.nextLine();
		for(int i=0;i<N;i++) {
			System.out.println("Indice del bucle: "+i);
			System.out.print("Introduzca nombre: ");
			String nombre= teclado.nextLine();
			//devuelvo carácter en posicion 0
			System.out.println((char)(nombre.charAt(0)-32));
		}
	}

}
