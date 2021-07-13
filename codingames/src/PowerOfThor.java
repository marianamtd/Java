import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class PowerOfThor {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        lightX = in.nextInt(); // Thor's starting X position
        lightY= in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            //cordenada da luz
            if(lightY > 0){
                System.out.println("S");
                lightY--;
            }
            if (lightY < 0){
                System.out.println("N");
                lightY++;
            }
            if(lightX > 0){
                System.out.println("W");
                lightX--;
            }
            if (lightX < 0){
                System.out.println("");
                lightX++;
            }

            System.out.print("\n");
        }
    }
}
