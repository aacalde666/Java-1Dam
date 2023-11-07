package EjerciciosVariablesBucle;

import java.util.Scanner;

public class EjemplosConFunciones {

	public static void main(String[] args) {
		/*digo para leer cadenas de texto por teclado hasta que se introduzca cadena "fin",
		 *el programa most4rara cuantas vocales ha habido en el total de cadenas*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String cad="";
		int cont=0;
		while (!cad.equals("fin")) {
			System.out.print("Leer cadena: ");
			cad=teclado.nextLine();
			//cad.length() devuelve el número de caracteres de una cadena
			//cad.charAt(i) devuelve el char de cad en podicion i
			//recorer todos loa caracteres de cad para contar todos los que sean vocal
			for (int i=0;i<cad.length(); i++) {
				if (cad.charAt(i)=='a'||cad.charAt(i)=='e'||
						cad.charAt(i)=='i'||cad.charAt(i)=='o'||cad.charAt(i)=='u') {
					cont++;
				}//if
				
			}//for
		}//while
		System.out.println("El total de vocales ha sido: "+(cont-1));
		//////
		System.out.println("**************************************************************");
		cont=0;
		cad="";
		while (!cad.equals("fin")) {
			System.out.print("Leer cadena: ");
			cad=teclado.nextLine();
			int numVocales=contarVocales(cad);
			cont+=numVocales;
		}//while
		System.out.println("El total de vocales ha sido: "+(cont-1));
	}//main
	static int contarVocales(String cadena) {
		int cont=0;
		for (int i=0;i<cadena.length(); i++) {
			if (cadena.charAt(i)=='a'||cadena.charAt(i)=='e'||
					cadena.charAt(i)=='i'||cadena.charAt(i)=='o'||cadena.charAt(i)=='u') {
				cont++;
			}//if
			
		}//for
		return cont;
	}//static
}//clase
