package com.grupoi.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		int numero1;
		int numero2;

		System.out.println("Bienvenido ..... ingrese el primer numero");
		numero1 = lector.nextInt();
		System.out.println("Ingrese el segundo numero");
		numero2 = lector.nextInt();

		if (numero1 == numero2) {
			System.out.println("Los numeros son iguales");
		} else {
			if (numero1 > numero2) {
				System.out.println("El numero mayor es " + numero1);
			} else {
				System.out.println("El numero mayor es " + numero2);
			}
		}

		System.out.println("Termino el programa...");

	}

}
