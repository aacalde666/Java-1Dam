package EjemplosEnClase;

import java.util.Scanner;

public class EjemplosContador {

	public static void main(String[] args) {
		/*PROGRAMA QUE SOLICITA UN NÚMERO POR TECLADO N, A CONTINUACIÓN MOSTRARA CUÁNTOS MULTIPLOS DE N
		 *HAY COMPRENDIDOS ENTRE 1 Y 100*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		/*System.out.print("Escribe un número ");
		int N = teclado.nextInt();
		int n=1;
		int contador=0;
		while (n<=100) {
			
			if (n++%N==0) {
				contador++;
			}
			
		}System.out.println("Esto son todos los multiplos que hay entro 1 y 100: "+contador+" veces");*/
		
		/*PROGRAMA QUE SOLICITA NÚMEROS POR TECLADO HASTA QUE SE INTRODUZCA 0
		 *EL PROGRAMA DEBE MOSTRAR LA MEDIA DE TODOS LOS NUMEROS INTRODUCIDOS*/
		System.out.print("Escribe un número ");
		int n=teclado.nextInt();
		int suma=0;
		int media=0;
		int cont = 0;
		while (n!=0) {
			suma+=n;
			cont++;
			/*Prueba de hasta donde llega el contador y suma*/
			System.out.println("Contador: "+cont);
			System.out.println("suma: "+suma);
			media=suma/cont;
			System.out.println("Esta es la media de todos los números: "+media);
			System.out.print("Escribe otro número ");
			n=teclado.nextInt();
		}System.out.println("------Se termino------");
		
	}

}
