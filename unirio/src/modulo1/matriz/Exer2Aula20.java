package modulo1.matriz;

import java.util.Random;
import java.util.Scanner;

public class Exer2Aula20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[10][10];
        int menor5 = 0, maior5 = 0, menor7 = 0, maior7 = 0; //int linha5 = 5; int linha7 = 7;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                Random random = new Random();

                matriz[i][j] = random.nextInt(9);
                System.out.print(matriz[i][j] + " ");
                if(i == 4){
                }
                if(matriz[i][j] > maior5){    // matriz[linha5][j] > maior5
                    maior5 = matriz[i][j];
                }else if (matriz[i][j] < menor5){
                    menor5 = matriz[i][j];
                }
                if(i == 6){
                    if(matriz[i][j] > maior7){      //matriz[linha7][j] > maior7
                        maior7 = matriz[i][j];
                    }else if (matriz[i][j] < menor7){
                        menor7 = matriz[i][j];
                    }

                }

            }


            System.out.println();
        }
        System.out.println("Maior elemento da linha 5 é " + maior5);
        System.out.println("Menor elemento da linha 5 é " + menor5);
        System.out.println("Maior elemento da linha 7 é " + maior7);
        System.out.println("Menor elemento da linha 7 é " + menor7);
    }
}
