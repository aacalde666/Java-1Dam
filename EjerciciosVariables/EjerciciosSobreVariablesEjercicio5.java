package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio5 {

	public static void main(String[] args) {
		//Ejercicio5
		/*Escribe un programa que lea por teclado dos variables enteras para representar el ancho y la
		 *altura de un rectángulo. Calcula y muestra el área del rectángulo en pantalla.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Pon el primer número del la altura del rectangulo (entero): ");
		int n = teclado.nextInt();
		System.out.print("Pon el segundo número del ancho del rectangulo (entero): ");
		int n1 = teclado.nextInt();
		int res = n * n1;
		System.out.println("El area del rectangulo es: " + res);
	}

}
