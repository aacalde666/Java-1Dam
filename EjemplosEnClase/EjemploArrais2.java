package EjemplosEnClase;

import java.util.Scanner;

public class EjemploArrais2 {

	public static void main(String[] args) {
		/*Programa que lea 10 números enteros y a continuación muestre la suma
		 *de todos los dispositivos y también la suma de todos los negativos.
		 *Debe mostrar finalmente todos los números leídos*/
		 Scanner teclado=new Scanner(System.in);
		 int sumaPositivos=0,sumaNegativios=0;
		 int[] numeros=new int [10];
		 for (int i=0;i<10;i++) {
			 System.out.print("Introduce número ");
			numeros[i]=teclado.nextInt();
			if (numeros[i]<0) {
				sumaNegativios+=numeros[i];
			}else {
				sumaPositivos+=numeros[i];
			}
		}System.out.println("Positivos suman "+sumaPositivos);
		System.out.println("Negativos suman "+sumaNegativios);
		for (int i=0;i<10;i++) {
			System.out.print(numeros[i]+" ");
		}
		 teclado.close();
	}

}
