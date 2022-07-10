package Operadores.ejercicios;

import java.util.Scanner;

public class Eje2 {
    /*
    Hacer un programa que calcule e imprima el salario semanal de un empleado
    a partir de las horas trabajadas semanales y el salario por horas
    */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float horas_trab, salario_hora, salarioT;
        
        System.out.print("Ingrese las horas trabajadas: ");
        horas_trab = inp.nextFloat();
        System.out.print("Ingrese el salario por hora: ");
        salario_hora = inp.nextFloat();
        salarioT = horas_trab * salario_hora;
        System.out.println("El salario total es: $" + salarioT);
    }
}
