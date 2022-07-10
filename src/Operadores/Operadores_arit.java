package Operadores;

import java.util.Scanner;

public class Operadores_arit {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        float n1, n2;
        System.out.print("Digite el primer no: ");
        n1 = en.nextFloat();
        System.out.print("Digite el segundo no: ");
        n2 = en.nextFloat();
        
        var suma = n1 + n2;
        System.out.println("suma = " + suma);
        var resta = n1 - n2;
        System.out.println("resta = " + resta);
        var multi = n1 * n2;
        System.out.println("multi = " + multi);
        var div = n1 / n2;
        System.out.println("div = " + div);
        var mod = n1 % n2;
        System.out.println("mod = " + mod);
                
    }
}
