package EjerciciosVariables2;

import java.util.Scanner;

public class Ejercicio1y2 {

	public static void main(String[] args) {
		//Ejercicio1
		/*Recibir 4 numeros e indicar el mas pequeño y el mas grande*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe 4 números enteros");
		int n1 = teclado.nextInt();
		int n2 = teclado.nextInt();
		int n3 = teclado.nextInt();
		int n4 = teclado.nextInt();
		/*int res = (n1<n2&&n1<n3&&n1<n4)?n1:(n2<n1&&n2<n3&&n2<n4)?n2:(n3<n1&&n3<n2&&n3<n4)?n3:(n4<n1&&n4<n2&&n4<n3)?n4:0;
		int res2 = (n1>n2&&n1>n3&&n1>n4)?n1:(n2>n1&&n2>n3&&n2>n4)?n2:(n3>n1&&n3>n2&&n3>n4)?n3:(n4>n1&&n4>n2&&n4>n3)?n4:0;
		System.out.println("El numero mas pequeño es: "+res);
		System.out.println("El numero mas grande es: "+res2);*/
		if (n1<n2&&n1<n3&&n1<n4) {
			System.out.println(n1);
		}
		else if (n2<n1&&n2<n3&&n2<n4) {
			System.out.println(n2);
		}
		else if (n3<n1&&n3<n2&&n3<n4) {
			System.out.println(n3);
		}
		else if (n4<n1&&n4<n2&&n4<n3) {
			System.out.println(n4);
		}
		//Ejercicio2
		/*Recibir 4 numeros e indicar si son todos el mismo numero*/
		System.out.println("Si los números son iguales se indicara aqui abajo");
		/*String res3 = (n1==n2&&n2==n3&&n3==n4)?"Son iguales":"No son iguales";
		System.out.println(res3);*/
		if (n1==n2&&n2==n3&&n3==n4) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("No son iguales");
		}
	}
}