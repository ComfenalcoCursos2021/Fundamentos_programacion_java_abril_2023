package com.grupoi;

public class Inicio {

	public static void main(String[] args) {
		
		int[] miVector = new int[5];
		
		miVector[0] = 3;
		miVector[1] = 2;
		miVector[2] = 5;
		miVector[3] = 4;
		miVector[4] = 1;
		
		for(int i = 0; i<5;i++) {
			System.out.println(miVector[i]);
		}
		System.out.println("------------ORDENANDO------------");
		for(int m = 0; m < 5 ; m++ ) {
			for(int a=m+1; a < 5 ; a++) {
				if(miVector[m] > miVector[a]) {
					int aux = miVector[m];
					miVector[m] = miVector[a];
					miVector[a] = aux;
				}
			}
		}
		
		for(int i = 0; i<5;i++) {
			System.out.println(miVector[i]);
		}
		
		
	}
}
