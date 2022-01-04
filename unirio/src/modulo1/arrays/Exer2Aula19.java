package modulo1.arrays;

import java.util.Scanner;

public class Exer2Aula19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = scanner.nextInt();

            vetorB[i] = vetorA[i] * 2;
        }

        System.out.print("Vetor A = [");
        for(int var: vetorA){
            System.out.print(var + " , ");
        }
        System.out.println("]");

        System.out.print("Vetor B = [");
        for(int var: vetorB){
            System.out.print(var + " , ");
        }
        System.out.println("]");
    }
}
