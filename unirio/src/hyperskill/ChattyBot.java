
import java.util.Scanner;

public class ChattyBot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, My name is Flora.\n" +
        "I was created in 2021");
        System.out.println("Please, remind me your name.");
        System.out.println("What a great name you have, "+ scanner.nextLine());

        //fazer a declaração da var e só depois imprimir o nome
        /*String name = scanner.nextLine();
        System.out.printf("What a great name you have, %s", name);*/
        System.out.println("Let me guess your age.");

        //descobrir a idade do user
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.printf("Your age is %d; that's a good time to start programming!", age);



    }
}