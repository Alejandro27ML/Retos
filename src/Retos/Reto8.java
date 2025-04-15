package Retos;

import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indicame tu nombre: ");
        String nombre = scanner.nextLine().toLowerCase();

        if (nombre.startsWith("a") && nombre.length() >= 7){
                System.out.println("Hola, asombroso " + nombre.toUpperCase() + " , que nombre tan largo y sofisticado.");

        }else if (nombre.length() >= 7){
            System.out.println("Hola, " + nombre.toUpperCase() + " , que nombre tan largo y sofisticado.");

        } else if (nombre.startsWith("a")) {
            System.out.println("Hola, asombroso " + nombre.toUpperCase() + ".");

        }else{
            System.out.println("Saludos, " + nombre.toUpperCase() + ".");
        }
        scanner.close();
    }
}
