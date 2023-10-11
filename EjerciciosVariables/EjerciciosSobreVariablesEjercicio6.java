package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio6 {

	public static void main(String[] args) {
		//Ejercicio6
		/*Diseña un programa que lea por teclado una variable entera para representar la cantidad de
		 *productos en stock. Luego, pide al usuario que ingrese una cantidad y muestra un mensaje que
		 *diga “hay suficiente stock:” seguido de true si es verdad o false si no lo es*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int stock = 1;
		System.out.print("Escribe un 1 o 0 para saber si ahi stock: ");
		int n = teclado.nextInt();
		String res = (n>=stock&&n<=stock)?"Hay":"No hay";
		System.out.println(res + " stock");
	}

}
