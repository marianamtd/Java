package modulo1.arrays;

import java.util.Scanner;

public class Exer17Aula19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qtdPessoas35 = 0;

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = scanner.nextInt();

            if(vetorA[i] > 35){
                qtdPessoas35++;
            }
        }

        System.out.println("Quantidade de pessoas com mais de 35 anos: " + qtdPessoas35);
        System.out.print("Vetor A = [");
        for(int var: vetorA){
            System.out.print(var + " ");
        }
        System.out.print("]");
    }
}
