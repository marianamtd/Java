package modulo1.arrays;

import java.util.Scanner;

public class Exer3Aula19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = scanner.nextInt();
            vetorB[i] = vetorA[i] * vetorA[i];
        }

        System.out.println("Vetor A = [");
        for (int var: vetorA){
            System.out.print(var + " ");
        }
        System.out.print("]");

        System.out.println("Vetor B = [");
        for (int var: vetorB){
            System.out.print(var + " ");
        }
        System.out.print("]");
    }
}
