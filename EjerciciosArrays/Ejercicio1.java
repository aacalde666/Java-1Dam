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
		///////////////Otro planteamiento
		//seria el caso en el que la cantidad de numeros que se van a usar no la podemos saber
		//hasta despues de haber declarado el arrey
		int[] numeros2=new int [10000];
		System.out.print("Cuantos números vas a introducir? (menos de 10000): ");
		int N1=teclado.nextInt();
		for (int i=0;i<N1;i++) {
			System.out.print("Introduce número: ");
			numeros2[i]=teclado.nextInt();
		}System.out.println();
		for (int i=N1-1;i>=0;i--) {
			System.out.print(numeros2[i]+" ");
		}
		teclado.close();
	}

}
