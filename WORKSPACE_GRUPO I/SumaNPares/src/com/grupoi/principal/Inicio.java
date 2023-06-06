package com.grupoi.principal;

import java.util.Scanner;

import com.grupoi.utils.UtilTextos;

public class Inicio {

	public static void main(String[] args) {
		UtilTextos.print("Bienvenido a la suma de los n pares");

		UtilTextos.print("Ingrese un numero N");
		Scanner lector = new Scanner(System.in);

		int n = lector.nextInt();
		int suma = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				suma = suma + i;
			}
		}

		

		UtilTextos.print("La suma total es " + suma);

		UtilTextos.print("Termino progrma...");

	}

}
