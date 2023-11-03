package EjemplosEnClase;

public class EjemploNumerosAleatorios {

	public static void main(String[] args) {
		//Math.random() funciona en double
		//Generar número aleatorio
		for (int i=0;i<10;i++) {
			int n=(int)(Math.random()*101);
			System.out.println(n);
		}
	}

}
