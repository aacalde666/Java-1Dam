package EjerciciosVariablesBucle;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Ejercicio3
		/*Realizar un programa que muestre por pantalla los números 
		 *del 1 al 100 sin mostrar los múltiplos de 5.*/
		int n = 0;
		while (n<=100) {
			
			if (n%5!=0) {
				System.out.println(n);
			}else {
				System.out.println("");
			}
			n++;
		}
		System.out.println("----Termino----");
	}

}
