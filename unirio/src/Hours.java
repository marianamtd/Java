import java.util.Scanner;

public class Hours {
    public static void main(String[] args){
        //input hora 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Horas: ");
        int hour = scanner.nextInt() * 3600;  //converte para seg

        System.out.print("Minutos: ");
        int min = scanner.nextInt() * 60;   //converte para seg

        System.out.print("Segundos: ");
        int seg = scanner.nextInt();

        //input hora 2
        System.out.print("Horas: ");
        int hour2 = scanner.nextInt() * 3600;  //converte para seg

        System.out.print("Minutos: ");
        int min2 = scanner.nextInt() * 60;     //converte para seg

        System.out.print("Segundos: ");
        int seg2 = scanner.nextInt();

        //output da diferença de horários
        System.out.println((hour2 + min2 + seg2) - (hour + min + seg));
    }
}
