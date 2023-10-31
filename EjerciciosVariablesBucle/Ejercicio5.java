package EjerciciosVariablesBucle;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Ejercicio5
		/*Programa que sume el número 5 y sus múltiplos hasta el 100 inclusive y
		 *muestre el resultado por pantalla. */
		int n = 5;
		int n1 = n;
		int suma = 0;
		while (suma <= 100) {
			System.out.println("Esta es la suma de los múltiplos de 5 hasta 100: "+suma);
			suma+=n*n1;
			n++;
		}
	}

}
