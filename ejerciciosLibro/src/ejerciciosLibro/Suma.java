package ejerciciosLibro;

//Programa que muestra la suma de dos enteros.

import java.util.Scanner; // el programa usa la clase Scanner

public class Suma {
	// el método main empieza la ejecución de la aplicación en Java

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ingreso = new Scanner(System.in);
		int numero1;
		int numero2;
		int suma;
		
		System.out.print("ingrese el primer numero: ");
		numero1 = ingreso.nextInt();
		
		System.out.print("Ingrese el segundo numero: ");
		numero2 = ingreso.nextInt();
		
		suma=numero1 + numero2;
		
		System.out.printf("La suma de %d + %d es: %d",numero1, numero2,suma );
		ingreso.close();

	}

}
