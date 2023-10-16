package EjemplosEnClase;

import java.util.Scanner;

public class EjemploCase {

	public static void main(String[] args) {
		/*
		 *PROGRAMA QUE IMPRIME LA NOTA LITERAL EN FUNCION DE LA NOTA NÚMERICA*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int nota = teclado.nextInt();
		//Version de lo anterior con la sentecia java switch-case
		switch (nota){
			case 0: case 1: case 2: case 3: case 4:	System.out.println("insuficiente");
				break;
			case 5:	System.out.println("aprobado");
				break;
			case 6:	System.out.println("bien");
				break;
			case 7:	
			case 8:	System.out.println("notable");
				break;
			case 9:	
			case 10:System.out.println("sobresaliente");
				break;
			//opcional:
			default:System.out.println("No es una nota");
				break;
		}
	}

}