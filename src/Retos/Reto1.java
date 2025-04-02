package Retos;
import  java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indicame tu nota: ");
        float nota = scanner.nextFloat();
        System.out.println("Tu nota redondeada es: " + (int)Math.round(nota) );
        scanner.close();

    }
}
