package principal;

import java.util.Scanner;

public class Escalas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		System.out.println("Escalas");
		Scanner consola = new Scanner(System.in);
		int numeroEscalar = consola.nextInt();
		int numeroMaximoEscala = consola.nextInt();
		
		double  resultado = numeroEscalar;
		
			
		for(int i = 0 ; i < numeroMaximoEscala; i=i+1) {
			int  localI = i+1;
			int y = (numeroMaximoEscala+1)-localI;
			System.out.println(resultado + " x " + y);
			resultado = resultado * y;
		}
		
		for(int i = 0 ; i < numeroMaximoEscala; i++) {
			int  localI = i+1;
			int y = (numeroMaximoEscala+1)-localI;
			System.out.println(resultado + " / " + y);
			resultado = resultado / y;
		}
		
		System.out.println("Termino el programa ...");
	}

}
