package Retos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cual es el precio del producto?: ");
        double precio = scanner.nextDouble() * 1.21;
        System.out.println("Con el IVA se queda en valor en: " + precio);

        System.out.println("¿Cuando me das para pagar?: ");
        double pago = scanner.nextDouble();

        double diferencia = pago - precio;

        //El billete de 500 no retiro, ya no se usa.
        double[] efectivo = {200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};

        if (pago < 0){
            System.out.println("Faltan " + diferencia + " euros");
        } else if (pago == 0){
            System.out.println("Gracias por su compra!");
        } else {
            System.out.println("La vuelta es de: " + diferencia);

            for (double valor : efectivo){
                if (pago >= valor){
                    int cantidad = (int)(diferencia/valor);
                    diferencia = Math.round((diferencia % valor) * 100.0) / 100.0;
                    System.out.println(cantidad + " x " + (valor >= 1 ? valor + "€" : (int)(valor * 100) + " céntimos"));
                }

            }
        }
        scanner.close();
    }
}
