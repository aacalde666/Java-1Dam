package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio19 {

	public static void main(String[] args) {
		//Ejercicio19
		/*Diseña un programa que lea de teclado tres variables numéricas para representar las notas de
		 *tres asignaturas diferentes. Luego, muestra en pantalla un mensaje que indique si el estudiante
		 *aprueba el curso o repite.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe la primera nota del alumno: ");
		double asig1 = teclado.nextDouble();
		System.out.print("Escribe la segunda nota del alumno: ");
		double asig2 = teclado.nextDouble();
		System.out.print("Escribe la tercera nota del alumno: ");
		double asig3 = teclado.nextDouble();
		String res = (asig1>=5&&asig1<=10)?(asig2>=5&&asig2<=10)?(asig3>=5&&asig3<=10)?"aprueba":"reprueba":"reprueba":"reprueba";
		System.out.println("El alumno "+res+" el curso");
	}

}
