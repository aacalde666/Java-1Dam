package EjerciciosVariablesBucle;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*Programa que lea de forma repetida un número N. Para cada número leído calculará
		 *y mostrará la suma 1+2+3+...+N. Cada vez que muestre el resultado el programa 
		 *preguntará al usuario si desea continuar, si se introduce s el programa continuará.
		 *En caso contrario finalizará*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		/*int N=1;
		int suma=0;
		int cont=0;
		String s;
		boolean fin=false;
		while (!fin) {
			System.out.print("Escribe un número ");
			N=teclado.nextInt();
			suma=0;
			cont=0;
			while (cont<=N) {
				suma+=cont;
				System.out.println("contador: "+cont);
				System.out.println("La suma consecutiva: "+suma);
				cont++;
			}System.out.println("Esta es la suma acumulativa: "+suma);
			
			System.out.println("Quiere continuar (s para continuar, n para salir)");
			s=teclado.next();
			s=s.toLowerCase();
			if (s.equals("s")) {
				
			}else {
				System.out.println("---se termino---");
				fin=true;	
			}
			
		}System.out.println(suma);*/
		String s="s";
		while (s.equals("s")) {
			System.out.print("Escribe un número ");
			int N=teclado.nextInt();
			//Calcular la suma 1+2+3+...+N
			int suma = 0, sumando=1;
			while (sumando<=N)
				suma+=sumando++;
			////
			System.out.println("La suma de 1+2+...+N es "+suma);
			System.out.print("Quiere seguir (s para seguir, n para salir) ");
			s=teclado.nextLine();
			teclado.nextLine();
			s.toLowerCase();
		}System.out.println("---Se termino---");
	}
}
