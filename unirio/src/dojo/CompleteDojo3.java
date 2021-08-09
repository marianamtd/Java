package dojo;
import java.util.Scanner;
import java.util.Random;

public class CompleteDojo3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //declaração das var
        float media = 0;
        int soma = 0;


        for (int i= 0; i < 5; i++) {
            int aleatorio = random.nextInt(10);
            soma += aleatorio;
            media = (float) soma / 5;
        }

        //tentativas
        float n;
        do {
            System.out.println("Digite um número: ");
            n = scanner.nextFloat();

            if (n == media)
                System.out.println("Acertou!");
            else
                System.out.println("" + ((n < media? "Menor" : "Maior")));
        }while (n != media);
    }
}
