package com.grupoii.ordenamiento;

public class Burbuja {

  public static void imprimirVector(int[] v, int t) {
    for (int i = 0; i < t; i++) {
      System.out.println(v[i]);
    }
  }

  public static void imprimirVectorHorizontal(int[] v, int t) {
    String cadena = "[";
    for (int i = 0; i < t; i++) {
      cadena = cadena + v[i] + " , ";
    }
    cadena = cadena + "]";
    System.out.println(cadena);
  }
  public static void main(String[] args) {
    System.out.println("Bienvenido este programa le....");
    int[] miVector;
    miVector = new int[5];
    miVector[0] = 4;
    miVector[1] = 2;
    miVector[2] = 3;
    miVector[3] = 1;
    miVector[4] = 5;
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
