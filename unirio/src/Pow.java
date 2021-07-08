import java.util.Scanner;

public class Pow {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();

        System.out.println(Math.pow(a, b));
    }
}
