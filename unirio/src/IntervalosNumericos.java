import java.util.Scanner;

public class IntervalosNumericos {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println((num > -15 && num <= 12) || (num > 14 && num < 17) ||
                (num >= 19));
    }
}
