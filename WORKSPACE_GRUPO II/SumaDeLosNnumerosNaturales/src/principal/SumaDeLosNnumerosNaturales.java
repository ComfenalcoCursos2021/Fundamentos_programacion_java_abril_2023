package principal;

import java.util.Scanner;

public class SumaDeLosNnumerosNaturales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido");
		System.out.println("Este programa le ayudará a sumar los n numero naturales,");
		System.out.println("Por favor ingrese la cantidad de numeros a sumar");
		
		Scanner consola = new Scanner(System.in);
		int n = consola.nextInt();
		int suma = 0;
		
		for(int i = 0; i<n; i=i+1) {
			int localI = i + 1;
			System.out.println("VOY A SUMAR EL VALOR  DE I = " + localI);
			suma = suma + localI;
		}
		
		System.out.println("LA SUMA ES: " + suma);
		
		
		System.out.println("Termino el programa...");
	}

}
