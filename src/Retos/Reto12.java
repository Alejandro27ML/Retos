package Retos;

import java.util.Scanner;

public class Reto12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        while(true){
            System.out.println("Introduce un número entero, pon fin para finalizar: ");
            String valor = scanner.nextLine();
            if (valor.equalsIgnoreCase("fin")){
                break;
            }

            try {
                int numero = Integer.parseInt(valor);
                if (numero % 7 == 0){
                    System.out.println("El número " + numero + " es un número de la suerte.");
                    contador++;
                }
            }catch (NumberFormatException e){
                System.out.println("Entrada invalida.");
            }
        }
        scanner.close();
    }
}
