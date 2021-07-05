import java.util.Scanner;

class DecimalPoint {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        float aux = (x%1) * 10;
        int decimal = (int)aux;

        System.out.println(decimal%10);
    }
}