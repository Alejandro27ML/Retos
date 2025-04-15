package Retos;

import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("indica una frase con exclamaciones (¡!): ");

        String palabra = scanner.nextLine();
        if (palabra.contains("¡") && palabra.contains("!")){
            System.out.println("Has puesto las exclamaciones de " +
                    "forma correcta");
        }else{
            System.out.println("No has escrito las esclamaciones de forma " +
                    "correcta");
        }
        scanner.close();
    }
}
