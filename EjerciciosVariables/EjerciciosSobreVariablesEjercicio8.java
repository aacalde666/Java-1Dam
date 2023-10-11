package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio8 {

	public static void main(String[] args) {
		//Ejercicio8
		/*Crea un programa que lea por teclado una variable entera para representar la cantidad de horas
		 *trabajadas en una semana. Luego, declara una variable double para representar la tarifa por
		 *hora. Calcula y muestra el salario semanal.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int horas;
		System.out.print("Indica las horas que has trabajado en una semana (entero): ");
		horas = teclado.nextInt();
		double tarifa;
		System.out.print("Introduce la tarifa por hora: ");
		tarifa = teclado.nextDouble();
		double sem = horas * tarifa;
		System.out.println("El salario semanal es: " + sem + "€");
		double mes = sem * 4;
		System.out.println("El salario mensual es: " + mes + "€");
	}

}
