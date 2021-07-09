import java.util.Scanner;

public class Xor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt() % 100;
        System.out.println((num / 10) ^ (num % 10));

        System.out.print('\t'); // make a tab
        System.out.print('a');  // prints 'a'
        System.out.print('\n'); // go to the new line
        System.out.print('c');  // prints 'c'

    }
}
