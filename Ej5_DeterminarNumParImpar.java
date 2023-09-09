
package clasesdeprogramacion.GuiaEjercicios1;

import java.util.Scanner;

public class Ej5_DeterminarNumParImpar {
    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        System.out.println("Determinar si tu número es par o impar"+"\n");
        System.out.println("Ingrese un número");
        int num = scN.nextInt();
        if(num%2==0){
            System.out.println("\nEl número ingresado es par");
        }else
            System.out.println("\nEl número ingresado es impar");
            
    }
}
