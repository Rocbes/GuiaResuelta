
package clasesdeprogramacion.GuiaEjercicios1;

import java.util.Scanner;

public class Ej4_NumeroMayor {
    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        System.out.println("Determinar cual es el número mayor\n");
        System.out.println("Ingrese un numero");
        int num1 = scN.nextInt();
        System.out.println("\nIngrese un numero");
        int num2= scN.nextInt();
        System.out.println("\nIngrese un numero");
        int num3 = scN.nextInt();
        
        int numMax= Math.max(num1,Math.max( num2,num3));
        System.out.println("\nEl número mayor ingresado es: "+numMax);
    }
}
