package Introduccion;

import javax.swing.JOptionPane;

public class Ventana_JOp {
	public static void main(String[] args) {
		String cadena;
		int no1;
		char letra;
		double no2;
		
		cadena = JOptionPane.showInputDialog("Ingrese su nombre");
		no1 = Integer.parseInt( JOptionPane.showInputDialog("Ingrese su edad"));
		no2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));
		letra = JOptionPane.showInputDialog("Ingrese su sexo").charAt(0);
		
		System.out.printf("Hola %s \n Edad: %d \n Salario: $%s\n Sexo: %s\n\n",cadena,no1, no2, letra);
		System.out.println("Adios " + cadena);
	}
}
