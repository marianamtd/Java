package modulo1.matriz;

import java.util.Random;
import java.util.Scanner;

public class Exer1Aula20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                Random random = new Random();

                matriz[i][j] = random.nextInt(9);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
