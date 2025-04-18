package Retos;

import java.util.Scanner;

public class Reto13 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa cuantos segundos quieres contar: ");
        int totalSegundos = scanner.nextInt();

        int segundos = 0;
        int minutos = 0;
        int horas = 0;

        for (int i = 0; i < totalSegundos; i++){
            Thread.sleep(1000);
            segundos++;

            if (segundos == 60){
                segundos = 0;
                minutos ++;
            }

            if (minutos == 60){
                minutos = 0;
                horas ++;
            }
            System.out.println(horas + " horas " + minutos + " min " + segundos + " s" );

        }
        scanner.close();
    }
}
