import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        if (num >= 1900 && num <= 3000){
            if ((num % 4 == 0) && (num % 100 != 0) || (num % 400 == 0)){
                System.out.println("Leap");
            }
            else{
                System.out.print("Regular");
            }
        }

    }
}
