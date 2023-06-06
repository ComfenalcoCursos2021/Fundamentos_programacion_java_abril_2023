package com.grupoi.com;

import com.grupoi.matematicas.UtilMatematicas;
import com.grupoi.utils.UtilTextos;
//import com.grupoi.textos.UtilTextos;

public class Principal {
	
	
	public static void main(String[] args) {
		
		
		float nuevo = UtilMatematicas.obtenerPromedio(15, 30, 46);
		UtilTextos.print("Este es el valor de nuevo " + nuevo);
		UtilTextos.print("El valor de la variable nuevo es " + nuevo);
		float suma2Numeros = UtilMatematicas.sumar(15, 30);
		
		UtilTextos.print("TERMINO EL PROGRAMA");
	}
	
	
	
	
	
	

}
