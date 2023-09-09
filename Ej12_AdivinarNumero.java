
package clasesdeprogramacion.GuiaEjercicios1;
import java.util.Random;
import java.util.Scanner;

public class Ej12_AdivinarNumero {
    public static void main(String[] args) {
        Scanner vrN = new Scanner(System.in);
        Random random = new Random();
        System.out.println("==========================");
        System.out.println("Adivinar Número (Tienes 5 intentos)");
        System.out.println("==========================");
        int num;
        int intento=0;
        int nRandom = random.nextInt(100)+1;
        System.out.println(nRandom);
        do{
            System.out.println("Ingrese un número");
             num = vrN.nextInt();
             intento++;
         
        if(num==nRandom){
            System.out.println("Felicidades has adivinado el número");
            break;
        }else if(num>nRandom){
            System.out.println("Su número es mayor al que desea adivinar\n");
        }else if(intento<nRandom){
            System.out.println("Su número ingresado es menor al número que desea adivinar\n");
        }
        if(intento==5){
            System.out.println("Has alcanzado el número máximo de intentos, juego finalizado");
        }
        } while (num==nRandom || intento<5);
        
    }
    
}
