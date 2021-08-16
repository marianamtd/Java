package cursoemvideo.aula2;

public class ExecucaoEstudo {
    public static void main(String[] args) {
        //instanciar
        Estudo aula1 = new Estudo();


        aula1.aula = "Java POO";
        aula1.duracao = 3;
        aula1.qtd_exer = 10;
        aula1.horario = "7:30 da manha";
        aula1.status();
        aula1.comecar();

        //instanciar a segunda aula
        Estudo aula2 = new Estudo();

        aula2.aula = "ILC";
        aula2.duracao = 2.5f;
        aula2.qtd_exer = 20;
        aula2.horario = "9 da manha";
        aula2.atraso = true;
        aula2.status();
        aula2.comecar();



    }
}
