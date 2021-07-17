//verifica a hora de sono (se é ideial ou não)

import java.util.Scanner;

public class Sleep {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int hourA = scanner.nextInt();  // normal
        int hourB = scanner.nextInt(); // excess
        int sleep = scanner.nextInt(); // Ann hours of sleep

        if (hourA <= hourB){
            if (sleep >= hourA && sleep <= hourB) {
                System.out.printf("Normal");
            }
            else if (sleep < hourA){
                System.out.printf("Deficiency");
            }
            else if (sleep > hourA && sleep > hourB){
                System.out.printf("Excess");
            }
        }
    }
}
