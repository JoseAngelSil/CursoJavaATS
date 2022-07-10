package Operadores.ejercicios;

import javax.swing.JOptionPane;

public class Eje1 {
    public static void main(String[] args) {
        float cal1, cal2, cal3, prom;
        cal1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Cal1"));
        cal2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Cal2"));
        cal3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Cal3"));
        
        prom = (cal1 + cal2 + cal3);
        System.out.println("La suma de las calificaciones es: " + prom);
    }
}
