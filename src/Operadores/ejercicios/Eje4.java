package Operadores.ejercicios;

import java.util.Scanner;

public class Eje4 {
    public static void main(String[] args) {
        double salt = 1000, com_car,cant_car,pre_car;
        double com_precio;
        final int com = 150;
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Ingrese cantidad de carros vendidos: ");
        cant_car = ent.nextDouble();
        System.out.print("Ingrese el coste de los coches vendidos: ");
        pre_car = ent.nextDouble();
        
        com_car = com * cant_car;
        com_precio = (cant_car * pre_car) * 0.05;
        salt += com_car + com_precio;
        System.out.println("Salario Total: " + salt);
        
    }
}
