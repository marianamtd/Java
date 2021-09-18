package cursoemvideo.aula11;

public class Bolsista extends Aluno{
    private int bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    @Override //sobrepor o metodo pagar mensalidade
    public void pagarMensalidade (){
        System.out.println("Pagando mensalidade");
    }

}
