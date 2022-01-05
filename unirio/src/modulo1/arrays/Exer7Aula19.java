package modulo1.arrays;

import java.util.Scanner;

public class Exer7Aula19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorB.length];

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Vetor A");
            vetorA[i] = scanner.nextInt();
            System.out.println("Vetor B");
            vetorB[i] = scanner.nextInt();

            vetorC[i] = vetorA[i] - vetorB[i];
        }

        System.out.print("Vetor A = [");
        for(int var:vetorA){
            System.out.print(var + " ");
        }
        System.out.println("]");

        System.out.print("Vetor B = [");
        for(int var:vetorB){
            System.out.print(var + " ");
        }
        System.out.println("]");

        System.out.print("Vetor C = [");
        for(int var:vetorC){
            System.out.print(var + " ");
        }
        System.out.println("]");
    }
}
