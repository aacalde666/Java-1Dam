package EjerciciosVariables;

import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio26 {

	public static void main(String[] args) {
		//Ejercicio26
		/*Escribe un programa que lea de teclado tres variables de tipo double para representar las
		 *longitudes de los lados de un triángulo. Muestra en pantalla si el triángulo es equilátero,
		 *isósceles o escaleno*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe los cm de cada uno de los lados y base del triangulo para saber si es un escaleno, un isosceles o escaleno");
		System.out.print("Escribe los cm de la base del triangulo: ");
		double base = teclado.nextDouble();
		System.out.print("Escribe los cm de la lado izquierdo del triangulo: ");
		double laiz = teclado.nextDouble();
		System.out.print("Escribe los cm de la lado derecho del triangulo: ");
		double lader = teclado.nextDouble();
		/*String res = (base==laiz&&laiz==lader&&lader==base)?"Es un triangulo equilátero":
					 (base<laiz&&laiz==lader&&lader>base)?"Es un triangulo isósceles":
					 (base>laiz&&laiz<lader&&lader>base)||(base<laiz&&laiz>lader&&lader<base)?
							 "Es un triangulo escaleno":"Es otro tipo de triangulo";*/
		String res = (base==laiz&&laiz==lader)?"Equilátero":
					 (base==laiz||base==lader||laiz==lader)?"Isósceles":"Escaleno";
		System.out.println(res);
	}

}