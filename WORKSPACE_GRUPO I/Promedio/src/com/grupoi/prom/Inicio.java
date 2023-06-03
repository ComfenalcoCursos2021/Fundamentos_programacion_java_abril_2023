package com.grupoi.prom;

public class Inicio {

	public static float promedio3Numeros(int a, int b, int c) {

		int suma = a + b + c;
		float prom = suma / 3;

		return prom;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bienvenido");

		int n1 = 5;
		int n2 = 15;
		int n3 = 150;

		float promedio = promedio3Numeros(n1, n2, n3);
		System.out.println("El promedio es " + promedio );
		
		float promedioInventado = promedio3Numeros(10, 15, 30);
		System.out.println("Promedio Inventado " + promedioInventado);
		
		System.out.println("Termino el programa");
	}

}
