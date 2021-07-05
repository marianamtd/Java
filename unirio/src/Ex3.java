import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner oioi = new Scanner(System.in);
        float salario = oioi.nextFloat();
        float percentual = oioi.nextFloat();

        System.out.println(((salario * percentual)/100) + salario);

    }
}
