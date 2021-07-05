import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args)
    {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Raio: ");
        float raio = scanner.nextFloat();

        System.out.println((2 * 3.14 * raio));
        System.out.println("Área: " + (raio*raio * 3.14));
    }

}
