package Operadores.ejercicios;

import java.util.Scanner;

public class Eje5 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float parti, exa1, exa2,exafin, prom;
        System.out.print("Ingrese la calificacion de participacion: ");
        parti = ent.nextFloat();
        System.out.print("Ingrese la calificacion del primer examen: ");
        exa1 = ent.nextFloat();
        System.out.print("Ingrese la calificacion del segundo examen: ");
        exa2 = ent.nextFloat();
        System.out.print("Ingrese la calificacion del examen final: ");
        exafin = ent.nextFloat();
        
        prom = (parti * 0.1f) + (exa1 * 0.25f) + (exa2 * 0.25f) + (exafin *0.4f);
        System.out.println("Promedio total: " + prom);
    }
}
