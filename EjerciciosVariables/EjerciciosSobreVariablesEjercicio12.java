package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio12 {

	public static void main(String[] args) {
		//Ejercicio12
		/*Crea un programa que lea por teclado una variable entera para representar la cantidad de
		 *unidades vendidas de un producto y otra variable double para representar el precio unitario.
		 *Calcula y muestra el monto total de ventas.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe las unidades vendidas del producto: ");
		int u = teclado.nextInt();
		System.out.print("Escribe el precio del producto: ");
		double p = teclado.nextDouble();
		double m = u*p;
		System.out.println("El monto total de ventas es: " + m);
	}

}
