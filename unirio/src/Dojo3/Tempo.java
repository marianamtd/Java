package Dojo3;

public class Tempo {

    public static int[] avancar(int diaAtual, int mesAtual, int anoAtual){
        int diaNovo = diaAtual;
        int mesNovo = mesAtual + 1;
        int anoNovo = anoAtual;

        if (mesNovo == 13){
            mesNovo = 1;
            anoNovo += 1;
        }

        int[] dataNova = {diaNovo, mesNovo, anoNovo};
        return dataNova;
    }
}
