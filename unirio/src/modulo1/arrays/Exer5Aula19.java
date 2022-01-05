package modulo1.arrays;

import java.util.Scanner;

public class Exer5Aula19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = scanner.nextInt();

            vetorB[i] = vetorA[i] * i;
        }

        System.out.print("Vetor A: [");
        for(int var:vetorA){
            System.out.print(var + " ");
        }
        System.out.println("]");

        System.out.print("Vetor B: [");
        for(int var:vetorB){
            System.out.print(var + " ");
        }
        System.out.println("]");
    }
}
