package EjerciciosVariablesIf;

import java.util.Scanner;

public class Ejercicio8Prueba {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		if (numero < -999 || numero < -100 || numero < 100 || numero > 999) {
            System.out.println("El número debe ser de 3 cifras.");
        } else {
            int signo = Integer.signum(numero);
            int numeroAbsoluto = Math.abs(numero);
            int cifra1 = numeroAbsoluto / 100;
            int cifra2 = (numeroAbsoluto / 10) % 10;
            int cifra3 = numeroAbsoluto % 10;
            int[] cifras = {cifra1, cifra2, cifra3};
            java.util.Arrays.sort(cifras);
            int numeroMayor = cifras[2] * 100 + cifras[1] * 10 + cifras[0];
            numeroMayor *= signo;
            System.out.println("El número mayor formado es: " + numeroMayor);
        }
	}

}
