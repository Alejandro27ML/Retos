package Retos;

import java.util.Scanner;

public class Reto9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el número de días: ");

        int dias = scanner.nextInt();


        for (int i = 1 ; i <= dias ; i++){
            if (i % 3 ==0 && i % 5 == 0){
                System.out.println("FP y Master.");

            }else if (i % 3 == 0){
                System.out.println("FP");

            } else if (i % 5 ==0) {
                System.out.println("Master");

            }else{
                System.out.println(i);
            }

        }
        scanner.close();
    }
}
