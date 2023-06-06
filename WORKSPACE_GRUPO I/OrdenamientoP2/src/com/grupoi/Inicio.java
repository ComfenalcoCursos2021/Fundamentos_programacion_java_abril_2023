package com.grupoi;

public class Inicio {

	
	public static void printVector(int[] a, int tamanio) {	
		System.out.println("-----------------------------");
		for(int i = 0; i<tamanio;i++) {
			System.out.println(a[i]);
		}
		System.out.println("-----------------------------");
	}
	
	
	public static void main(String[] args) {
		
		int tamanioVector = 5;
		int[] miVector = new int[tamanioVector];
		
		miVector[0] = 3;
		miVector[1] = 2;
		miVector[2] = 5;
		miVector[3] = 4;
		miVector[4] = 1;
		
		
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
