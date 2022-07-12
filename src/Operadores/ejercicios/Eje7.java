package Operadores.ejercicios;

import java.util.Scanner;

public class Eje7 {
    /**
     * Creacion de un programa que calcule la cantidad de semanas con dias y horas a partir de 
     * horas ingresadas por el usuario
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int horas_ent, semana, dias,res;
        
        System.out.print("ingrese las horas a calcular: ");
        horas_ent = ent.nextInt();
        
        semana = horas_ent / 168;
        System.out.println("semanas = " + semana);
        res = horas_ent % 168;
        dias = res / 24;
        System.out.println("dias = " + dias);
        res %= 24;
        System.out.println("horas = " + res);
    }
}
