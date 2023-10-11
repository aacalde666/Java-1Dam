package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio17 {

	public static void main(String[] args) {
		//Ejercicio17
		/*Escribe un programa que lea por teclado tres variables enteras y muestre en pantalla la suma de
		 *dichos números, pero si la suma es mayor que 100, muestra un mensaje indicando que es
		 *demasiado grande*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("*****SUMA pero no puede pasar de 100*****");
		System.out.print("Escribe el primer número: ");
		int n1 = teclado.nextInt();
		System.out.print("Escribe el segundo número: ");
		int n2 = teclado.nextInt();
		System.out.print("Escribe el tercer número: ");
		int n3 = teclado.nextInt();
		int res = n1+n2+n3;
		System.out.println("Este es el resultado de la suma: "+ ((res<=100)?res:"El número es demasiado grande"));
	}

}
