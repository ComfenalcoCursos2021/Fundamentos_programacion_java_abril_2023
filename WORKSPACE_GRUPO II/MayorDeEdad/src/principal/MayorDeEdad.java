package principal;

import java.util.Scanner;

public class MayorDeEdad {
	public static void main(String[] args) {
		
		Scanner consola = new Scanner(System.in);
		
		int edad;
		
		System.out.println("Por favor ingrese la edad:");
		edad = consola.nextInt();
		
		if(edad > 17) {
			System.out.println("La persona es mayor de edad");
		} else {
			System.out.println("La persona es menor de edad");
		}	
		
		System.out.print("\033[H\033[2J");  
		System.out.flush();  

		System.out.println("Termino el programa");
	}

}
