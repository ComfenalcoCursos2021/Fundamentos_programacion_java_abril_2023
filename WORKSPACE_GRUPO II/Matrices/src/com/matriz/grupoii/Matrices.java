package com.matriz.grupoii;

import java.util.Iterator;

public class Matrices {

  public static void imprimirMatriz(int[][] m, int filas, int columnas) {
    String cadena="";
    for(int fila = 0; fila < filas; fila++) {
      cadena= cadena + "[";
      for(int column = 0 ; column < columnas ; column++) {
        if(column == (columnas-1)) {
          cadena = cadena + m[fila][column];
        } else {
          cadena = cadena + m[fila][column] + ",";
        }
      }
      cadena = cadena + "]\r\n";
    }
    System.out.println(cadena);
  }
  public static void main(String[] args) {
    int[][] matriz = new int[6][6];

    imprimirMatriz(matriz, 6, 6);    
    matriz[0][0] = 9;
    imprimirMatriz(matriz, 6, 6);
    matriz[1][4] = 10;
    imprimirMatriz(matriz, 6, 6);
    
    for(int i = 0 ; i < 6 ; i++) {
      matriz[i][i] = 1;          
    }
    imprimirMatriz(matriz, 6, 6); 
    System.out.println("Termino el programa...");
  }

}
