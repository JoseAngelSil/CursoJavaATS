package Operadores;
/*
Uso de la libreria Math, por lo que se usa para hacer calculos matematicas
*/
public class Clase_math {
    public static void main(String[] args) {
        var raiz2 = Math.sqrt(36.67); // Raiz cuadrada ya que es un valor Double
        System.out.println("raiz2 = " + raiz2);
        
        // sacar potencias a la n
        var potenciaN = Math.pow(2, 16); // (base, exp)
        System.out.println("potenciaN = " + potenciaN);
        // redondear numeros
        var redondeo = Math.round(raiz2);
        System.out.println("redondeo = " + redondeo);
        
        //numeros aleatoreos
        var noA = Math.random();
        System.out.println("noA = " + noA);
    }
}
