package EjerciciosVariablesBucle;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		/*Programa que pida un número, y muestre la lista de números primos inferiores a ese número.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		boolean fin=false;
		while (!fin) {
			System.out.print("Escribe un número ");
			int n=teclado.nextInt();
			teclado.nextLine();
			for (int i=1;i<=n-1;i++) {
				boolean esPrimo=true;
				for(int j=2;j<=i-1;j++) {
					if(i%j==0) {
						esPrimo=false;
					}
				}
				if (esPrimo) {
					System.out.println(i+" es numero primo inferiores a "+n);
				}
			}System.out.println("Quieres continuar s/n");
			String s=teclado.nextLine();
			s=s.toLowerCase();
			if (s.equals("s")) {
			}else {
				fin=true;
			}
		}System.out.println("---Se termino---");
	}

}
