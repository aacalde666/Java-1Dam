package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio22 {

	public static void main(String[] args) {
		//Ejercicio22
		/*Escribe un programa que lea por teclado tres variables de tipo double para representar las
		 *longitudes de los lados de un triángulo. Muestra en pantalla si el triángulo es equilátero o no*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe el primer lado del triangulo: ");
		double d1 = teclado.nextDouble();
		System.out.print("Escribe el segundo lado del triangulo: ");
		double d2 = teclado.nextDouble();
		System.out.print("Escribe el tercer lado del triangulo: ");
		double d3 = teclado.nextDouble();
		String res = (d1 == d2 && d2 == d3)?"es equilatero":"no es equilatero";
		System.out.println("El triangulo "+res);
	}

}
