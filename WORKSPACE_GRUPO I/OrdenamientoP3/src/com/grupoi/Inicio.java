package com.grupoi;

import java.util.Iterator;

public class Inicio {

	public static int[] rellenarVector(int tamanio) {
		int[] devolver = new int[tamanio];
		
		for (int i = 0; i < tamanio; i++) {
			int numero = (int)(Math.random()*10+1);
			devolver[i] = numero;
		}
		
		return devolver;
		
	}
	
	public static void printVector(int[] a, int tamanio) {	
		
		String cadenaTexto = "[";
		for(int i = 0; i<tamanio;i++) {
			if(i == (tamanio-1)) {
				cadenaTexto = cadenaTexto + a[i];	
			} else {
				cadenaTexto = cadenaTexto + a[i] + ",";
			}
			
			
		}
		cadenaTexto = cadenaTexto + "]";
		System.out.println(cadenaTexto);
		
	}
	
	
	public static void main(String[] args) {
		
		int tamanioVector = 5;
		int[] miVector = rellenarVector(tamanioVector);
		
		
		printVector(miVector,tamanioVector);
		
		System.out.println("------------ORDENANDO------------");
		for(int m = 0; m < tamanioVector ; m++ ) {
			for(int a=m+1; a < tamanioVector ; a++) {
				
				if(miVector[m] > miVector[a]) {
					int aux = miVector[m];
					miVector[m] = miVector[a];
					miVector[a] = aux;
					printVector(miVector,tamanioVector);
				}
				
			}
		}
		
		printVector(miVector,tamanioVector);		
	}
}
