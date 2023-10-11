package EjemplosEnClase;
import java.util.Scanner;

public class EjemploLecturadeDatos {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner lectorTeclado = new Scanner(System.in);
		
		int n;
		
		long n2;
		
		//leer numero entero:
		System.out.println("introduzca numero entero");
		n = lectorTeclado.nextInt();
		System.out.print("El numero leido es:");
		System.out.println(n);
		
		System.out.println("introduzca numero entero (puede ser long");
		n2 = lectorTeclado.nextLong();
		System.out.print("El numero leido es:");
		System.out.println(n2);
	}

}
//PROG2023