package Retos;

import java.util.Scanner;

public class Reto10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cada caja de Galletas cuesta 6€. \n ¿Cuantas desea comprar?: ");
        int cajas = scanner.nextInt();

        if (cajas < 5){
            System.out.println("La compra mínima es de 5 cajas.");

        } else if (cajas >= 5 && cajas < 15) {
            System.out.println("Cajas compradas: " + cajas + "."+ "\n precio: " + (cajas*6) + "€" +
                    "\nGastos de envío: 10€" + "\nTotal: " + ((cajas*6)+10) + "€" + "\nFaltan: " +
                    (110-(cajas*6)) + "€ para entrar en promoción." );

        } else if (cajas*6 < 120) {
            System.out.println("Cajas compradas: " + cajas + "."+ "\n precio: " + (cajas*6) + "€" +
                    "\nGastos de envío: 0€" + "\nTotal: " + ((cajas*6)) + "€" + "\nFaltan:  " +
                    (120-(cajas*6)) + "€ para entrar en promoción.");
            
        } else if (cajas*6 >= 250) {
            System.out.println("Cajas compradas: " + cajas + "."+ "\n precio: " + (cajas*6) + "€" +
                    "\n Gastos de envío: 0€" + "\nTotal: " + ((cajas*6)-(cajas*6)*0.1) + "€" + "\nDescuento: " +
                    ((cajas*6)*0.1) + "€.");

        }else{
            System.out.println("Cajas compradas: " + cajas + "."+ "\n precio: " + (cajas*6) + "€" +
                    "\nGastos de envío: 0€" + "\nTotal: " + ((cajas*6)-(cajas*6)*0.05) + "€" + "\nDescuento: " +
                    ((cajas*6)*0.05) + "€.");

        }
        scanner.close();
    }
}
