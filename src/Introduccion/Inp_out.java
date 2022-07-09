package Introduccion;

import java.util.Scanner;

public class Inp_out {
	public static void main(String[] args) {
		// Entrada y salida de datos por consola
		Scanner Input = new Scanner(System.in);
		String nombre, apellido;
		int edad, año;
		float salario;
		char genero;
		
		
		System.out.print("Ingrese tu nombre de pila: ");
		nombre = Input.nextLine();
		System.out.print("Ingrese tus apellidos: ");
		apellido = Input.nextLine();
		System.out.print("ingrese tu edad: ");
		edad = Input.nextInt();
		System.out.print("Ingrese el año actual: ");
		año = Input.nextInt();
		System.out.print("Ingrese su salario: ");
		salario = Input.nextFloat();
		System.out.print("Ingrese su sexo: ");
		genero = Input.nextLine().charAt(0);
		
		System.out.printf("Hola %s %s, caray!! tienes %d años.\n", nombre, apellido, edad);
		System.out.println("genero = " + genero);
	}
}
