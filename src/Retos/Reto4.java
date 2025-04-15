package Retos;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Reto4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bomba Activada, introduce los segundos: ");

        try {
            int segundos = scanner.nextInt();
            for (int i = segundos; i > 0; i--){

                System.out.println("Quedan: " + i + " segundos");

            }
            System.out.println("La Bomba ha explotado");

        }catch (InputMismatchException e){
            System.out.println("Valor indicado incorrecto.");
        }
        scanner.close();
    }
}

