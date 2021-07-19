import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        long num1 = entrada.nextLong();
        char operator = entrada.next().charAt(0);
        long num2 = entrada.nextLong();

        switch (operator) {
            case '+': System.out.println(num1 + num2); break;
            case '-': System.out.println(num1 - num2); break;
            case '/':
                System.out.println(num2 == 0 ? "Division by 0!" : num1 / num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}
