package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio1_2_3 {

	public static void main(String[] args) {
		//Ejercicio1
		/*Escribe un programa en Java que lea por teclado dos variables 
		 *enteras y muestre su suma en pantalla.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int n1;
		int n2;
		System.out.println("***Ejercicio 1 (suma)***");
		System.out.print("Escribe el primer número (entero): ");
		n1 = teclado.nextInt();
		System.out.print("Escribe el segundo número (entero): ");
		n2 = teclado.nextInt();
		int r = n1 + n2;
		System.out.println("La suma de los dos números es: " + r);
		System.out.println("******************************************************************************");
		//Ejercicio 2
		/*Crea un programa que lea por teclado tres variables de tipo doble (números decimales) y calcule 
		 *su promedio. Luego, muestra el resultado en la pantalla*/
		System.out.println("***Ejercicio 2 (promedio)***");
		double d1;
		double d2;
		System.out.print("Escribe el primer número (con decimales): ");
		d1 = teclado.nextDouble();
		System.out.print("Escribe el segundo número (con decimales): ");
		d2 = teclado.nextDouble();
		double r1 = d1+d2/2.0;
		System.out.println("Este es el promedio de los dos números: " + r1);
		System.out.println("******************************************************************************");
		
		//Ejercicio 3
		/*Crea un programa que lea por teclado una variable booleana para representar si un estudiante 
		 *ha aprobado un examen (true si aprobó, false si no). Luego, muestra un mensaje en pantalla que 
		 *indique “El estudiante ha aprobado?” seguido de true o false*/
		System.out.println("***Ejercicio 3***");
		String a1;
		int n3;
		System.out.println("Para saber si el estudiante aprobo");
		System.out.print("Escribe el nombre del estudiante: ");
		a1 = teclado.next();
		System.out.print("Escribe la nota de "+a1+" (entero): ");
		n3 = teclado.nextInt();
		System.out.println("El estudiante "+ a1 +" ha aprobado? "+ (n3>=5&&n3<=10));
	}

}
