package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio18 {

	public static void main(String[] args) {
		//Ejercicio18
		/*Diseña un programa que lea de teclado dos variables booleanas para representar si un
		 *estudiante aprobó dos asignaturas diferentes. Luego, muestra en pantalla un mensaje que
		 *indique si el estudiante aprueba el curso o repite.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿El estudiante aprobo la primera asignatura? (true/false): ");
		boolean asig1 = teclado.nextBoolean();
		System.out.print("¿El estudiante aprobo la segunda asignatura? (true/false): ");
		boolean asig2 = teclado.nextBoolean();
		String res = (asig1&&asig2)?"aprueba":"reprueba";
		System.out.println("El estudiante "+res+" el curso");
	}

}
