
package clasesdeprogramacion.GuiaEjercicios1;

import java.util.Scanner;
/* 
Ejercicio 9: Diseña un programa que solicite al usuario ingresar un número
repetidamente hasta que ingrese un número negativo.
*/
public class Ej10_ValidadorContraseñas {
    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        String usuario ="ipchile";
        int contraseña =1110;
        System.out.println("Validador de usuario/contraseña\n");
        
        int intentos = 0;
        do{
            System.out.println("Ingrese usuario");
            String intentoUsuario = scL.next();
            System.out.println("Ingrese su contraseña");
            int intentoContraseña=scN.nextInt();
            if(intentoUsuario.equals(usuario) && intentoContraseña==contraseña){
                System.out.println("Bienvenido, has iniciado sesión");
                break;
            }else{
                intentos++;
                System.out.println("Datos ingresados incorrectos\nTiene disponibles " +(3 - intentos) +" intentos más\n ");
            }
            if(intentos==3){
            System.out.println("Intentos máximo permitido ha sido alcanzado, su cuenta a sido bloqueada. \nContactese con soporte");
            }
        } while (intentos!=3);
        
    }
}
