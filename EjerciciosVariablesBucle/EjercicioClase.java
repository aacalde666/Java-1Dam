package EjerciciosVariablesBucle;

import java.util.Scanner;

public class EjercicioClase {

	public static void main(String[] args) {
		/*PROGRAMA QUE SOLICITA NÚMEROS ENTEROS HASTA QUE SE INTRODUZCA UN CERO.
		 *A CONTINUACIÓN MOSTRARA LA SUMA DE TODOS LO QUE SEAN PAR Y LA SUMA DE
		 *LOS QUE SEAN IMPAR*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca número (0 para terminar)");
		int n=teclado.nextInt();
		int sumarPar=0,sumarImpar=0;
		while (n!=0) {
			
			if (n%2==0) {
				sumarPar+=n;
			}else if (n%2!=0) {
				sumarImpar+=n;
			}
			System.out.println("Suma pares: "+sumarPar);
			System.out.println("Suma impares: "+sumarImpar);
			
			System.out.println("Introduzca número (0 para terminar)");
			n=teclado.nextInt();
		}System.out.println("------Se termino------");
	}

}
