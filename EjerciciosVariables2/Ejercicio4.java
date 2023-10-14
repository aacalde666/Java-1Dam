package EjerciciosVariables2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Ejercicio4
		/*Recibir un número e indicar si es válido. Es válido si es un número positivo menor que 100 o un
		 *numero negativo menor que -100*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un número para saver si es valido");
		int n = teclado.nextInt();
		if (n<-100 || n> 100) {
			System.out.println("no es un número valido");
		}else {
			int sig = Integer.signum(n);
			n = Math.abs(n);
			int num = n;
			num *= sig;
			System.out.println("este número ("+num+") es valido");
		}
	}

}
