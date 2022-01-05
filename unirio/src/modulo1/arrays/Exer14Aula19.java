package modulo1.arrays;

import java.util.Scanner;

public class Exer14Aula19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qtd = 0, soma = 0;

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = scanner.nextInt();

            if (vetorA[i] % 2 == 1){
                soma += vetorA[i];
                qtd++;
            }
        }

        System.out.printf("Media = %d\n",soma / qtd);
        System.out.print("Vetor A = [");
        for(int var:vetorA){
            System.out.print(var + " ");
        }
        System.out.print("]");

    }
}
