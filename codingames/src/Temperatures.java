import java.util.*;
import java.math.*;

class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   //qtd de temp a serem analisadas

        if (n == 0)
            System.out.println("0");
        else {
            int temp;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {

                temp = in.nextInt();

                if (Math.abs(temp) < Math.abs(min) || (temp == -min && temp > 0))
                    min = temp;
            }
            System.out.println(min);
        }
    }
}
