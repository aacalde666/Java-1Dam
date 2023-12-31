package EjerciciosVariablesIf;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Ejercicio10
		/*Realizar un programa que lea tres longitudes y determine si forman o no un triángulo. 
		 *Si es un triángulo determinar de qué tipo de triángulo se trata entre: 
		 *equilátero (si tiene tres lados iguales), isósceles (si tiene dos lados iguales) 
		 *o escaleno (si tiene tres lados desiguales). Considerar que para formar un 
		 *triángulo se requiere que: "el lado mayor sea menor que la suma de los otros dos lados".*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe el primer lado: ");
		double long1 = teclado.nextDouble();
		System.out.print("Escribe el segundo lado: ");
		double long2 = teclado.nextDouble();
		System.out.print("Escribe el tercer lado: ");
		double long3 = teclado.nextDouble();
		boolean esTriangulo = long1 < long2+long3 || long2 < long1+long3 || long3 < long1+long2;
		if (!esTriangulo) {
			System.out.println("No es un triangulo");
		}else if (long1==long2&&long2==long3) {
			System.out.println("Es un triangulo Equilatero");
		}else if (long1==long2||long2==long3||long3==long1) {
			System.out.println("Es un triangulo Isosceles");
		}else {
			System.out.println("Es un triangulo Escaleno");
		}
		//Ejemplo con switch-case
		switch ((!esTriangulo)?0:(long1==long2&&long2==long3)?1:(long1==long2||long2==long3||long3==long1)?2:3){
			case 0:
				System.out.println("No es un triangulo");
			case 1:
				System.out.println("Es un triangulo Equilatero");
			case 2:
				System.out.println("Es un triangulo Isosceles");
			case 3:
				System.out.println("Es un triangulo Escaleno");
		}
		
	}

}
