import java.util.Scanner;


public class Decorastan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c,r;
        String shape = scanner.next();

        switch (shape) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                double p = (a + b + c) / 2;
                double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(area);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println(a * b);
                break;
            case  "circle":
                r = scanner.nextDouble();
                System.out.println(3.14 * Math.pow(r, 2));
                break;
        }
    }
}
