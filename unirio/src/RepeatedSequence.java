import java.util.Scanner;

public class RepeatedSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        int q = 0;
        while (q < n){
            int k = 0;
            while (k < i && q < n){
                System.out.print(i + " ");
                k++;
                q++;
            }
            i++;
        }

    }
}