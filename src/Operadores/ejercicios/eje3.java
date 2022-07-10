
package Operadores.ejercicios;

import javax.swing.JOptionPane;

/*
Guillermo tiene N dolares, Luis tiene la mitad de Guillermo, mientras que juan tiene la mitad
que poseen luis y guillermo juntos, hacer un programa que calcule la cantidad de dinero que tiene
entre los tres
*/
public class eje3 {
    public static void main(String[] args) {
        float Gui, Juan, luis, tot;
       Gui = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de dolares que tiene Guillermo"));
       luis = Gui / 2;
       Juan = (luis + Gui) / 2;
       tot = Gui + luis + Juan;
       JOptionPane.showMessageDialog(null, "Total " + tot);
    }
}
