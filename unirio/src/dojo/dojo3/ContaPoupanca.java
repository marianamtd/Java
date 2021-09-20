package dojo.dojo3;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ContaPoupanca extends Conta implements TransacaoEmConta{
    private float saldoCP;
    private int diaCriacao;
    private int mesCriacao;

    //metodo acessor
    public ContaPoupanca(String nome, String email, int diaNasc,int mesNasc, int anoNasc, int senha, int telefone, long cpf, boolean entrar, float saldoCP, int diaCriacao, int mesCriacao) {
        super(nome, email, diaNasc, mesNasc,  anoNasc, senha, telefone, cpf, entrar);
        this.saldoCP = saldoCP;
        this.diaCriacao = diaCriacao;
        this.mesCriacao = mesCriacao;
    }

    public void deposito() {
        System.out.println("Qual será o valor que será depositado na conta?");
        float dep = scan.nextFloat();
        this.setSaldoCP(getSaldoCP() + dep);
        System.out.println("O saldo atual da sua conta é " + this.getSaldoCP());
    }

    public void saque(){
        System.out.println("Qual sera o valor a ser sacado?");
        float saque = scan.nextFloat();

        if (this.getSaldoCP() > 0) {
            this.setSaldoCP(getSaldoCP() - saque);
            System.out.println("O saldo atual da sua conta é de R$" + this.getSaldoCP());
            System.out.println();
        }
        else {
            System.out.println("Saque negado");
            System.out.println("Saldo negativo!");
            System.out.println("Saldo: R$" + this.getSaldo());
        }

    }

    public void pagarBoleto() {
        java.util.Date d = new Date();
        System.out.println("Código de barras (48 dígitos): ");
        long cod_barras = scan.nextLong();
        System.out.println("Valor do boleto: ");
        float valor = scan.nextFloat();
        System.out.println("Data de vencimento");
        System.out.println("Dia: ");
        int dia = scan.nextInt();
        System.out.println("Mês: ");
        int mes = scan.nextInt();
        System.out.println("Ano: ");
        int ano = scan.nextInt();

        //data e multa
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int mesAtual = Calendar.getInstance().get(Calendar.MONTH);
        int diaAtual = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        if (diaAtual <= dia &&  mesAtual <= mes && anoAtual <= ano) {
            if (getSaldoCP() > 0) {
                System.out.println("Pagamento realizado");
                setSaldoCP(getSaldoCP() - valor);
                System.out.println("Saldo R$" + this.getSaldoCP());
            } else{
                System.out.println("Saldo insuficiente");
                System.out.println("Saldo R$" + this.getSaldoCP());
            }
        }
        else {
            float multa = 0;
            for (int i = dia; i < diaAtual; i++) {
                multa = valor * 0.1f;
                valor += multa;
            }
            System.out.println("Valor final do boleto é R$" + valor);
            setSaldoCP(getSaldoCP() - valor);
            System.out.println("Saldo R$" + getSaldoCP());
        }
    }


    /*public String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(date);
        return dateFormat.format(date);
    }*/

    public String informacoes(){
        return String.format("\nSaldo da conta poupança: %.2f", saldoCP);
    }

    public void renderSaldo(int diaAtual, int mesAtual) {
        if (mesAtual > this.getMesCriacao()){
            if (diaAtual >= this.getDiaCriacao()){
                float rende = this.getSaldoCP() * 0.003f;
                this.setSaldoCP(this.getSaldoCP() + rende);
                System.out.println("Sua conta rendeu " + rende + " esse mês.");
                System.out.println("Seu saldo agora é de " + this.getSaldoCP());
            }
        }


    }

    public float getSaldoCP() {
        return saldoCP;
    }

    public void setSaldoCP(float saldoCP) {
        this.saldoCP = saldoCP;
    }

    public int getDiaCriacao() {
        return diaCriacao;
    }

    public void setDiaCriacao(int diaCriacao) {
        this.diaCriacao = diaCriacao;
    }

    public int getMesCriacao() {
        return mesCriacao;
    }

    public void setMesCriacao(int mesCriacao) {
        this.mesCriacao = mesCriacao;
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

