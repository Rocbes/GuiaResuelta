
package clasesdeprogramacion.GuiaEjercicios1;

import java.util.Scanner;
public class Ej1_CalcularPromedio {
    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        System.out.println("Calcule su promedio\n");
        double nota1,nota2,nota3,promedio;
        System.out.println("Ingrese primera nota");
        nota1 = scN.nextDouble();
        System.out.println("\nIngrese segunda nota");
        nota2 = scN.nextDouble();
        System.out.println("\ningrese tercera nota");
        nota3 = scN.nextDouble();
        promedio = (nota1+nota2+nota3) /3;
        System.out.println("\nEl promedio de su nota es: "+promedio);
    }
}
