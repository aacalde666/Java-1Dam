package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*1.Leer N números (N solicitado previamente por teclado)
		 *y mostrarlos en orden inverso al introducido.*/
		Scanner teclado=new Scanner(System.in);
		System.out.print("Cuantos números vas a introducir?: ");
		int N=teclado.nextInt();
		int[] numeros=new int [N];
		for (int i=0;i<numeros.length;i++) {
			System.out.print("Introduce número: ");
			numeros[i]=teclado.nextInt();
		}System.out.println();
		for (int i=numeros.length-1;i>=0;i--) {
			System.out.print(numeros[i]+" ");
		}
		teclado.close();
	}

}
