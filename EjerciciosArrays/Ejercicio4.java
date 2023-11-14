package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*3.Leer N números (N solicitado previamente por teclado),
		 *a continuación mostrarlos de la siguiente manera: primero, último, segundo, penúltimo, etc.*/
		Scanner teclado=new Scanner(System.in);
		System.out.print("Cuantos numeros vas a introducir: ");
		int N=teclado.nextInt();
		int[] numeros=new int [N];
		for (int i=0;i<numeros.length;i++) {
			System.out.print("Introduce número: ");
			numeros[i]=teclado.nextInt();
		}System.out.println();
		for (int i=0;i<=((N%2==0)?N/2-1:N/2);i++) {
			System.out.print(numeros[i]+" "+numeros[N-i-1]+" ");
		}
		teclado.close();
	}

}
