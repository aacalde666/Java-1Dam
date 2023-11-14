package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Declarar un array para contener 10 cadenas de texto. Solicitara dichas cadenas por teclado.
		 *A continuación mostrara todas las cadenas concatenadas empezando por la ultima.*/
		Scanner teclado=new Scanner(System.in);
		String[] cadena=new String [3];
		for (int i=0;i<cadena.length;i++) {
			System.out.print("Introduce palabra:");
			cadena[i]=teclado.nextLine();
		}for (int i=cadena.length-1;i>=0;i--) {
			System.out.print(cadena[i]+" ");
		}System.out.println();
		System.out.println("*********************");
		//Otra forma
		String result="";
		for (int i=cadena.length-1;i>=0;i--) {
			result+=cadena[i]+" ";
		}System.out.println(result);
		teclado.close();
	}

}
