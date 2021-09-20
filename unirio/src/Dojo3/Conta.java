package Dojo3;

import java.util.Calendar;

import java.util.Random;

import java.util.Date;

import java.util.Scanner;

public abstract class Conta{
    protected String nome, email;
    protected  int diaNasc, mesNasc, anoNasc, senha, telefone;
    protected long cpf;
    protected float saldo;
    protected boolean entrar;
    Scanner scan = new Scanner(System.in);

    public Conta(String nome, String email, int diaNasc, int mesNasc, int anoNasc, int senha, int telefone, long cpf,boolean entrar) {
        this.nome = nome;
        this.email = email;
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
        this.senha = senha;
        this.telefone = telefone;
        this.cpf = cpf;
        this.entrar = entrar;
    }

    public void extrato() {

    }

    public static void imprimir(Conta[] contas){
        for (Conta c: contas){
            if (c != null)
                System.out.println(c.informacoes());
        }
    }
    public String informacoes(){
        return String.format("Nome: %s", nome);
    }

    public void ContaSalario() {
        System.out.println("Salário:");
        float salario = scan.nextFloat();
        System.out.println("Data de pagamento:\n");
        System.out.println("Dia:");
        int dia = scan.nextInt();
        System.out.println("Mes:");
        int mes = scan.nextInt();
        System.out.println("Ano:");
        int ano = scan.nextInt();

        System.out.println("Conta salário criada com sucesso!\n");
    }

    //metodos acessores
    public int getDiaNasc() {
        return diaNasc;
    }

    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public boolean isEntrar() {
        return entrar;
    }

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
