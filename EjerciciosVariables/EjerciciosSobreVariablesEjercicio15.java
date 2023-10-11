package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio15 {

	public static void main(String[] args) {
		//Ejercicio15
		/*Escribe un programa que lea por teclado dos variables de tipo double y muestre en pantalla el
		 *resultado de la resta de ambas, pero asegurándote de que el resultado nunca sea negativo.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Resta");
		System.out.print("Escribe un numero cualquiera, puede ser con decimales: ");
		double d1 = teclado.nextDouble();
		System.out.print("Escribe otro numero cualquiera, puede ser con decimales: ");
		double d2 = teclado.nextDouble();
		double res = d1-d2;
		System.out.println("Este es el resultado de la restas: "+ 
						((res>=0)?res:"No se puede representar en números negativos"));
	}

}
