
package clasesdeprogramacion.GuiaEjercicios1;

import java.util.Scanner;
//
public class Ej9_NumeroNegativo {
    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        System.out.println("Ejercicio:\nSi ingresas un número que sea negativo, el programa finalizara");
        System.out.println("\nIngrese un número");
        long num = scN.nextLong();
       
        while(num>=0){
            System.out.println("Vuelva a ingresar un número");
            num = scN.nextLong();
        }
    }
}
