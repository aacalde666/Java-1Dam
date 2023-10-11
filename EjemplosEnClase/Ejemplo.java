package EjemplosEnClase;

public class Ejemplo {

	public static void main(String[] args) {
		
		//Ejemplos con enteros
		//*****************************************************************
		int numero1, numero2;
		
		numero1 = 15;
		numero2 = -27;
		
		//muestra por consola lo que aya en la cadena "numero1";

		System.out.println("numero1");
		
		/*Muestra por consola el CONTENIDO de la
		variable que se llama numero1;*/
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(numero1+numero2);
		
		/*vamos a hacer que numero 2 tenga el doble
		del valor que tiene numero1*/
		numero2 = numero1 * 2;
		
		/*---> en la expresion que se usa para obtener el
		valor a asignar a una variable pude haber a
		su vez otras variables*/
		numero1 = 4;
		numero2 = 5;
		
		numero2 = numero1 * 2 - numero2;
		System.out.println(numero2);
		
		/*Matices en cuanto a la compatibilidad de datos
		en las asignaciones:*/
		long numero3 = 6;
		
		/*la siguiente asignacion no la podemos hacer
		porque podriamos perder parte del contenido
		de numero3 si este ocupa mas de 32 bits:*/
		
		//numero2 = numero3;
		
		/*La siguiente si podemos porque nunca perderiamos
		informacion en el contenido de numero2: PROMOCION AUTOMATICA*/
		numero3 = numero2;
		
		/*mostramos el mayor y menor valor almacenable
		 * en una variable de yipo long:*/
		System.out.println("Maximo y minimo de Long");
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		System.out.println("Maximo y minimo de INT");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		/*Cuando un programa arranca, en la RAM aparecen
		 * muchas variables, además de las nuestras*/
		/*mostramos la variable PI:*/
		System.out.println("es el numero PI");
		System.out.println(Math.PI);
		
		/*esta sentencia da error de compilacion porque la JVM trata
		 * de guardar el número pasado en 32 bits*/
		//numero3 = 11111111111;
		
		/*si añadimos L, guarda el número pasado directamente en 64 bits*/
		numero3 = 11111111111L;
		
		/*ERROR: no puede guardar 64 bits en variable de 32 bits*/
		//numero2 = 11111111111L;
		
		numero3 = 222;
		
		/*¿QUE PODEMOS HACER SI QUEREMOS ASIGNAR UN DATO 64 BITS
		 * A UNA VARIABLE 32 BITS?*/
		//---> CASTING (CONVERSION) PELIGROSA!!!!!
		
		numero3 = 99999999997654L;
		
		/*HACEMOS UN CASTING DE LONG A INT
		SE PONE DELANTE DEL VALOR A CONVERTIR EL TIPO FINAL ENTRE PARÉNTESIS:*/
		numero2 = (int)numero3;
		
		System.out.println(numero3);
		System.out.println(numero2);
		
		//EJEMPLOS CON DECIMALES:
		//***********************************************************************
		
		double decimal1;
		
		float decimal2;
		
		decimal1 = 56.2;
		
		decimal2 = 65.6f;
		
		decimal2 = (float)decimal1;
		
		decimal1 = decimal2;
		
		System.out.println("Maximo y minimo de double");
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		System.out.println("Maximo y minimo de float");
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
	}

}
