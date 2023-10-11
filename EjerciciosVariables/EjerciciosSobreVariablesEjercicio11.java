package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio11 {

	public static void main(String[] args) {
		//Ejercicio11
		/*Diseña un programa que lea por teclado una variable double para representar el radio de un
		 *círculo. Calcula y muestra el área del círculo en pantalla.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe el numero con o sin decimales del radio: ");
		double r = teclado.nextDouble();
		double a = 3.14 * r * r;
		System.out.println("Este es el area del circulo: " + a);
	}

}
