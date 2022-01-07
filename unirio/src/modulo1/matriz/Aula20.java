package modulo1.matriz;

public class Aula20 {
    public static void main(String[] args) {

        double[][] notasAlunos = new double[3][4];

       double[][]  notasAlunos2 = {{7, 8.9, 7.2, 8.2}, {3, 5.5, 7.1, 8.0}}; //para declarar as matrizes

        for (int i = 0; i < notasAlunos.length; i++){
            for (int j = 0; j < notasAlunos[i].length; j++){
                System.out.println(notasAlunos[i][j]);
            }
            System.out.println();
        }

        int[][][] matriz = new int[3][3][3];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                for (int k = 0; k < matriz[i][j].length; k++){
                    matriz[i][j][k] = i + j + k;
                }
            }
        }

        int soma = 0, somaPares = 0, somaImpares = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                for (int k = 0; k < matriz[i][j].length; k++){
                    soma += matriz[i][j][k];

                    if (matriz[i][j][k] % 2 == 0){
                        somaPares += matriz[i][j][k];
                    } else{
                        somaImpares += matriz[i][j][k];
                    }
                }
            }
        }
        System.out.println("Soma total = " + soma);
        System.out.println("Soma impares = " + somaImpares);
        System.out.println("Soma pares = " + somaPares);

    }
}
