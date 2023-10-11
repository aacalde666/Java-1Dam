package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio14 {

	public static void main(String[] args) {
		//Ejercicio14
		/*Escribe un programa que lea por teclado una variable de tipo entero y diga si ese número es par
		 *o impar*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.print("Escribe un número (entero): ");
		n = teclado.nextInt();
		String res =n%2==0?"Par":"impar";
		System.out.println(n+" es "+ res);
		
		String res2 =n/2==n/2.0?"Par":"impar";
		System.out.println(n+" es "+ res2);
		
	}

}
