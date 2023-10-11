package EjerciciosVariables;
import java.util.Scanner;

public class EjerciciosSobreVariablesEjercicio24 {

	public static void main(String[] args) {
		//Ejercicio24
		/*Crea un programa que lea por teclado dos variables enteras para representar las edades de dos
		 *personas. Muestra en pantalla un mensaje que indique “Pueden acceder” o no. El acceso es
		 *permitido a personas de mayor de 18 o a personas mayores de 21 que acompañen a un menor
		 *de edad.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe la edad de la primera persona: ");
		int edad = teclado.nextInt();
		System.out.print("Escribe la edad de la segunda persona: ");
		int edad1 = teclado.nextInt();
		String res = (edad>=18)&(edad1>=18)?"Pueden entrar ya que son mayores de edad":
					 ((edad>=21&&edad1<=17)||(edad<=17&&edad1>=21))?
					"Puede entrar ya que el menor va acompañado":"No pueden entrar el menor o los dos son menores";
		System.out.println(res);
	}

}
