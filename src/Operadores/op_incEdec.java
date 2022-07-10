package Operadores;

public class op_incEdec {
    public static void main(String[] args) {
        /*
        Operadores de decremento e incremento
        */
        int i = 5;
        System.out.println("i = " + i);
        ++i;
        System.out.println("i = " + i);
        i++; // x +=1
        System.out.println("i = " + i);
        i--; // x -= 1;
        System.out.println("i = " + i);
        
        var y = i++;
        System.out.println("y = " + y); // asignamos primero el valor de i y despues se incrementa +1
        System.out.println("i = " + i);
        y = ++i;
        System.out.println("y = " + y); // primero se incrementa el valor de i, nada mas
        
        var n = 9;
        var m = n--;
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        m = --n;
        System.out.println("m = " + m);
    }
}
