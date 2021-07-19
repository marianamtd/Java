import java.util.Scanner;

public class Directions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int direction = scanner.nextInt();

        switch (direction) {
            case 0:
                System.out.printf("stay");
                break;
            case 1:
                System.out.print("move up");
                break;
            case 2:
                System.out.print("move down");
                break;
            case 3:
                System.out.printf("move left");
                break;
            case 4:
                System.out.printf("move right");
                break;
            default:
                System.out.printf("error!");
        }
    }
}
