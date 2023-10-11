package EjerciciosVariablesIf;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Ejercicio8
		/*Realizar un programa que lea un número entero de 3 cifras, 
		 *y forme el mayor número posible con las cifras del número ingresado. 
		 *El número formado debe tener el mismo signo que el número ingresado.*/
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un número de 3 cifras");
		int n = teclado.nextInt();
		/*String s;
		int n1;*/
		//Planteamiento a numeros negativos
		if (n>=100&&n<=999) {
			int d1 = n/100;
			int d2 = (n/10)%10;
			int d3 = n%10;
			System.out.println("Prueba de que se recoge bien los numeros,"+d1+""+d2+""+d3);
			int x1;
			if (d1<d2) {
				if (d1>d3) {
					x1 = d1;
					int nm = d1>d2?(d1>d3?d1:d3):(d2>d3?d2:d3);
					int nd = d1<d2?(d1<d3?d1:d3):(d2<d3?d2:d3);
					System.out.println(nm+""+x1+""+nd);
					/*s = String.valueOf(nm)+String.valueOf(x1)+String.valueOf(nd);
					n1 = Integer.valueOf(s);
					System.out.println(n1);*/
				}
			}else {
				if (d1<d3) {
					if (d1>d2) {
						x1 = d1;
						int nm = d1>d2?(d1>d3?d1:d3):(d2>d3?d2:d3);
						int nd = d1<d2?(d1<d3?d1:d3):(d2<d3?d2:d3);
						System.out.println(nm+""+x1+""+nd);
					}
				}
			}if (d2<d1) {
				if (d2>d3) {
					x1 = d2;
					int nm = d1>d2?(d1>d3?d1:d3):(d2>d3?d2:d3);
					int nd = d1<d2?(d1<d3?d1:d3):(d2<d3?d2:d3);
					System.out.println(nm+""+x1+""+nd);
				}
			}else {
				if (d2<d3) {
					if (d2>d1) {
						x1 = d2;
						int nm = d1>d2?(d1>d3?d1:d3):(d2>d3?d2:d3);
						int nd = d1<d2?(d1<d3?d1:d3):(d2<d3?d2:d3);
						System.out.println(nm+""+x1+""+nd);
					}
				}
			}if (d3<d1) {
				if (d3>d2) {
					x1 = d3;
					int nm = d1>d2?(d1>d3?d1:d3):(d2>d3?d2:d3);
					int nd = d1<d2?(d1<d3?d1:d3):(d2<d3?d2:d3);
					System.out.println(nm+""+x1+""+nd);
				}
			}else {
				if (d3<d2) {
					if (d3>d1) {
						x1 = d3;
						int nm = d1>d2?(d1>d3?d1:d3):(d2>d3?d2:d3);
						int nd = d1<d2?(d1<d3?d1:d3):(d2<d3?d2:d3);
						System.out.println(nm+""+x1+""+nd);
					}
				}
			}if (d1==d2&&d1>d3&&d2>d3) {
						int x2=d3;
						System.out.println(d1+""+d2+""+x2);
			}else {
				if (d1==d2&&d1<d3&&d2<d3) {
					int x2=d3;
					System.out.println(x2+""+d1+""+d2);
				}
			}if (d2==d3&&d2>d1&&d3>d1) {
				int x2=d1;
				System.out.println(d2+""+d3+""+x2);
			}else {
				if (d2==d3&&d2<d1&&d3<d1) {
					int x2=d1;
					System.out.println(x2+""+d2+""+d3);
				}
			}if (d1 == d3) {
				System.out.println("capicua");
			}else {
				System.out.println("No capicua");
			}
		}else {
			if (n<100) {
				System.out.println("El número es menor de 3 cifras");
			}else if (n>999){
				System.out.println("El número es mayor de 3 cifras");
			}
		}
	}

}
