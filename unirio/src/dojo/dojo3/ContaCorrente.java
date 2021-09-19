package dojo.dojo3;

public class ContaCorrente extends Conta implements TransacaoEmConta{
    //herança por diferença

    public ContaCorrente(String nome, String email, int data_nasc, int senha, int telefone, long cpf,boolean entrar) {
        super(nome, email, data_nasc, senha, telefone, cpf,entrar);
    }

    //limite 3000
    @Override
    public void saque() {
        if (this.getSaldo() >= 0 && this.getSaldo() >= -3000) {
            System.out.println("Qual sera o valor a ser sacado?");
            float saque = scan.nextFloat();
            if (this.getSaldo() <= 0){
                if (saque > 3000){
                    System.out.println("O limite do cheque especial é de R$3000");
                    System.out.println("R$" + this.getSaldo());
                    System.out.println();
                }
            }
            else {
                this.setSaldo(getSaldo() - saque);
                System.out.println("O saldo atual da sua conta é R$" + this.getSaldo());
                System.out.println();
            }
        }
        else {
            System.out.println("Saldo insuficiente");
            System.out.println("R$" + this.getSaldo());
            System.out.println();
        }
    }

    @Override
    public void getValor() {

    }

    @Override
    public void getDescricao() {

    }

    @Override
    public void getTipoOperacao() {

    }

    @Override
    public void getData() {

    }

    @Override
    public void pagarBoleto() {

    }
}

