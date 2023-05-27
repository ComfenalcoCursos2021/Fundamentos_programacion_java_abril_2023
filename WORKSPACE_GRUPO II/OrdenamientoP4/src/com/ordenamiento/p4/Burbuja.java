package com.ordenamiento.p4;

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

      if (i == (t - 1)) {
        cadena = cadena + v[i];
      } else {
        cadena = cadena + v[i] + " , ";
      }

    }
    cadena = cadena + "]";
    System.out.println(cadena);
  }

  public static int[] crearVector(int tamanio) {
    int[] devolver = new int[tamanio];
    for (int i = 0; i < tamanio; i++) {
      devolver[i] = (int)(Math.random()*10+1);
    }
    return devolver;
  }

  public static void main(String[] args) {
    System.out.println("Bienvenido este programa le....");
    int cantidadDatosVector;
    int[] miVector;
    
    Scanner consola = new Scanner(System.in);
    System.out.println("que tamaño de simulacion quiere trabajar:");
    cantidadDatosVector = consola.nextInt();
    
    miVector = crearVector(cantidadDatosVector);
    
//    Scanner consola = new Scanner(System.in);
//    for (int dato = 0; dato < 5; dato++) {
//      System.out.println("Por favor ingrese la posicion numero " + (dato + 1) + " :");
//      miVector[dato] = consola.nextInt();
//    }

    System.out.println("-------------------------");
    imprimirVectorHorizontal(miVector, cantidadDatosVector);

    for (int r = 0; r < cantidadDatosVector; r = r + 1) {

      for (int m = r + 1; m < cantidadDatosVector; m++) {

        // System.out.println("ESTA CONSULTANDO miVector[r] > miVector[m]");
        // System.out.println(miVector[r] + " > " + miVector[m]);
        if (miVector[r] > miVector[m]) {
          int aux = miVector[r];
          miVector[r] = miVector[m];
          miVector[m] = aux;
          System.out.println("--------------intercambiando-----------");
          imprimirVectorHorizontal(miVector, cantidadDatosVector);
          System.out.println("-------------------------");
          
          
        }

      }

    }

    /// Secuencia de imprimir
    System.out.println("Imprimiendo el vector ORDENADO");
    imprimirVectorHorizontal(miVector, cantidadDatosVector);

  }

}
