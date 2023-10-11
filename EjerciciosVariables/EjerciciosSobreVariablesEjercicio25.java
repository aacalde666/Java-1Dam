package EjerciciosVariables;

import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio25 {

	public static void main(String[] args) {
		//Ejercicio25
		/*Escribe un programa que lea por teclado dos variables de tipo double para representar las notas
		 *de un estudiante en dos evaluaciones. Muestra en pantalla el mensaje “Muy bien” si el alumno
		 *ha aprobado las dos asignatura y la suma de las dos notas es al menos 14.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe la nota del alumno de una de sus evaulaciones (1º): ");
		double d1 = teclado.nextDouble();
		System.out.print("Escribe la nota del alumno de una de sus evaulaciones (2º): ");
		double d2 = teclado.nextDouble();
		String res = (d1>=5.0&&d1<=10.0)&&(d2>=5.0&&d2<=10.0)?(d1+d2)>=14.0?"Muy bien, sacaste buenas calificaciones":"Necesitas mejorar":"No aprueba el curso";
		System.out.println(res);
	}

}
