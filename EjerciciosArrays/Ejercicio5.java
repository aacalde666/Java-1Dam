package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*4.Leer dos arrays de N números enteros y
		 *llevarlos a un solo array de 2*N posiciones mezclados
		 *de la siguiente forma: primero del primero, primero del segundo,
		 *segundo del primero, segundo del segundo,…*/
		Scanner teclado = new Scanner(System.in);
		System.out.print("Cuantos números vas a introducir?: ");
		int N=teclado.nextInt();
		int[] numeros1=new int [N], numeros2=new int [N];
		int[] resultado=new int [2*N];
		for (int i=0;i<numeros1.length;i++) {
			System.out.print("Introduce numero: ");
			numeros1[i]=teclado.nextInt();
		}for (int i=0;i<numeros2.length;i++) {
			System.out.print("Introduce numero: ");
			numeros2[i]=teclado.nextInt();
		}
		for (int i=0;i<N;i++) {
			resultado[2*i]=numeros1[i];
			resultado[2*i+1]=numeros2[i];
		}
		for (int i=0;i<resultado.length;i++) {
			System.out.print(resultado[i]+" ");
		}System.out.println();
		System.out.println("*****************************");
		//Otra forma de recorrer arrays:
		//Bucle for-each (Solo para recorer arrays)
		for (int i : resultado) {
			//i es una copia de cada posicion del array:
			System.out.print(i+" ");
		}
		teclado.close();
	}

}
