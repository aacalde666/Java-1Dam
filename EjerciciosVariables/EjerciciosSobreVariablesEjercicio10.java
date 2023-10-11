package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio10 {

	public static void main(String[] args) {
		//Ejercicio10
		/*Escribe un programa que lea por teclado dos variables enteras para representar la distancia en
		 *kilómetros y el tiempo en horas. Calcula y muestra la velocidad promedio en kilómetros por
		 *hora.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe la distancia recorrida en Km (entero): ");
		int d = teclado.nextInt();
		System.out.print("Escribe el tiempo que durastes en Horas (entero): ");
		int t = teclado.nextInt();
		int res = d/t;
		System.out.println("Esta es la velocidad promedio: "+ res +" Km/h");
	}

}
