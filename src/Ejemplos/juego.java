package Ejemplos;

import java.util.Random;
import java.util.Scanner;

public class juego {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = new Random().nextInt(100);
        int intentos = 0;

        while (intentos < 3){
            System.out.println("Ingresa un numero entre 0 al 100");
            int numUser = teclado.nextInt();
            intentos++;

            if (numUser == num){
                System.out.println("adivinaste");
                break;
            }else if (numUser < num){
                System.out.println("El numero es mayor");
                System.out.println("intente nuevamente");
                System.out.println("Intentos restantes: " + (3 - intentos));
            }else {
                System.out.println("El numero es menor");
                System.out.println("intente nuevamente");
                System.out.println("Intentos restantes: " + (3 - intentos));
            }

        }
        System.out.println("Perdiste, el numero era: " + num);
    }
}
