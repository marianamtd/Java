import java.util.Scanner;

public class ChocolateBar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(((k % m == 0 || k % n == 0) && m * n > k) ? "Yes" : "No");

    }
}
