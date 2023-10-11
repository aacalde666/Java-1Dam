package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio20 {

	public static void main(String[] args) {
		//Ejercicio20
		/*Escribe un programa que lea por teclado dos variables de tipo double para representar las
		 *calificaciones de un estudiante en dos asignaturas. Muestra en pantalla un mensaje que indique
		 *si el estudiante aprobó al menos una de ellas.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe la primera calificacion del alumno: ");
		double calif1 = teclado.nextDouble();
		System.out.print("Escribe la primera calificacion del alumno: ");
		double calif2 = teclado.nextDouble();
		String res = (calif1>=5&&calif1<=10)||(calif2>=5&&calif2<=10)?"aprobado":"reprobado";
		String res2 = (calif1>=5&&calif1<=10)||(calif2>=5&&calif2<=10)?"una calificación":"ninguna calificación";
		System.out.println("El estudiante "+res+" por lo menos "+res2);
		
		//**************************************************************************************
		/*double calif1;
		double calif2;
		System.out.print("Escribe las dos notas del alumno:");
		String res = ((calif1 = teclado.nextDouble()) >=5 | (calif2 = teclado.nextDouble()) >=5)?"aprobado":"reprobado";
		System.out.println("El estudiante "+res);*/
	}

}
