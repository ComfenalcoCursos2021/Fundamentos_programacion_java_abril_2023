package com.grupoi;

import java.util.Scanner;

public class Inicio {

	public static int[] rellenarVector(int tamanio) {
		int[] devolver = new int[tamanio];
		
		for (int i = 0; i < tamanio; i++) {
			int numero = (int)(Math.random()*10+1);
			devolver[i] = numero;
		}
		
		return devolver;
		
	}
	
	public static void printVector(int[] a) {	
		
		String cadenaTexto = "[";
		for(int i = 0; i<a.length;i++) {
			if(i == (a.length-1)) {
				cadenaTexto = cadenaTexto + a[i];	
			} else {
				cadenaTexto = cadenaTexto + a[i] + ",";
			}
			
			
		}
		cadenaTexto = cadenaTexto + "]";
		System.out.println(cadenaTexto);
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Scanner lector = new Scanner(System.in);
		int tamanioVector = 5;
		
		tamanioVector = lector.nextInt();
		
		int[] miVector = rellenarVector(tamanioVector);
		
		
		printVector(miVector);
		
		System.out.println("------------ORDENANDO------------");
		for(int m = 0; m < tamanioVector ; m++ ) {
			for(int a=m+1; a < tamanioVector ; a++) {
				
				if(miVector[m] > miVector[a]) {
					int aux = miVector[m];
					miVector[m] = miVector[a];
					miVector[a] = aux;
					printVector(miVector);
					
					Thread.sleep(100);
					
				}
				
			}
		}
		
		printVector(miVector);		
	}
}
