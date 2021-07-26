import java.util.Scanner;

public class SquaresNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        for (int i = 1; i < num ; i++) {
            if (i * i <= num)
                System.out.println(i*i);
        }
    }
}
