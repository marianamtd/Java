package dojo.dojo3;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ContaPoupanca extends Conta implements TransacaoEmConta{

    //metodo acessor
    public ContaPoupanca(String nome, String email, int data_nasc, int senha, int telefone, long cpf, boolean entrar) {
        super(nome, email, data_nasc, senha, telefone, cpf, entrar);
    }

    public String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(date);
        return dateFormat.format(date);
    }

    public void saldo() {
        this.getSaldo();

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

