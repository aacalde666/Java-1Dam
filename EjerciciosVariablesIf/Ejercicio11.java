package EjerciciosVariablesIf;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		//Ejercicio11
		/*Realizar un programa que solicite un nombre, 
		 *y a continuación lo muestre "tu inicial es:X" en mayuscula la inicial*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un nombre");
		String n = teclado.nextLine();
		System.out.println("Este es el nombre que has escrito "+n);
		int inicial = n.charAt(0);
		int a = inicial - 32;
		char b = (char) a;
		System.out.println("Tu inicial es: "+b);
		//Esto pone todas las letras en mayuscula
		//String m = n.toLowerCase();
		//System.out.println(m);
		//otra forma para poner la primera letra en mayuscula pero con todo el nombre
        String p = n.substring(0,1).toUpperCase() + n.substring(1);
        System.out.println(p);
	}

}
