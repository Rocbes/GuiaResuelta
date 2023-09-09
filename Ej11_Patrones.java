
package clasesdeprogramacion.GuiaEjercicios1;

import java.util.Scanner;

public class Ej11_Patrones {
    public static void main(String[] args) {
        int op = 0;
        int tamaño = 0;
        do{
            Scanner scN = new Scanner(System.in);
            System.out.println("Generador de patrones en forma de: Triángulo, Pirámide y cuadrado\n");
            System.out.println("Elija la forma que quiere generar:\n1.- Cuadrado\n2.- Pirámide\n3.- Triángulo\n0.- Cerrar programa");
            op = scN.nextInt();
            if(op >0 &&  op<=3 ){
                System.out.println("Ingrese el tamaño del patron que desea realizar");
                tamaño = scN.nextInt();
            }
            
            switch(op){
                case 1:
                    for (int longitud = 0; longitud < tamaño; longitud++){
                        for (int lineas = 0; lineas < tamaño; lineas++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                    break;
               case 2:
                   for (int longitud = 1; longitud <= tamaño; longitud++) {
                        for (int lineas = 0; lineas < tamaño - longitud; lineas++) {
                            System.out.print("  ");
                        }
                        for (int lineas = 0; lineas < 2 * longitud - 1; lineas++) {
                            System.out.print("* ");
                       }
                        System.out.println("");
                    }
                   break;
               case 3:
                   for (int longitud = 0; longitud <= tamaño; longitud++){
                        for (int lineas = 0; lineas < longitud; lineas++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
               case 0:
                   System.out.println("Saliendo...");
                   break;
               default:
                           System.out.println("Opción no válida, vuelva a ingresar una opción válida\n");
                           break;
            }
        } while(op!=0);
        System.out.println("Programa finalizado");
    }
}
