
import java.util.Scanner;

public class ChattyBot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, My name is Flora.\n" +
        "I was created in 2021");
        System.out.println("Please, remind me your name.");
        System.out.println("What a great name you have, "+ scanner.nextLine());
        /*String name = scanner.nextLine();
        System.out.printf("What a great name you have, %s", name);*/


    }
}