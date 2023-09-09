
package clasesdeprogramacion.GuiaEjercicios1;

import java.util.Scanner;
 class Ej3_MayorMenorEdad {
     public static void main(String[] args) {
         Scanner scN = new Scanner(System.in);
         System.out.println("Determinar según la edad que ingrese si es menor o mayor de edad\n");
         System.out.println("Ingrese su edad");
         int edad = scN.nextInt();
         if(edad>=18){
             System.out.println("\nEres mayor de edad");
         }else{
             System.out.println("\nEs menor de edad");
         }
     }
}
