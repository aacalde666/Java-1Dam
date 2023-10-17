package EjerciciosVariablesIf;

import java.util.Scanner;

public class EjercicioClase {

	public static void main(String[] args) {
		/*REALIZAR UN PROGRAMA QUE SOLICITE Y LEA TRES NÚMEROS 
		 *ENTEROS QUE ASUMIMOS QUE ESTAN COMPRENDIDOS ENTRE 0 Y 1000
		 *A CONTINUACIÓN MOSTRARÁ POR PANTALLA EL NÚMERO ENTERO QUE SE FORMA CON LA SENCUENCIA DE LAS 
		 *TRES DECEBAS DE LOS TRES NUMEROS*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe tres numeros enteros entre el 0 y 1000");
		System.out.println("Escribe el primer número");
		int n1 = teclado.nextInt();
		System.out.println("Escribe el segundo número");
		int n2 = teclado.nextInt();
		System.out.println("Escribe el tercer número");
		int n3 = teclado.nextInt();
		if ((n1>0&&n1<1000)&&(n2>0&&n2<1000)&&(n3>0&&n3<1000)) {
			n1 = (n1/10)%10;
			n2 = (n2/10)%10;
			n3 = (n3/10)%10;
			int resultado = n1*100 + n2*10 + n3;
			System.out.println("El número formado es: "+resultado);
			//lo comentado aqui abajo aun no se a dado
			/*String n = String.valueOf(n1)+String.valueOf(n2)+String.valueOf(n3);
			int n4 = Integer.valueOf(n);
			System.out.println("El número formado es: "+n4);*/
		}else {
			System.out.println("Escribistes un número erroneo al indicado en el enunciado");
		}
	}

}
