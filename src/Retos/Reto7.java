package Retos;

import java.util.Random;

public class Reto7 {
    public static void main(String[] args) {

        Random random = new Random();
        int caracol_1 = 0;
        int caracol_2 = 0;
        int velocidad_1 = random.nextInt(3)+1;
        int velocidad_2 = random.nextInt(3)+1;

        System.out.println("Comienza la carrera!!");

        for (int i = 1; i <= 30; i++){
            caracol_1 += velocidad_1;
            caracol_2 += velocidad_2;

        }

        if (caracol_1 == caracol_2){
            System.out.println("La carrera ha terminado, ha habido un empate.");

        } else if (caracol_1 > caracol_2) {
            System.out.println("El caracol 1 ha ganado!");

        }else {
            System.out.println("El caracol 2 ha ganado!");
        }

    }
}
