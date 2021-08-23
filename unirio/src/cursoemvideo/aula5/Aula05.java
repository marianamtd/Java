package cursoemvideo.aula5;

public class Aula05 {
    public static void main(String[] args) {
        ContaCorrente p1 = new ContaCorrente();
        p1.setNumConta(1642);
        p1.setNomeDono("Mariana");
        p1.statusAtual();
        p1.abrirConta("CP");
        p1.depositar(2000);
        p1.getValorSaldo();
        p1.statusAtual();

        ContaCorrente p2 = new ContaCorrente();
        p2.setNumConta(2655);
        p2.setNomeDono("Glaucia");
        p2.abrirConta("CC");
        p2.statusAtual();
        p2.depositar(120500);
        p2.pagarMensal();
        p2.statusAtual();
        p2.sacar(120500);
        p2.getValorSaldo();
        p2.statusAtual();
        p2.sacar(38);
        p2.fecharConta();
        p2.statusAtual();
    }
}
