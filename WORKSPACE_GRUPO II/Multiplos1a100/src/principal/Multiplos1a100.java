package principal;

import java.util.Scanner;

public class Multiplos1a100 {

	public static void main(String[] args) {
		System.out.println("Bienvenido");
		System.out.println("Este algoritmo mostrara los multiplos del numero dado");
		System.out.println("Por favor ingrese el numero para buscarle los multiplos");
		Scanner consola = new Scanner(System.in);
		int numero = consola.nextInt();

		for (int i = 0; i < 100; i = i + 1) {
			int localI = i + 1;
			if(localI % numero == 0) {
				System.out.println("El numero "+localI+" es multiplo de "+numero);
			}
		}
		

		System.out.println("Termino el programa...");
	}

}
