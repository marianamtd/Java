import java.util.Scanner;

public class YesorNo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //condição de existencia
        /*if (num >= 0){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }*/
        System.out.println(num > 0 ? "YES" : "NO");
    }
}
