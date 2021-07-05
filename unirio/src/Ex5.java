import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Segundos: ");
        float segundos = scanner.nextFloat();
        System.out.println("Minutos: " + segundos/60);
        System.out.println("Horas: " + segundos/3600);
    }
}
