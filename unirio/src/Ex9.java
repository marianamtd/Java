import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextFloat() * 10;
        int inteira = (int) num / 10;
        int decimal = (int) num % 10;

        //condição de arredondamento
        if (decimal > 5){
            System.out.println(++inteira);
        }
        else{
            System.out.println(inteira);
        }



    }
}

