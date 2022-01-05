package modulo1.arrays;

import java.util.Scanner;

public class Exer16Aula19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int somaInf15 = 0, qtd15 = 0, qtdSup15 = 0;
        double somaMedia = 0;

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = scanner.nextInt();

            if(vetorA[i] < 15){
                somaInf15 += vetorA[i];
            }
            else if(vetorA[i] == 15){
                qtd15++;
            }
            else{
                qtdSup15++;
                somaMedia += vetorA[i];
            }
        }

        System.out.println("Soma dos num inferiores a 15: " + somaInf15);
        System.out.println("Qtd dos num iguais a 15: " + qtd15);
        System.out.println("Media dos num superiores a 15: " + somaMedia/qtdSup15);

    }
}
