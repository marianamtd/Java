package modulo1.POO;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();

        cc.limiteEspecial = 500;
        cc.num = "1114";
        cc.especial = true;
        cc.saldo = -10;
        cc.valorEspecialUsado = 0;

        boolean saqueEfetuado = cc.sacarDinheiro(20);
        if(saqueEfetuado){
            System.out.println("Saque Efetuado");
            cc.consultarSaldo();
        }else{
            System.out.println("Saque não efetuado");
        }

        System.out.println("Deposito");

        if(cc.verificarChequeEspecial()){
            System.out.println("Usando cheque especial");
        }
        else{
            System.out.println("Não está usando cheque especial");
        }
    }
}
