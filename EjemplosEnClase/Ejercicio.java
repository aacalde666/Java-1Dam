package EjemplosEnClase;
import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		
		//programa que solicite y lea dos numeros enteros
		//y acontinuacion muestre el mayor de los dos
		
		int n1;
		int n2;
		String n3;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("introducir el primer numero entero:");
		n1 = teclado.nextInt();
		
		System.out.print("introducir el segundo numero entero:");
		n2 = teclado.nextInt();
		
		//poner si son iguales
		//System.out.print("Se mostrara cual de los dos es el mayor:");
		n3 = (n1>n2)?"Este es el número mayor: "+ n1:(n1==n2)?"Los números son iguales":"Este es el núero mayor: "+n2;
		System.out.println(n3);
	}

}
