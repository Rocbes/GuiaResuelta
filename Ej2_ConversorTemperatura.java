
package clasesdeprogramacion.GuiaEjercicios1;

import java.util.Scanner;

/* 
Ejercicio 2 – Conversor de temperatura:
Desarrolla un programa que convierta una temperatura de grados Celsius a grados 
Fahrenheit. El usuario debe ingresar la temperatura en Celsius. */
public class Ej2_ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        System.out.println("Conversor de grados Celsius a grados Fahrenheit\n ");
        System.out.println("Ingrese temperatura en grados Celsius");
        double temperatura = scN.nextDouble();
        double conversor = (temperatura * 9/5 +32);
        System.out.println("\nLa conversion de grados celsius a Fahrenheit es: "+conversor);
        //
    }
}
