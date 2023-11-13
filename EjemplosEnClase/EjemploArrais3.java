package EjemplosEnClase;

public class EjemploArrais3 {

	public static void main(String[] args) {
		/*Programa que declara dos arrays, uno de ellos de 10 posiciones y el otro de 5 posiciones.
		 *Los va a rellenar con números enteros generados aleatoriamente entre 1 y 100.
		 *Mostrara el contenido de los dos arrays.
		 *A continuación copiara las cinco primeras posiciones del primero y segundo.
		 *Volvera a mostrar el contenido de los dos arrays.*/
		int[] n=new int[10], n1=new int[5];
		for (int i=0;i<10;i++) {
			n[i]=(int)(Math.random()*100);
			if (i<5) {
				n1[i]=(int)(Math.random()*100);
			}
		}
		for (int i=0;i<10;i++) {
			System.out.print(n[i]+" ");
		}System.out.println();
		for (int i=0;i<5;i++) {
			System.out.print(n1[i]+" ");
		}
		System.out.println();
		for (int i=0;i<5;i++) {
			n[i]=n1[i];
		}System.out.println("********************************");
		for (int i=0;i<10;i++) {
			System.out.print(n[i]+" ");
		}System.out.println();
		for (int i=0;i<5;i++) {
			System.out.print(n1[i]+" ");
		}System.out.println();
		System.out.println("*********************************");
		System.out.println("Asignamos directamente n=n1");
		n=n1;
		System.out.println("Mostramos los arrays: ");
		for (int i=0;i<5;i++) {
			System.out.print(n[i]+" ");
		}System.out.println();
		for (int i=0;i<5;i++) {
			System.out.print(n1[i]+" ");
		}System.out.println();
	}

}
