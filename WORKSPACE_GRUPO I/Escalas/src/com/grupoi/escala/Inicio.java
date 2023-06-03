package com.grupoi.escala;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido a las escalas");
		System.out.println("Ingrese el numero a escalar");
		
		DecimalFormat formateador = new DecimalFormat("#");
		Scanner lector = new Scanner(System.in);
		double numeroAEscalar = lector.nextDouble();
		
		
		System.out.println("Ingresa la cantidad de escala");
		int numeroCantidadEscalas = 0;
		
		while (numeroCantidadEscalas < 2) {
			numeroCantidadEscalas = lector.nextInt();
			
			if(numeroCantidadEscalas < 2) {
				System.out.println("Ingresa un numero positivo mayor que 1");
			}
		}
		
		
		double resultado = numeroAEscalar;
		
		for(int i = 1; i <= numeroCantidadEscalas ;i++ ) {
			int y = numeroCantidadEscalas + 1 - i;
			System.out.println(formateador.format(resultado) + "x" + y);
			resultado = resultado * y;
		}
		
		for(int i = 1; i <= numeroCantidadEscalas ;i++ ) {
			int y = numeroCantidadEscalas + 1 - i;
			System.out.println(formateador.format(resultado) + "/" + y);
			resultado = resultado / y;
		}
		
		System.out.println("Termino el programa");

	}

}
