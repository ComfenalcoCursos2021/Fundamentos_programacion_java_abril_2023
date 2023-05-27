package com.ordenamiento;

import java.util.Scanner;

public class Burbuja {

  public static void imprimirVector(int[] v, int t) {
    for (int i = 0; i < t; i++) {
      System.out.println(v[i]);
    }
  }

  
  public static void imprimirVectorHorizontal(int[] v, int t) {
    String cadena = "[";
    for (int i = 0; i < t; i++) {
      
      if(i == (t-1) ) {
        cadena = cadena + v[i];
      } else {
        cadena = cadena + v[i] + " , ";  
      }    
      
    }
    cadena = cadena + "]";
    System.out.println(cadena);
  }
  
  
  
  public static void main(String[] args) {
    System.out.println("Bienvenido este programa le....");
    int[] miVector;
    miVector = new int[5];
    
    Scanner consola = new Scanner(System.in);
    
    for(int dato = 0 ; dato < 5 ;dato++) {
      System.out.println("Por favor ingrese la posicion numero " + (dato+1) + " :");
      miVector[dato] = consola.nextInt();
    }
    
    System.out.println("-------------------------");
    imprimirVectorHorizontal(miVector, 5);

    for (int r = 0; r < 5; r = r + 1) {

      for (int m = r + 1; m < 5; m++) {

        // System.out.println("ESTA CONSULTANDO miVector[r] > miVector[m]");
        // System.out.println(miVector[r] + " > " + miVector[m]);
        if (miVector[r] > miVector[m]) {
          int aux = miVector[r];
          miVector[r] = miVector[m];
          miVector[m] = aux;
          System.out.println("--------------intercambiando-----------");
          imprimirVectorHorizontal(miVector, 5);
          System.out.println("-------------------------");
        }

      }

    }

    /// Secuencia de imprimir
    System.out.println("Imprimiendo el vector ORDENADO");
    imprimirVectorHorizontal(miVector, 5);

  }

}
