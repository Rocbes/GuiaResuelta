package clasesdeprogramacion.GuiaEjercicios1;

import java.util.Scanner;

public class Ej6_AñoBisiesto {

    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        System.out.println("Determinar si un año es o no es bisiesto\n");
        System.out.println("Ingrese un año");
        int año = scN.nextInt();
        if(año %4==0){
            System.out.println("\nEl año "+año+" es bisiesto");
        }else if (año%100 !=0 && año % 400!=0){
            System.out.println("\nEl año "+año+" no es bisiesto");
        }    
    }
}
    
    

