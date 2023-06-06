package com.grupoi.inicio;

public class Principal {

	public static void print(int[][] m) {
		String matriz = "";
		for (int i = 0; i < m.length; i++) {
			matriz = matriz + "[";
			for (int j = 0; j < m[0].length; j++) {
				if(j == (m.length-1)) {
					matriz = matriz + m[i][j];	
				} else {
					matriz = matriz + m[i][j] + ",";
				}
			}
			matriz = matriz + "]\r\n";
		}
		System.out.println(matriz);
	}

	public static void main(String[] args) throws InterruptedException {

		int tamanioMatriz = 3;
		int[][] miMatriz = new int[tamanioMatriz][tamanioMatriz];
		print(miMatriz);
		
		int nInicial = 1;
		int nFinal =  tamanioMatriz*tamanioMatriz;
		
		int indiceFila = 0;
		int indiceColumna = tamanioMatriz/2;
		
		for(int i = nInicial; i<= nFinal;i++) {
			miMatriz[indiceFila][indiceColumna] = i;
			
			
			
			int indiceFilaTmp = indiceFila - 1;
			int indiceColumnaTmp = indiceColumna + 1;
			
								
			if(indiceFilaTmp < 0 ) {
				indiceFilaTmp = tamanioMatriz - 1;
			}
			if(indiceColumnaTmp >= tamanioMatriz ) {
				indiceColumnaTmp=0;
			}
			
			if(miMatriz[indiceFilaTmp][indiceColumnaTmp] == 0) {
				indiceFila = indiceFilaTmp;
				indiceColumna = indiceColumnaTmp;
			} else {
				indiceFila = indiceFila + 1;
			}
			
			
			print(miMatriz);
			Thread.sleep(50);
		}
		
		print(miMatriz);

	}

}
