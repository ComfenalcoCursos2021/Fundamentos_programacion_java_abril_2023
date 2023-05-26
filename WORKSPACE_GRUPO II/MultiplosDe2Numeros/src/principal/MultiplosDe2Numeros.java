package principal;

import java.util.Scanner;

public class MultiplosDe2Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido");
		System.out.println("Este algoritmo mostrara los multiplos del numero dado");
		System.out.println("Por favor ingrese el numero para buscarle los multiplos");
		Scanner consola = new Scanner(System.in);
		int numero1 = consola.nextInt();
		System.out.println("Ingrese el segundo numero ");
		int numero2 = consola.nextInt();

		for (int i = 0; i < 100; i = i + 1) {
			int localI = i + 1;			

			if (localI % numero1 == 0 && localI % numero2 == 0) {

				System.out.println("El numero " + localI + 
						" es multiplo de " + numero1 + 
						" y " + numero2);
			}
		}

		System.out.println("Termino el programa...");
	}

}
