package EjerciciosVariablesBucle;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		/*Un número perfecto es un entero positivo igual a
		 *la suma de sus divisores (exceptuando como divisor al propio número).
		 *Escriba un programa que acepte un entero positivo y determine si es un número perfecto.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		boolean fin=false;
		while (!fin) {
			System.out.print("Introduce un número ");
			int n = teclado.nextInt();
			teclado.nextLine();
			int suma=0;
			for (int cont=1;cont<n;cont++){
				if (n%cont==0) {
					suma+=cont;
				}
			}if (suma==n) {
                System.out.println(n+" es un número perfecto.");
            } else {
                System.out.println(n+" no es un número perfecto.");
            }
			System.out.println("Quieres continuar s/n");
			String s = teclado.nextLine();
			s=s.toLowerCase();
			if (s.equals("s")) {
				
			}else {
				fin=true;
			}
		}System.out.println("---Se termino---");
	}

}
