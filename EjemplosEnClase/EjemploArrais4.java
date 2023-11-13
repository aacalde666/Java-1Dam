package EjemplosEnClase;

public class EjemploArrais4 {

	public static void main(String[] args) {
		int[] numeros1,numeros2;
		numeros1=new int[10];
		numeros2=numeros1;
		for (int i=0;i<numeros1.length;i++) {
			numeros1[i]=(int)(Math.random()*50);
		}for (int i=0;i<numeros1.length;i++) {
			System.out.print(numeros1[i]+" ");
		}System.out.println();
		for (int i=0;i<30;i++) {
			System.out.print("*");
		}System.out.println();
		for (int i=0;i<numeros2.length;i++) {
			System.out.print(numeros2[i]+" ");
		}
	}

}
