
package clasesdeprogramacion.GuiaEjercicios1;

import java.util.Scanner;

public class Ej7_TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        System.out.println("Tablas de multiplicar\n");
        System.out.println("Ingrese un número para mostrar su tabla de multiplicar");
       int num = scN.nextInt();
       int contador = 1;
       while(contador <= 10){
           int resultado = num * contador;
           System.out.println(num+" x "+contador+" = "+resultado);
           contador++;
       }
    }
}
