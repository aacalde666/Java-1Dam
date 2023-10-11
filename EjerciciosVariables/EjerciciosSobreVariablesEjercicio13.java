package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio13 {

	public static void main(String[] args) {
		//Ejercicio13
		/*Diseña un programa que lea por teclado dos variables enteras y muestre en pantalla el valor de
		 *la variable con el mayor número.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int n1 = teclado.nextInt();
		int n2 = teclado.nextInt();
		int res = n1>n2?n1:n2;
		System.out.println("El mayor es: "+ res);
		String res2 = n1>n2? "Mayor":"Menor o igual" ;
		System.out.println(n1+" es "+ res2 +" que "+ n2);
	}

}
