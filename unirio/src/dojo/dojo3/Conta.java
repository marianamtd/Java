package dojo.dojo3;

import java.util.Random;
import java.util.Date;
import java.util.Scanner;

public abstract class Conta{
    protected String nome, email;
    protected  int data_nasc,senha, telefone;
    protected long cpf;
    protected float saldo;
    protected boolean entrar = false;
    Scanner scan = new Scanner(System.in);

    public Conta(String nome, String email, int data_nasc, int senha, int telefone, long cpf,boolean entrar) {
        this.nome = nome;
        this.email = email;
        this.data_nasc = data_nasc;
        this.senha = senha;
        this.telefone = telefone;
        this.cpf = cpf;
        this.entrar = entrar;
    }

    public void extrato() {

    }

    public void pagarBoleto() {
        java.util.Date d = new Date();
        System.out.println("Código de barras: ");
        long cod_barras = scan.nextLong();
        System.out.println("Valor do boleto: ");
        float valor = scan.nextFloat();
        System.out.println("Data de vencimento:");
        int data = scan.nextInt();

        //depois colocar o negócio da data (+ multa)

    }

    public void deposito() {
        System.out.println("Qual será o valor que será depositado na conta?");
        float dep = scan.nextFloat();
        this.setSaldo(getSaldo() + dep);
        System.out.println("O saldo atual da sua conta é " + this.getSaldo());
    }

    public void saque(){
        System.out.println("Qual sera o valor a ser sacado?");
        float saque = scan.nextFloat();

        if (this.getSaldo() > 0) {
            this.setSaldo(getSaldo() - saque);
            System.out.println("O saldo atual da sua conta é de R$" + this.getSaldo());
            System.out.println();
        }
        else {
            System.out.println("Saque negado");
            System.out.println("Saldo negativo!");
            System.out.println("Saldo: R$" + this.getSaldo());
        }

    }

    public void contaSalario() {

       if(this.getEntrar() == false ) {

        System.out.println("Salário:");
       float salario = scan.nextFloat();
       System.out.println("Data de pagamento:");
       int data = scan.nextInt();
       this.entrar= true;
       }
       else {
           System.out.println("Voce ja possui conta salario! ");
       }

    }

    //protected abstract boolean entrar();

    //metodos acessores
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getSenha() {
        return senha;
    }

    public long getCpf() {
        return cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getData_nasc() {
        return data_nasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setData_nasc(int data_nasc) {
        this.data_nasc = data_nasc;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getEntrar() {
        return entrar;
    }

    public void setEntrar(boolean entrar) {
        this.entrar = entrar;
    }

}


