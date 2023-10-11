package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio7 {

	public static void main(String[] args) {
		//Ejercicio7
		/*Escribe un programa que lea por teclado dos variables de tipo double para representar el precio
		 *de un artículo y el porcentaje de descuento. Calcula el precio con descuento y muestra el
		 *resultado en pantalla.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		double precio;
		double descuento;
		System.out.print("Escribe el precio del producto: ");
		precio = teclado.nextDouble();
		System.out.print("Escrive el descuento del producto en decimales: ");
		descuento = teclado.nextDouble();
		double res = descuento/100 * precio;
		double res2 = precio - res;
		System.out.println("Estes es el precio con descuento seria: "+ res2);
	}

}
