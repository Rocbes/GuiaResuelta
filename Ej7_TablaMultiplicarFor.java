
package clasesdeprogramacion.GuiaEjercicios1;

import java.util.Scanner;

public class Ej7_TablaMultiplicarFor {
    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        System.out.println("Tabla de multiplicar\n");
        System.out.println("Ingrese el número que desea multiplicar");
        int num = scN.nextInt();
        int contador=0;
        for (contador = 1; contador <= 10; contador++) {
            int resultado = contador * num;
            System.out.println(num+" X " +contador+" = "+resultado);
        }
    }
}
