package Retos;

import java.util.Scanner;

public class Reto11 {
    public static void main(String[] args) {

        String palabraSecreta = "programar";
        int intentos = 5;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivina la palábra secreta.");

        for (int i = 0; i < intentos; i++){
            System.out.println("Intento número " + (i+1) + ", ingresa una palabra: ");
            String palabra = scanner.nextLine().toLowerCase();
            if (palabra.equals(palabraSecreta)){
                System.out.println("Felicidades, has ganado!!");
                break;
            }else{
                int intentosRestantes = intentos - (i+1);
                if (intentosRestantes > 0){
                    System.out.println("INCORRECTO.\nVuelve a intentarlo");

                }else{
                    System.out.println("No quedan intentos.\n GAME OVER!");
                }

            }
        }
        scanner.close();
    }
}
