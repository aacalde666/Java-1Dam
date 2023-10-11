package EjerciciosVariables;

import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio21 {

	public static void main(String[] args) {
		//Ejercicio20
		/*Crea un programa que lea por teclado tres variables enteras para representar las edades de tres
		 *personas. Muestra en pantalla un mensaje que indique si al menos dos de ellas son mayores de
		 *21 años*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe la edad de la primera persona: ");
		int n1 = teclado.nextInt();
		System.out.print("Escribe la edad de la segunda persona: ");
		int n2 = teclado.nextInt();
		System.out.print("Escribe la edad de la tercera persona: ");
		int n3 = teclado.nextInt();
		/*String res = (n1>=21&&n2>=21)||(n1>=21&&n3>=21)?"son mayores":
					 (n2>=21&&n1>=21)||(n2>=21&&n3>=21)?"son mayores":
					 (n3>=21&&n1>=21)||(n3>=21&&n2>=21)?"son mayores":"no son mayores";*/
		String res = ((n1>=21&&n2>=21)||(n1>=21&&n3>=21)||(n2>=21&&n3>=21))?"por lo menos 2 son mayores":"no son mayores";
		System.out.println("De las tres personas, "+res);
	}

}
