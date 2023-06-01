package principal;

public class Experimentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		long b = 30;
		
		float c = 15;
		
		System.out.println(  "El valor de la variable c es " + c  );
		
		System.out.println("EL VALOR EN CALIENTE -> " + (a/c)  );
		c = c / a;
		System.out.println(  "El valor de la variable c es " + c  );
		
				
		System.out.println(  "El valor de la variable a es " + a  );
		a = a * 1500000;
		System.out.println(  "El valor de la variable a es " + a  );
		System.out.println("---------------");
		System.out.println("El valor maximo del int es " + Integer.MAX_VALUE);
		System.out.println("El valor minimo del int es " + Integer.MIN_VALUE);
		System.out.println("---------------");
		System.out.println("El valor maximo del long es " + Long.MAX_VALUE);
		System.out.println("El valor minimo del long es " + Long.MIN_VALUE);
		System.out.println("---------------");
		System.out.println("El valor maximo del float es " + Float.MAX_VALUE);
		System.out.println("El valor minimo del float es " + Float.MIN_VALUE);
		System.out.println("---------------");
		System.out.println("Termino el programa ... ");
	}

}
