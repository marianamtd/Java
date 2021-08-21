import java.util.Scanner;

public class City {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        System.out.println(city.endsWith("burg"));

    }
}
