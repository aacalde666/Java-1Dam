package EjemplosEnClase;
import java.util.Scanner;

public class EjerciciosSobreTiposdDeDatosPrimitivos {

	public static void main(String[] args) {
		
		//ejercicio 2
		System.out.println("Ejercicio 2");
		double saldo = 186.5;
		int precio = 75;
		long numero_de_estrellas = 3000000000l;
		String nifString = "50.111.222 X";
		boolean es_hoy_festibo = true;
		System.out.print("Saldo: ");
		System.out.println(saldo);
		System.out.print("Precio: ");
		System.out.println(precio);
		System.out.print("Número de estrellas: ");
		System.out.println(numero_de_estrellas);
		System.out.print("NIF: ");
		System.out.println(nifString);
		System.out.print("Es hoy festibo: ");
		System.out.println(es_hoy_festibo);
		System.out.println("*****************************************************************************");
		//ejercicio3
		System.out.println("Ejercicio 3");
		int n1;
		int n2;
		int n3;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("Pon el primer número entero: ");
		n1 = teclado.nextInt();
		
		System.out.print("Pon el segundo número entero: ");
		n2 = teclado.nextInt();
		
		n3 = n1 + n2;
		System.out.print("Esta es la suma de los dos números: ");
		System.out.println(n3);
		System.out.println("******************************************************************************");
		//ejercicio 4
		System.out.println("Ejercicio 4");
		
		System.out.print("Escribe el valor del lado del cuadrado: ");
		double lado = teclado.nextDouble();
		double area;
		
		area = lado * lado;
		System.out.println("Este es el area del Cuadrado:" + area);
		System.out.println("******************************************************************************");
		//ejercicio 5
		System.out.println("Ejercicio 5");
		System.out.print("Ingresa la base del triángulo (entero): ");
		int base = teclado.nextInt();
		System.out.print("Ingresa la altura del triángulo (entero): ");
		int altura = teclado.nextInt();
		int area1 = (base * altura) / 2;
		System.out.println("El área del triángulo es: " + area1);
		System.out.println("******************************************************************************");
		//ejercicio 6
		String nombre1;
		String nombre2;
		String nombre3;
		int edad1;
		int edad2;
		int edad3;
		System.out.println("Ejercicio 6");
		System.out.println("SON INVENTADOS LOS NOMBRES Y EDADES");
		System.out.print("Ingrese el nombre de la persona 1: ");
        nombre1 = teclado.next();
        System.out.print("Ingrese la edad de " + nombre1 + ": ");
        edad1 = teclado.nextInt();
        
        System.out.print("Ingrese el nombre de la persona 2: ");
        nombre2 = teclado.next();
        System.out.print("Ingrese la edad de " + nombre2 + ": ");
        edad2 = teclado.nextInt();
        
        System.out.print("Ingrese el nombre de la persona 3: ");
        nombre3 = teclado.next();
        System.out.print("Ingrese la edad de " + nombre3 + ": ");
        edad3 = teclado.nextInt();
        
        double mediaEdad = (edad1 + edad2 + edad3) / 3.0;
        
        System.out.println("La media de edad de " + nombre1 + ", " + nombre2 + " y " + nombre3 + " es " + mediaEdad);
        System.out.println("******************************************************************************");
	}

}
