package Operadores.ejercicios;

import java.util.Scanner;

public class Eje8 {
    /**
     * Construir un progrmaca que calcule y muestre las raices de la ecuacion de segundo gredo
     * de coheficientes reales
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float a,b,c;
        double x1, x2;
        
        System.out.print("Ingrese el valor de A: ");
        a = ent.nextFloat();
        System.out.print("Ingrese el valor de B: ");
        b = ent.nextFloat();
        System.out.print("Ingrese el valor de C: ");
        c = ent.nextFloat();
        
        x1 = ((-b) + Math.sqrt((Math.pow(b, 2) - (4*a*c) ))) / (2*a);
        System.out.println("x1 = " + x1);
        x2 = ((-b) - Math.sqrt((Math.pow(b, 2) - (4*a*c) ))) / (2*a);
        System.out.println("x2 = " + x2);
    }
}
