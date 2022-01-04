package modulo1.arrays;

public class Aula19 {
    public static void main(String[] args) {

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32.8;
        temperaturas[2] = 31.7;
        temperaturas[3] = 31.2;
        temperaturas[4] = 32.4;

        for (int i =0; i < temperaturas.length; i++){    // vc consegue pegar o índice
            System.out.println("Temp do dia " + (i + 1) + " é " + temperaturas[i]);
        }

        for (double temp : temperaturas){ //vc n consegue pegar o valor
            System.out.println(temp);
        }
    }
}
