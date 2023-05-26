package principal;

import java.util.Scanner;

public class Experimentos {
	public static void main(String[] args) {
		
		
		String numeroGrande = "1";
		for(int i=0;i<308;i++) {
			numeroGrande = numeroGrande + "0";
		}
		System.out.println(numeroGrande);
		
		Scanner consola = new Scanner(System.in);
		
		int edad;
		
		System.out.println("Por favor ingrese la edad:");
		edad = consola.nextInt();
		
		if(edad > 17) {
			System.out.println("La persona es mayor de edad");
		} else {
			System.out.println("La persona es menor de edad");
		}		

		System.out.println("Termino el programa");
	}

}
