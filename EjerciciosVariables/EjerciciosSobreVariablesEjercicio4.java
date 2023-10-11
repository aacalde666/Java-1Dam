package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio4 {

	public static void main(String[] args) {
		//Ejercicio 4
		/*Diseña un programa que lea por teclado una variable entera para representar la edad de un 
		 *usuario. Luego, muestra un mensaje que diga "Eres mayor de edad:” seguido de true si es verdad 
		 *o false si no lo es.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Indica tu edad (entero): ");
		int n1 = teclado.nextInt();
		System.out.println((n1>18)?"Eres mayor de edad":"Eres menor de edad");
	}

}
