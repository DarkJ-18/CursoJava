package Ejemplos;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        //Nombre del cliente: Juan
        //tipo de cuenta: corriente
        //saldo disponible: 1599.99$

        //escriba el numero de la opcion deseada
        //1. consultar saldo
        //2. retirar dinero
        //3. depositar dinero
        //9. salir


        Scanner teclado = new Scanner(System.in);
        String nombre = "Juan";
        String tipoCuenta = "corriente";
        double saldo = 1599.99;
        int opcion = 0;

        while (opcion != 9) {
            System.out.println("escriba el numero de la opcion deseada");
            System.out.println("1. consultar saldo");
            System.out.println("2. retirar dinero");
            System.out.println("3. depositar dinero");
            System.out.println("9. salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es: " + saldo);
                    break;
                case 2:
                    System.out.println("cuanto dinero desea retirar?");
                    double retiro = teclado.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("saldo insuficiente");
                    } else {
                        saldo -= retiro;
                        System.out.println("retiro exitoso");
                    }
                    break;
                case 3:
                    System.out.println("cuanto dinero desea depositar?");
                    double deposito = teclado.nextDouble();
                    saldo += deposito;
                    System.out.println("deposito exitoso");
                    break;
                case 9:
                    System.out.println("gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("opcion invalida");
                    break;
            }
        }
    }
}
