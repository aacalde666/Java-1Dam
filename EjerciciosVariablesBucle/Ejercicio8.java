package EjerciciosVariablesBucle;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Programa que lea dos números: a y b de tipo int. El programa debe calcular a^b
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe el primer número: ");
		int a=teclado.nextInt();
		System.out.print("Escribe el primer número: ");
		int b=teclado.nextInt();
		int n=0;
		long potencia=1;
		while (n<b) {
			n++;
			potencia*=a;
		}System.out.println("Este es el resultado: "+potencia);
		System.out.println("---Se termino---");
	}

}
