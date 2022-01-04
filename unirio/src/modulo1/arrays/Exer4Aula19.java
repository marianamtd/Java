package modulo1.arrays;

import java.util.Scanner;
import java.lang.Math;

public class Exer4Aula19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetorA = new double[5];
        double[] vetorB = new double[5];

        for(int i =0; i < vetorA.length; i++){
            vetorA[i] = scanner.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.print("Vetor A = [");
        for(double var:vetorA){
            System.out.print(var + " ");
        }
        System.out.println("]");

        System.out.print("Vetor B = [");
        for(double var:vetorB){
            System.out.print(var + " ");
        }
        System.out.println("]");
    }
}
