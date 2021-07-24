package dojo;
import java.util.Random;
import java.util.Scanner;


//sem utilizar numeros aleatórios
/*public class Dojo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int media = 0, soma = 0;

        System.out.print("Digite os 5 números iniciais: ");
        for(int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            soma += num;
            media = soma / 5;
        }
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        while (n != media) {

            if (n < media) {
                System.out.print("Menor\n");

            }else {
                System.out.print("Maior\n");
            }
            System.out.print("Digite um número: ");
            n = scanner.nextInt();
        }
        System.out.print("Acertou!");
    }
} */

//utilizando numeros aleatórios
/*public class Dojo3 {
    public static void main (String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int media = 0, soma = 0;


        for (int i = 0; i < 5 ; i++) {
            int aleatorio = random.nextInt(10);
            soma += aleatorio;
            media = soma / 5;
        }
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        while (n != media) {

            if (n < media) {
                System.out.print("Menor\n");

            }else {
                System.out.print("Maior\n");
            }
            System.out.print("Digite um número: ");
            n = scanner.nextInt();
        }
        System.out.print("Acertou!");

    }
} */

//utilizando num alteatórios (qtd <= 15)
public class Dojo3 {
    public static void main (String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int media = 0, soma = 0;


        for (int i = 0; i < 5 ; i++) {
            int aleatorio = random.nextInt(10);
            soma += aleatorio;
            media = soma / 5;
        }
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        int qtd = 0;
        while (n != media || qtd <= 15) {

            if (n < media) {
                System.out.print("Menor\n");

            }else if (n > media) {
                System.out.print("Maior\n");
            } else {
                System.out.print("Acertou!");
            }
            System.out.print("Digite um número: ");
            n = scanner.nextInt();
            qtd++;
        }

    }
}