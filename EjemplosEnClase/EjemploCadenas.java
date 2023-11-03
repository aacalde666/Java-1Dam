package EjemplosEnClase;

import java.util.Scanner;

public class EjemploCadenas {

	public static void main(String[] args) {
		/*Programa que solicita nombres hasta que se introduzca la cadena "fin".
		 *A continuación tiene que decir si alguno de los nombres era "casa"*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		boolean ExisteCasa=false;
		String cad;
		int cont=0;
		do {
			System.out.print("Introduzca cadena (para salir ponga fin): ");
			cad=teclado.nextLine();
			cad=cad.toLowerCase();
			if (cad.equals("casa")) {
				ExisteCasa=true;
				cont++;
			}
		}while(!cad.equals("fin"));
		if (ExisteCasa) {
			System.out.println("Se han dicho casa "+cont+" veces");
		}else {
			System.out.println("Ninguna fue casa");
		}
	}

}
