package cursoemvideo.aula5;

public class ContaCorrente {

    public int numConta;
    protected String tipoConta;
    private String nomeDono;
    private float valorSaldo;
    private boolean statusConta;

    public void statusAtual() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipoConta());
        System.out.println("Dono: " + this.getNomeDono());
        System.out.println("Saldo: " + this.getValorSaldo());
        System.out.println("Status da conta: " + this.isStatusConta());
        System.out.println(

        );
    }

    //metodo construtor
    public ContaCorrente() {
        this.valorSaldo = 0;
        this.statusConta = false;
    }

    //metodos getters & setters p/ os atributos
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public float getValorSaldo() {
        return valorSaldo;
    }

    public void setValorSaldo(float valorSaldo) {
        this.valorSaldo = valorSaldo;
    }

    public boolean isStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }

    //metodos
    public void abrirConta(String tipo) {
        this.setTipoConta(tipo);
        this.setStatusConta(true);

        //se for CC
        if (tipo.equals("CC")) //N se usa == para comparar strings
            //this.valorSaldo = 50;
            this.setValorSaldo(50);

        //se for CP
        else
            //this.valorSaldo = 150;
            this.setValorSaldo(150);

        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta() {
        //sacar o money
        if (this.getValorSaldo()> 0){
            System.out.println("A conta tem dinheiro");
        }

        else if (this.getValorSaldo() < 0) {
            //pagar divida se tiver
            System.out.println("Conta em débito");
        }
        else {
            this.setStatusConta(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float valor) {
         if (this.isStatusConta()) {
             this.setValorSaldo(getValorSaldo() + valor); //modifique o saldo p/ pegue o saldo atual + o valor
             System.out.println("Depósito feito com sucesso na conta de " + this.getNomeDono());
         }
         else
             System.out.println("Error! Conta ainda está fechada");
    }

    public void sacar(float valor) {
        if (this.isStatusConta()) {
            //saldo > saque
            if (this.getValorSaldo() >= valor){
                this.setValorSaldo(this.getValorSaldo() - valor);
                System.out.println("Saque feito na conta de " + this.getNomeDono());
            }

            else{
                System.out.println("Saldo menor do que o valor do saque");
            }
        }
        else{
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipoConta().equals("CC")){
            v = 12;
        }
        else if (this.getTipoConta().equals("CP")) {
            v = 20;
        }

        //conta aberta
        if (this.isStatusConta()) {
            this.setValorSaldo(getValorSaldo() - v);
            System.out.println("Mensalidade paga");
        }
        //conta fechada
        else{
            System.out.println("Error! Conta está fechada");
        }


        }
    }


