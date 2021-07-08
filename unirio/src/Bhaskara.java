import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double bhaskara = (-b + delta) / 2 * a;
        double bhaskara_minus = (-b - delta) / 2 * a;
        System.out.println(delta);
        System.out.println(((-b - delta) / 2 * a) + " " + (-b + delta) / 2 * a);



    }
}
