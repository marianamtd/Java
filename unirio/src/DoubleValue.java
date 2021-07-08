import java.util.Scanner;

public class DoubleValue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println((x*x*x) + (x*x) + x + 1);
    }
}
