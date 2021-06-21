/** public class Task {
    public static void main(String[] args) {
        //Comentários
        //Mais comentários para aprender a usar
        System.out.println("passed arguments: " + args.length);
    }
}

public class Task {
    public static void main(String[] args){
        for (String s : args) {
            System.out.print(s + " ,");
        }
    }
}

class Task{
    public static void main(String[] args){
        //declaração de inteiro
        int one = 1;
        int two;
        two = 2;
        int three =3, four = 4;
        int five = four;

        //declaração de char e String
        char ch = 'a';
        String str = "Helloo, Vagabundxs!";

        //declarção de double
        double pi = 3.1415;

        //output das variáveis
        System.out.print(str);
        System.out.print(ch);
        System.out.println(pi);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five + 3);

    }
}
 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.IOException;
 public class Task{
 public static void main(String[] args) throws IOException{
 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 String[] values = reader.readLine().split("\\s+");
 int a = Integer.parseInt(values[0]);
 int b = Integer.parseInt(values[1]);
 System.out.println(a + b);
 }
 }
 import java.util.Scanner;
public class Task{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();  //input de um num int
        int b = scanner.nextInt();  //input de um outro int
        System.out.println(a + b);
    }
} */

import java.util.Scanner;
public class Task{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(b + " " + a);
    }
}

