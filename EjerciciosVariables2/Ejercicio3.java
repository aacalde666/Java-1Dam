package EjerciciosVariables2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Ejercicio3
		/*Recibir un numero entre 1 y 7 e indicar a que dia de la semana corresponde*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe un número dentro del rango entre el 1 y el 7: ");
		int n = teclado.nextInt();
		//ejemplo de la forma que se explico anteriormente
		/*String res = (n<=7)?(n==1)?"Lunes":"Martes":"Es mayor al numero pedido";
		System.out.println(res);*/
		int r = (n<=7)?n:n;
		if(r==1){
			System.out.println("Lunes");
		}
		else if (r==2) {
			System.out.println("Martes");
		}
		else if (r==3) {
			System.out.println("Miercoles");
		}
		else if (r==4) {
			System.out.println("Jueves");
		}
		else if (r==5) {
			System.out.println("Viernes");
		}
		else if (r==6) {
			System.out.println("Sabado");
		}
		else if (r==7) {
			System.out.println("Domingo");
		}
		else {
			System.out.println("Superaste el limite indicado");
		}
	}

}
