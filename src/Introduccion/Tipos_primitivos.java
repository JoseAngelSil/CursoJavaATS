package Introduccion;

public class Tipos_primitivos {
	public static void main(String[] args) {
		// Variables y tipos de variables
		/*
		Enteros
			byte	-> 8 bits
			short	-> 16 bits
			int	-> 32 bits
			long	-> 64 bits */
		byte no_entero = 12;
		System.out.println("no_entero = " + no_entero);
		short noEntero2 = 123;
		System.out.println("noEntero2 = " + noEntero2);
		int noEntero3 = 12442;
		System.out.println("noEntero3 = " + noEntero3);
		long noEntero4 = 1234323;
		System.out.println("noEntero4 = " + noEntero4);
		
		/*
		Reales
			float	-> 32 bits
			double	-> 64 bits */
		float noF1 = 134.32F;
		System.out.println("noF1 = " + noF1);
		double noD1 = 123445534.23412123;
		System.out.println("noD1 = " + noD1);
		
		/*Caracter
			char*/
		char n = 'a';
		System.out.println("n = " + n);
		
		/*
		boleanos
			boolean
		*/
		boolean es = false;
		System.out.println("es = " + es);
	}
}
