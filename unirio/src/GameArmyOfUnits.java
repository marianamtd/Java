import java.util.Scanner;

public class GameArmyOfUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int army  = scanner.nextInt();

        //classification
        if (army < 1) {
            System.out.println("no army");
        }
        else if (army <= 4) {
            System.out.println("few");
        }

        else if (army <= 9) {
            System.out.println("several");
        }
        else if (army <= 19) {
            System.out.println("pack");
        }
        else if (army <= 49) {
            System.out.println("lots");
        }
        else if (army <= 99) {
            System.out.println("horde");
        }
        else if (army <= 249) {
            System.out.println("throng");
        }
        else if (army <= 499) {
            System.out.println("swarm");
        }
        else if (army <= 999) {
            System.out.println("zounds");
        }
        else {
            System.out.println("legion");
        }
    }
}
