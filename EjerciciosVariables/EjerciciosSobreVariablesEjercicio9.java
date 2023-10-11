package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio9 {

	public static void main(String[] args) {
		//Ejercicio 9
		/*Diseña un programa que lea por teclado una variable entera para representar la temperatura en 
		 *grados Celsius. Convierte esta temperatura a grados Fahrenheit utilizando la fórmula: Fahrenheit=
		 *(Celsius * 9/5) + 32, y muestra el resultado.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("***Ejercicio 9***");
		int n1;
		System.out.print("Escribe un numero para grados Celsius (entero): ");
		n1 = teclado.nextInt();
		double fahrenheit = ((n1 * 9d/5) + 32);
		System.out.println("Esta es la temperatura de Celsius a Fahrebheit: " + fahrenheit);
	}

}
