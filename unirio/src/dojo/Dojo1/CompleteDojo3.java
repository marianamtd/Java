package Dojo1;
import java.util.Scanner;
import java.util.Random;

public class CompleteDojo3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        float media = 0;
        int soma = 0;


        for (int i = 0; i < 5; i++){
            int aleatoria = random.nextInt(10);
            soma += aleatoria;
            media = (float) soma / 5;
        }

         //tentaivas
        int qtd = 0;
        while (qtd < 15) {
            System.out.println("Digite um número: ");
            float n = scanner.nextFloat();
            if (n < media)
                System.out.println("Menor");

            else if (n > media)
                System.out.println("Maior");

            else {
                System.out.println("Acertou");
                break;
            }
            qtd++;
        }
    }
}
