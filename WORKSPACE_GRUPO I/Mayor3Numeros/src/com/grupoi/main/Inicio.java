package com.grupoi.main;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1;
		int numero2;
		int numero3;
		Scanner lector = new Scanner(System.in);

		System.out.println("Bienvenido....... ingrese el primer numero");
		numero1 = lector.nextInt();
		System.out.println("Ingrese el segundo numero");
		numero2 = lector.nextInt();
		System.out.println("Ingrese el tercer numero");
		numero3 = lector.nextInt();

		if (numero1 == numero2) {
			if (numero2 == numero3) {
				System.out.println("Son iguales");
			} else {
				if (numero2 > numero3) {
					System.out.println(numero2 + " Es el numero mayor");
				} else {
					System.out.println(numero3 + " Es el numero mayor");
				}
			}
		} else {
			if (numero2 == numero3) {
				if (numero1 > numero2) {
					System.out.println(numero1 + " Es el numero mayor");
				} else {
					System.out.println(numero2 + " Es el numero mayor");
				}
			} else {
				if (numero1 > numero2) {
					if (numero1 > numero3) {
						System.out.println(numero1 + " Es el numero mayor");
					} else {
						System.out.println(numero3 + " Es el numero mayor");
					}
				} else {
					if (numero2 > numero3) {
						System.out.println(numero2 + " Es el numero mayor");
					} else {
						System.out.println(numero3 + " Es el numero mayor");
					}
				}

			}
		}
		System.out.println("Termino el programa....");

	}
}
