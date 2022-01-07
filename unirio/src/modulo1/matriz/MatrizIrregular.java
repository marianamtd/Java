package modulo1.matriz;

import java.util.Scanner;

public class MatrizIrregular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Num de pessoas");
        int numPessoas = scanner.nextInt();

        String[][] nomesFilhos = new String[numPessoas][];

        for (int i = 0; i < nomesFilhos.length; i++){
            System.out.println("Qtd filho");
            int qtdFilhos = scanner.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for (int j = 0; j <nomesFilhos[i][j].length(); j++){

                System.out.println("Nome do filho" + (j + 1));
                nomesFilhos[i][j] = scanner.next();

            }
        }
        for (int i = 0; i < nomesFilhos.length; i++){
            for (int j = 0; j <nomesFilhos[i][j].length(); j++){

            }
        }
    }
}
