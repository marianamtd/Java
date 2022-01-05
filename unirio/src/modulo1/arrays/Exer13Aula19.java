package modulo1.arrays;

import java.util.Scanner;

public class Exer13Aula19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int somaMult5 = 0;

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = scanner.nextInt();

            if (vetorA[i] % 5 == 0){
                somaMult5 += vetorA[i];
            }
        }

        System.out.printf("Somatório = %d\n", somaMult5);
        System.out.print("Vetor A = [");
        for(int var:vetorA){
            System.out.print(var + " ");
        }
        System.out.print("]");

    }
}
