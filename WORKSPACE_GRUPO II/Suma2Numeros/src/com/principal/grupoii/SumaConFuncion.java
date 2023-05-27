package com.principal.grupoii;

public class SumaConFuncion {

  public static int funcionPromedio(int a, int b) {
    int s = a+b;
    int p = s / 2;
    return p;
  }
  
  public static void main(String[] args) {
    
    int primero = 10;
    int segundo = 20;
    int resultado = primero + segundo;
    
    int promedio = funcionPromedio(primero,segundo);
    
    System.out.println(resultado);
    System.out.println(promedio);

    int pInventado = funcionPromedio(45,90);
    System.out.println(pInventado);
  }

}
