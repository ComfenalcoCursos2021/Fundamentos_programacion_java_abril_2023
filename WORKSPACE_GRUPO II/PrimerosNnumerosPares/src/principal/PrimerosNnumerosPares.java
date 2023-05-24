package principal;

import java.util.Scanner;

public class PrimerosNnumerosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido");
		System.out.println("Este programa va a imprimir los numeros pares entre 0 y n");
		
		Scanner consola = new Scanner(System.in);
		int n = consola.nextInt();
		
		for(int i = 0; i<=n; i=i+1) {
			
			if( i%2 == 0 ) {
				System.out.println(i);
			}
			
		}
		
		System.out.println("Termino el programa...");
	}

}
