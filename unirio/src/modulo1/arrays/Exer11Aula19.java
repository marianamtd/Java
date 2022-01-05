package modulo1.arrays;

import java.util.Scanner;

public class Exer11Aula19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int varPar = 0;

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = scanner.nextInt();

            if(vetorA[i] % 2 == 0) {
                varPar++;
            }
        }

        System.out.print("Vetor A = [");
        for (int var:vetorA){
            System.out.print(var + " ");
        }
        System.out.print("]");
        System.out.println("Qtd de pares : " + varPar);
    }
}
