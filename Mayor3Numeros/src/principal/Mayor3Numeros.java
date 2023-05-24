package principal;

import java.util.Scanner;

public class Mayor3Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido este programa le ayudara a determinar cual es el mayor de 3 numeros");
		System.out.println("Ingrese los 3 numeros acontinuacion");
		int n1;
		int n2;
		int n3;
		Scanner consola = new Scanner(System.in);
		System.out.println("Primer numero");
		n1 = consola.nextInt();
		System.out.println("Segundo numero");
		n2 = consola.nextInt();
		System.out.println("tercero numero");
		n3 = consola.nextInt();
		
		if(n1 > n2) {
			if(n1 > n3) {
				System.out.println(n1 + " es mayor");
			} else {
				System.out.println(n3 + " es mayor");
			}
		} else {
			if(n2 > n3) {
				System.out.println(n2 + " es mayor");
			} else {
				System.out.println(n3 + " es mayor");
			}
		}
		System.out.println("TERMINO EL PROGRAMA!!");
	}

}
