import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();

        switch (val) {
            case 1:
                System.out.println("You have chosen a square");
                break;
            case 2:
                System.out.println("You have chosen a circle");
                break;
            case 3:
                System.out.println("You have chosen a triangle");
                break;
            case 4:
                System.out.println("You have chosen a rhombus");
                break;
            default:
                System.out.println("There is no such shape!");
        }
    }
}
