package modulo1.arrays;

import java.util.Scanner;

public class Exer1Aula19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] B = new int[5];

        int[] A = new int[5];
        for (int i = 0; i < A.length; i++){
            A[i] = scanner.nextInt();

            B[i] = A[i];    //vetor B receber todos os valores de A
        }
        for (int var: A){
            System.out.println(var);
        }


    }
}
