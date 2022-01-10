package modulo1.POO;

public class ContaCorrente {
    String num, agencia;
    double saldo, limiteEspecial, valorEspecialUsado;
    boolean especial;

    boolean sacarDinheiro(double qtdSacar){

        // se eu tenho saldo na conta
        if (saldo >= qtdSacar){
            saldo -= qtdSacar;
            return true;
        }
        else{ //sem saldo na conta
            if(especial){

                //verifica se tem saldo no limite especial
                double limite = limiteEspecial + saldo;
                if (limite >= qtdSacar){
                    saldo -= qtdSacar;
                    return true;
                }else{
                    return false;
                }
            }else{
                return false; //não é especial e n tem saldo na conta
            }
        }
    }

    void depositarDinheiro(double deposito){
        saldo += deposito;
    }

    void consultarSaldo(){
        System.out.println("Saldo " + saldo);
    }

    boolean verificarChequeEspecial(){
        return saldo < 0;
    }



}
