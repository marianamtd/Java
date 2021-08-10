import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 1) {
                n = n * 3 + 1;
            }
            else {
                n = n / 2;
            }
            System.out.println(n + " ");
        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
}
