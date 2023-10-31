package EjerciciosVariablesBucle;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*Programa que pida la estatura (en metros) y sexo (V/M)
		 *de un número indeterminado de personas (mientras el operador quiera).
		 *Posteriormente escribirá la estatura media de los varones y la estatura
		 *media de las mujeres. */
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		double est = 1;
		String sexo;
		String s;
		double sumaV=0;
		double sumaM=0;
		double contV=0;
		double contM=0;
		double mediaV=0;
		double mediaM=0;
		boolean finbucle=false;
		while (!finbucle) {
			System.out.print("Escribe tu estatura (ej: 1,75)");
			est = teclado.nextDouble();
			System.out.print("Pon V(varon) o M(Mujer)");
			sexo=teclado.next();
			sexo=sexo.toUpperCase();
			if (sexo.equals("V")) {
				sumaV=sumaV+est;
				contV++;
			}else if (sexo.equals("M")) {
				sumaM=sumaM+est;
				contM++;
			}
			System.out.println("Contador de V: "+contV);
			System.out.println("Suma de V: "+sumaV);
			System.out.println("------------------------");
			System.out.println("Contador de M: "+contM);
			System.out.println("Suma de M: "+sumaM);
			System.out.println("Quiere continuar? (para continuar poner s o n para terminar)");
			s=teclado.next();
			s=s.toLowerCase();
			if (s.equals("s")) {
				System.out.println("Se continua");
			}else if (s.equals("n")) {
				finbucle=true;
			}
		}mediaV=sumaV/contV;
		mediaM=sumaM/contM;
		System.out.println("Esta es la media de V(Varon): "+mediaV);
		System.out.println("Esta es la media de M(Mujer): "+mediaM);
		
		
		
	}

}
