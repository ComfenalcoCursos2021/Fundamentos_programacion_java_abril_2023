package lanzador;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		int edad;
		System.out.println("Bienvenido, ingrese la edad");

		edad = lector.nextInt();

		System.out.println("La edad ingresada es " + edad);

		if (edad >= 18) {
			System.out.println("Es mayor");
		} else {
			System.out.println("Es menor");
		}

		
		System.out.println("Termino el programa ...");
		lector.close();

	}

}
