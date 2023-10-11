package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio23 {

	public static void main(String[] args) {
		//Ejercicio23
		/*Escribe un programa que lea por teclado tres variables enteras para representar las horas
		 *trabajadas en tres días diferentes. Muestra en pantalla un mensaje que indique si la persona
		 *trabajó entre 8 y 20 horas en el total de los tres días o no*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe en lo siguiente las horas trabajadas en 3 dias distintos");
		System.out.print("Escribe el primer número: ");
		int n1 = teclado.nextInt();
		System.out.print("Escribe el segundo número: ");
		int n2 = teclado.nextInt();
		System.out.print("Escribe el tercer número: ");
		int n3 = teclado.nextInt();
		//String res = (n1>=8&&n1<=20)&&(n2>=8&&n2<=20)&&(n3>=8&&n3<=20)?"trabajo":"no trabajo";
		String res = (n1+n2+n3>=8&&n1+n2+n3<=20)?"trabajo lo suficiente los 3 dias":
					 "no trabajo lo suficiente los 3 dias o sobrepaso las horas indicadas";
		System.out.println("El empleado "+res);
	}

}
