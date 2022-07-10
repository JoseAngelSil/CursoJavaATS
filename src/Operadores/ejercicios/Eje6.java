package Operadores.ejercicios;

import java.util.Scanner;

public class Eje6 {
    /*
    Calcular el cuadrado de una suma
    (a+b)2 = a2 + b2 = 2ab
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        
        System.out.print("Ingrese el valor de a: ");
        a = in.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        b = in.nextDouble();
        
        c = Math.pow(a, 2) + Math.pow(b, 2) + (2*a*b);
        System.out.println("c = " + c);
    }
}
