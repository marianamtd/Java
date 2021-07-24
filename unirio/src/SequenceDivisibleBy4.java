import java.util.Scanner;

public class SequenceDivisibleBy4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = 0;

        System.out.print("Qtd de num na seq: ");
        int num = scanner.nextInt();

        if (num < 1000) {
            int qtd = 0;
            while (qtd <= num) {
                int n = scanner.nextInt();

                if (n < 30000) {
                    if (n % 4 == 0) {
                        if (n > maior) {
                            maior = n;
                        }
                    }
                    qtd++;
                }
            }
            System.out.println(maior);
        }
    }
}
