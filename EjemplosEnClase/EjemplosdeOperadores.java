package EjemplosEnClase;

public class EjemplosdeOperadores {

	public static void main(String[] args) {
		//LA DIVISION ENTERA Y LA DECIMAL
		//NO SON IGUALES, AUNQUE AMBAS SE HACEN CON /
		
		//int n1 = 34, n2 = 35;
		
		/*n1 = n1 / n2;
		//System.out.println(n1);
		double res;
		double d1= 34, d2=35;
		res=d1/d2;
		System.out.println(res);
		//??????????????
		//Y cuando mezclamos tipos
		res=n1/d2;
		System.out.println(res);
		res=n2/d2;
		System.out.println(res);
		//Estos expresiones se pueden mezclar con expresiones:
		
		n2= n1++ * 4;
		n2= n2-- - n1 * 7;*/
		
		/*n1=5;
		n2=n1++*4;
		System.out.println(n2);
		System.out.println(n1);
		
		n1=5;
		n2=++n1*4;
		System.out.println(n2);
		System.out.println(n1);*/
		
		//operaciones relacionales
		/*boolean con;
		n1=3;
		n2=3;
		con = ++n1 == n2;
		System.out.println(con);*/
		
		//Operadores logicos:
		//conbinan condiciones para obtener otra contucion
		
		int stock1 = 76, stock2 = 26;
		boolean almacen1MasStock = stock1 > stock2;
		System.out.println(almacen1MasStock);
		//expresamos la condicion de que el almacen1 tenga mas que el almacen2 y amboos mayor que cero:
		boolean con2 = stock1 > stock2 && stock1 > 0 && stock2 >0;
		System.out.println(con2);
		//mas simple
		boolean con1;
		stock1 = 7;
		stock2 = 10;
		con1 = stock1 > stock2 && stock2++ >0;
		System.out.println(con1);
		System.out.println(stock2);
		con1 = stock1 > stock2 & stock2++ >0;
		System.out.println(con1);
		System.out.println(stock2);
	}

}
