package Dojo3;

import java.util.Calendar;
import java.util.Date;

public class ContaCorrente extends Conta implements TransacaoEmConta{
    //herança por diferença
    private float saldoCC;

    public ContaCorrente(String nome, String email, int diaNasc,int mesNasc, int anoNasc, int senha, int telefone, long cpf,boolean entrar, float saldoCC) {
        super(nome, email, diaNasc,mesNasc,anoNasc, senha, telefone, cpf,entrar);
        this.saldoCC = saldoCC;
    }

    public void deposito() {
        System.out.println("Qual será o valor que será depositado na conta?");
        float dep = scan.nextFloat();
        this.setSaldoCC(getSaldoCC() + dep);
        System.out.println("O saldo atual da sua conta é " + this.getSaldoCC());
    }

    public void pagarBoleto() {
        java.util.Date d = new Date();
        System.out.println("Código de barras (48 dígitos): ");
        double cod_barras = scan.nextDouble();
        System.out.println("Valor do boleto: ");
        float valor = scan.nextFloat();
        System.out.println("Data de vencimento");
        System.out.println("Dia: ");
        int dia = scan.nextInt();
        System.out.println("Mês: ");
        int mes = scan.nextInt();
        System.out.println("Ano: ");
        int ano = scan.nextInt();


        //depois colocar o negócio da data (+ multa)
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int mesAtual = Calendar.getInstance().get(Calendar.MONTH);
        int diaAtual = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        if (diaAtual <= dia &&  mesAtual <= mes && anoAtual <= ano) {
            if (getSaldoCC() > - 3000 && valor <= 3000) {
                System.out.println("Pagamento realizado");
                setSaldoCC(getSaldoCC() - valor);
                System.out.println("Saldo R$" + this.getSaldoCC());
            } else{
                System.out.println("Saldo insuficiente");
                System.out.println("Saldo R$" + this.getSaldoCC());
            }
        }
        else {
            for (int i = dia; i < diaAtual; i++) {
                float multa = valor * 0.001f;
                valor += multa;
            }
            System.out.println("Valor final do boleto é R$" + valor);
            setSaldoCC(getSaldoCC() - valor);
            System.out.println("Saldo R$" + getSaldoCC());
        }
    }


    //limite 3000
    //@Override
    public void saque() {
        if (this.getSaldoCC() >= 0 && this.getSaldoCC() >= -3000) {
            System.out.println("Qual sera o valor a ser sacado?");
            float saque = scan.nextFloat();
            if (this.getSaldoCC() <= 0){
                if (saque > 3000){
                    System.out.println("O limite do cheque especial é de R$3000");
                    System.out.println("R$" + this.getSaldoCC());
                    System.out.println();
                }
            }
            else {
                this.setSaldoCC(getSaldoCC() - saque);
                System.out.println("O saldo atual da sua conta é R$" + this.getSaldoCC());
                System.out.println();
            }
        }
        else {
            System.out.println("Saldo insuficiente");
            System.out.println("R$" + this.getSaldoCC());
            System.out.println();
        }
    }

    public String informacoes(){
        return String.format("\nSaldo da conta corrente: %.2f", saldoCC);
    }

    public float getSaldoCC() {
        return saldoCC;
    }

    public void setSaldoCC(float saldoCC) {
        this.saldoCC = saldoCC;
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

}
