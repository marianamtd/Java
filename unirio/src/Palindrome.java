import java.util.Random;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        //comparando a 1 e a 4 pos
       if ((numero / 1000) == (numero % 10) && (numero/ 100 % 10) == (numero/ 10 % 10) ||(numero / 1000 == 0) && (numero % 10 == 0)){
            System.out.println("1");
        }
        else{
            System.out.println(new Random().nextInt(100));
        }

    }
}
