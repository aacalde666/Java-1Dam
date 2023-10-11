package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio16 {

	public static void main(String[] args) {
		//Ejercicio16
		/*Escribe un programa que lea por teclado dos variables enteras para representar la cantidad de
		 *productos en dos almacenes diferentes. Muestra en pantalla un mensaje que indique cuál de los
		 *dos almacenes tiene más productos*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe la cantidad que hay en el primer almacen: ");
		int almacen1 = teclado.nextInt();
		System.out.print("Escribe la cantidad que hay en el segundo almacen: ");
		int almacen2 = teclado.nextInt();
		String resalmacen = (almacen1>almacen2)?"almacen 1":"almacen 2";
		String resalmacen1 = (almacen1<almacen2)?"almacen 1":"almacen 2";
		int res = (almacen1>almacen2)?almacen1:almacen2;
		int res1 = (almacen1<almacen2)?almacen1:almacen2;
		System.out.println("En "+resalmacen+" tiene ("+res+") mas que "+resalmacen1+" tiene ("+res1+")");
	}

}
