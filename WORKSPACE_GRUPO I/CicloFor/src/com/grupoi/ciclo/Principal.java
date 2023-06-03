package com.grupoi.ciclo;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Bienvenido al ciclo for");
		
		
		String a = "El texto que queramos";
		for (int i = 0; i <= 15; i++) {
			
			System.out.print(a.charAt(i)+"\t");
			
			// System.out.println("La i va por el numero  => " + i);
			
		}
		
		
		System.out.println("Termino el programa");

	}

}
