package EjemplosEnClase;

public class EjemplosCharBoolean {

	public static void main(String[] args) {
		
		int numero1 = 87, numero2 = 65;
		
		char c1, c2;
		int n;
		
		c1 = 'á';
		
		c1 = 76;
		c2 = 6;
		
		n = 76;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(n);
		
		System.out.println("***********");
		
		/*CUIDADO: los opedarodes aljebraicos, si lo necesitan convierten los
		 * operandos a números:*/
		/*LO SIGUIENTES NO MUESTRA CARACTERER ASCII 82,
		 * SINO EL NUMERO 82*/
		System.out.println(c1+c2);
		System.out.println((char)(c1+c2));
		
		System.out.println("***********");
		
		char c3 = (char)n;
		System.out.println(c3);
		
		c3 = 'z';
		char c4 = '$';
		
		System.out.println((char)c3+c4);
		
		char c5 = 128;
		System.out.println(c5);
		System.out.println("********************************************************");
		
		//tipo boolean:
		//sirve para guardar informacion sobre si algo ocurre o no:
		//las variables booleanas en realidad representan CONDICIONES, es decir hechos
		//que se cumplen o no se cumplen
		
		boolean pagado = true;
		
		pagado = true;
		pagado = false;
		
		//a una variable booleana se le pueden asirgnar expresiones, siempre y cuando esas expresiones
		//solo tengan dos posibles resultados: verdad o falso
		pagado = numero1 > numero2;
		System.out.println(pagado);
		
		//esta asignacion no seria valida porque el resultado no es true o false, si no un numero:
		//pagado = numero1 + 6;
		
		//ASIGNACIONES CONDICIONADAS:
		
		//queremos asignar a numero1 si pagado esta true
		//o uno si no esta pagado
		numero1 = (pagado)?0:1;
		
		System.out.println(numero1);
		
		numero1 = (numero1 > numero2)?0:1;
		
		System.out.println(numero1);
	}

}
