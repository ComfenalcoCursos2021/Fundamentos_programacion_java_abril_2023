package principal;

import java.util.Scanner;

public class EscalasConWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Escalas con while");
		Scanner consola = new Scanner(System.in);
		
		int numeroEscalar = consola.nextInt();
		
		System.out.println("Por favor ingrese el numero maximo de escala");
		int numeroMaximoEscala = -1;
		
		while(numeroMaximoEscala < 1 ) {
			
			numeroMaximoEscala = consola.nextInt();
			if(numeroMaximoEscala < 1) {
				System.out.println("Por favor ingrese un numero positivo mayor que 0");
			}
		}
		
		
		
		
		
		double  resultado = numeroEscalar;
		
			
		//for(int i = 0 ; i < numeroMaximoEscala; i=i+1)
			
		
		int i = 0;
		
		while(i < numeroMaximoEscala) {
			
			int  localI = i+1;
			int y = (numeroMaximoEscala+1)-localI;
			System.out.println(resultado + " x " + y);
			resultado = resultado * y;
			
			
			i=i+1;
		}
		
		i = 0;
		
		while(i < numeroMaximoEscala) {
			
			int  localI = i+1;
			int y = (numeroMaximoEscala+1)-localI;
			System.out.println(resultado + " / " + y);
			resultado = resultado / y;
			
			
			i=i+1;
		}
		
		
		
		System.out.println("Termino el programa ...");
	}

}
