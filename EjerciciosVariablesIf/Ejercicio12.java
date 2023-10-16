package EjerciciosVariablesIf;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		//Ejercicio12
		/*Realizar un programa que solicite un día de la semana, 
		 *y a continuación muestre di de trabaja o no
		 *(no se trabajan los fines de semana). Con switch-case.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un día de la semana ej:lunes");
		String dia = teclado.nextLine();
		dia = dia.toLowerCase();
		switch (dia){
			case "lunes","martes","miercoles","jueves","viernes":
				System.out.println("Se trabaja");
				break;
			case "sabado","domingo":
				System.out.println("No se trabaja");
				break;
			default:
				System.out.println("No te estas refiriendo a un dia");
		}
	}

}
