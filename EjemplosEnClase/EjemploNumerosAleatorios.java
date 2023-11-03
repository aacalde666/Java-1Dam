package EjemplosEnClase;

public class EjemploNumerosAleatorios {

	public static void main(String[] args) {
		//Math.random() funciona en double
		//Generar número aleatorio
		/*for (int i=0;i<10;i++) {
			int n=(int)(Math.random()*101);
			System.out.println(n);
		}*/
		//generar un número aleatorio entre a y b
		int a=12, b=20;
		for(int i=0;i<10;i++) {
			int n=(int)(Math.random()*(b-a))+a;
			System.out.println(n);
		}
	}

}
