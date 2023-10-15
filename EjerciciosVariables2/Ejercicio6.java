package EjerciciosVariables2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Ejercicio6
		/*Recibir un número entre 1 y 99 e indicar si su decena es un número par o impar
		 *(pero con un algoritmo diverso del que has usado en el ejercicio 4)*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un número entre 1 y 99 para saber si su decena es par o impar");
		int n = teclado.nextInt();
		//int uni;
		int dec;
		if (n>1 && n<99 || n<-1 && n>-99) {
			//uni = n/10;
			dec = n%10;
			if (dec%2==0) {
				System.out.println("La decena del número "+n+" es par: "+dec);
			}else {
				System.out.println("La decena del número "+n+" es impar: "+dec);
			}
		}else {
			System.out.println("Sobrepasastes de los números que te hemos indicado");
		}
	}

}
