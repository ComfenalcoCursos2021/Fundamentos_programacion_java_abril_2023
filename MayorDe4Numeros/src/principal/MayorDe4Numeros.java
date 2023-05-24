package principal;

import java.util.Scanner;

public class MayorDe4Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido este programa le ayudara a determinar cual es el mayor de 4 numeros");
		System.out.println("Ingrese los 4 numeros acontinuacion");
		int n1;
		int n2;
		int n3;
		int n4;
		Scanner consola = new Scanner(System.in);
		System.out.println("Primer numero");
		n1 = consola.nextInt();
		System.out.println("Segundo numero");
		n2 = consola.nextInt();
		System.out.println("tercero numero");
		n3 = consola.nextInt();
		System.out.println("Cuarto numero");
		n4 = consola.nextInt();
		
		if(n1>n2) {
			if(n1>n3) {
				if(n1>n4) {
					System.out.println(n1 + " es el mayor");
				} else {
					System.out.println(n4 + " es el mayor");
				}
			} else {
				if(n3>n4) {
					System.out.println(n3 + " es el mayor");
				} else {
					System.out.println(n4 + " es el mayor");
				}
			}
		} else {
			if(n2>n3) {
				if(n2>n4) {
					System.out.println(n2 + " es el mayor");
				} else {
					System.out.println(n4 + " es el mayor");
				}
			} else {
				if(n3>n4) {
					System.out.println(n3 + " es el mayor");
				} else {
					System.out.println(n4 + " es el mayor");
				}
			}
		}
		
		System.out.println("Termino el programa...");
		
	}

}
