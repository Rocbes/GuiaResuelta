
package clasesdeprogramacion.GuiaEjercicios1;

import java.util.Scanner;

/* 
Desarrolla un programa que solicite al usuario un número y luego
muestre la secuencia de números desde 0 hasta el número ingresado, pero solo
aquellos que son múltiplos de 3.
*/
public class Ej8_SecuenciaNumeros {
    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        System.out.println("Mostrar secuencia de números\n");
        System.out.println("Ingresar número que solamente sea multiplo de 3");
        int num = scN.nextInt();
        int contador = 0;
        while(num!=contador-1){
            if(num%3==0){
                System.out.println(contador);
                contador++;
            }else{
                System.out.println("Su número no es divisible por 3\nfavor volver a ingresar un número válido");
                num =scN.nextInt();
            }
        } 
    }
}
