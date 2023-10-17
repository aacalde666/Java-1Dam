package EjerciciosVariablesIf;

import java.util.Scanner;

public class EjercicioClase2 {

	public static void main(String[] args) {
		/*REALIZAR UN PROGRAMA QUE FUNCIONE COMO CALCULADORA. MOSTRARA UN MENU:
		 *1. SUMAR
		 *2. MULTIPLICAR
		 *3. ES MULTIPLO
		 *4. ES DIVISOR
		 *LEERA LA OPCION Y PARA CADA OPCION SOLICITARA DOS NUMEROS PARA 
		 *REALIZAR LA OPCION CORRESPONDIENTE*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe el numero de lo que quieres hacer");
		System.out.println("1. Sumar");
		System.out.println("2. Multiplicar");
		System.out.println("3. Saver si es multiplo");
		System.out.println("4. Saver si es divisor");
		int menu = teclado.nextInt();
		int n1,n2,r;
		switch (menu) {
			case 1:
				System.out.println("********Suma********");
				System.out.print("Escribe el primer numero: ");
				n1 = teclado.nextInt();
				System.out.print("Escribe el segundo numero: ");
				n2 = teclado.nextInt();
				r = n1+n2;
				System.out.println("********Esta es la suma de los dos numeros: "+r);
				break;
			case 2:
				System.out.println("********Multiplicar********");
				System.out.print("Escribe el primer numero: ");
				n1 = teclado.nextInt();
				System.out.print("Escribe el segundo numero: ");
				n2 = teclado.nextInt();
				r = n1*n2;
				System.out.println("********Esta es la multiplicacion de los dos numeros: "+r);
				break;
			case 3:
				System.out.println("********Es multiplo********");
				System.out.print("Escribe el primer numero: ");
				n1 = teclado.nextInt();
				System.out.print("Escribe el segundo numero: ");
				n2 = teclado.nextInt();
				if (n1%n2==0) {
					System.out.println(n1+" Es multiplo de "+n2);
				}else if (n2%n1==0){
					System.out.println(n2+" Es multiplo de "+n1);
				}else {
					System.out.println("No son multiplo");
				}
				break;
			case 4:
				System.out.println("********Es divisor********");
				System.out.print("Escribe el primer numero: ");
				n1 = teclado.nextInt();
				System.out.print("Escribe el segundo numero: ");
				n2 = teclado.nextInt();
				if (n1%n2==0) {
					System.out.println(n1+" Es divisor de "+n2);
				}else if (n2%n1==0){
					System.out.println(n2+" Es divisor de "+n1);
				}else {
					System.out.println("No son divisor");
				}
				break;
			default:
				System.out.println("Opcion no valida");
				break;
		}
		
	}

}
