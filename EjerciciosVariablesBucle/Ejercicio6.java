package EjerciciosVariablesBucle;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Ejercicio6
		/*Realizar un programa que calcule y muestre la suma de los múltiplos de
		 *5 comprendidos entre dos valores A y B. El programa no permitirá introducir
		 *valores negativos para A y B y verificará que A es menor que B. Si A es mayor que B,
		 *intercambiará sus valores.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe dos números enteros");
		System.out.print("Escribe el primer número ");
		int a=teclado.nextInt();
		System.out.print("Escribe el segundo número ");
		int b=teclado.nextInt();
		int suma=0;
		int n=a,n1=b;
		if (a>b) {
			int temp=a;
			a=b;
			b=temp;
			System.out.println(a+" "+b+" "+temp);
		}
		while (a<=b&&a>0&&b>0) {
			if (a%5==0) {
				suma+=a;
			}
			a++;
		}System.out.println("La suma de los múltiplos de 5 entre " + n + " y " + n1 + " es: " + suma);
		System.out.println("------Se termino------");
		if (a<0||b<0) {
			System.out.println("No se permiten números negativos");
		}
	}

}
