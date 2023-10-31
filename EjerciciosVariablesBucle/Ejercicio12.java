package EjerciciosVariablesBucle;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		/*Programa que solicite del usuario un número N
		 *y luego muestre por pantalla la siguiente ejecución:
		 *1
		 *1 2
		 *1 2 3
		 *......
		 *1 2 3 ..... N*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("introduce un número ");
		int N=teclado.nextInt();
		/*int cont=1;
		while (cont<=N) {
			//mostrar linea 1 2 .. cont
			//bucle que muestra todos los numeros desde 1 hasta cont:
			int aux=1;
			while (aux<=cont) {
				System.out.print(aux++ +" ");
				//aux++;
			}
			System.out.println();//Mete un salto de linea
			cont++;
		}*/
		
		/*Lo mismo de arriba lo vamos a hacer con otr sintaxis de bucles: for*/
		for(int cont=1;cont<=N;cont++,System.out.println()) {
			//sentencias de sentencias que se van a repetir
			int aux=1;
			while (aux<=cont) {
				System.out.print(aux++ +" ");
			}
		}
	}

}
