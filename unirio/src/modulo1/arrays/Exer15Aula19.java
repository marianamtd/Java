package modulo1.arrays;

import java.util.Scanner;

public class Exer15Aula19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[4];
        double perc_impar;
        double qtd_geral = 0, qtd_par = 0, qtd_impar = 0;

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = scanner.nextInt();
            qtd_geral++;

            if(vetorA[i] % 2 == 1){
                qtd_impar++;
            }
            else {
                qtd_par++;
            }
        }

        System.out.println("Qtd impar : " + (qtd_impar/qtd_geral) * 100);
        System.out.println("Qtd par : " + (qtd_par/qtd_geral) * 100);
    }
}
