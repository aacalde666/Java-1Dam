package EjemplosEnClase;
import java.util.Scanner;

public class EjemplosConCadenas {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		String cadena, cadena2;
		
		cadena = "Hola, soy una cadena";
		
		System.out.println(cadena);
		
		cadena2 = "y yo también";
		
		cadena = cadena + cadena2;
		
		System.out.println(cadena);
		
		System.out.print("Introduzca valor entero");
		int n = teclado.nextInt();
		
		cadena = "El valor leido es: " + n;
		System.out.println(cadena);
		}
}
