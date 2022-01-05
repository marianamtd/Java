package modulo1.arrays;

import java.util.Scanner;

public class Exer12Aula19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = scanner.nextInt();
            soma += vetorA[i];
        }

        System.out.printf("Somatório = %d\n", soma);
        System.out.print("Vetor A = [");
        for(int var:vetorA){
            System.out.print(var + " ");
        }
        System.out.print("]");
    }

}
