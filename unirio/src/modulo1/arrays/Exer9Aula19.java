package modulo1.arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer9Aula19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        double[] vetorC = new double[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Vetor A");
            vetorA[i] = scanner.nextInt();
            System.out.println("Vetor B");
            vetorB[i] = scanner.nextInt();

            vetorC[i] = vetorA[i] / (float) vetorB[i];
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

        DecimalFormat decimalFormat = new DecimalFormat("###,###.#");

        System.out.print("Vetor C = [");
        for(double var:vetorC){
            System.out.print(decimalFormat.format(var) + " ");
        }
        System.out.println("]");

    }
}
