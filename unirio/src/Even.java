import java.util.Scanner;

public class Even {
    public static void main(String[] args){
        //input
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //quando for impar
        if (num % 2 == 1){
            num++;
        }
        else{
            num += 2;
        }

        System.out.println(num);
    }
}
