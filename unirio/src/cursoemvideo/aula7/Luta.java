package cursoemvideo.aula7;

import java.util.Objects;
import java.util.Random;

public class Luta {
    //pode criar um tipo abstrato
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador lutador1, Lutador lutador2) {
        if (Objects.equals(lutador1.getCategoria(), lutador2.getCategoria())) {
            if (lutador1 != lutador2) {
                this.setAprovada(true);
                lutador1 = desafiado;
                lutador2 = desafiante;
            }
        }
        else {
            desafiado = null;
            desafiante = null;
            this.setAprovada(false);
        }
    }
    public void luta() {
        Random random = new Random();

        if (this.isAprovada()) {
            desafiado.apresentar();
            desafiante.apresentar();
            int aleatorio = random.nextInt(2);
            System.out.println(aleatorio);

            if (aleatorio == 0) {
                System.out.println("Empate!");
                desafiante.getEmpates();
                desafiado.getEmpates();
            }
            else if (aleatorio == 1) {
                System.out.println("O" + this.getDesafiado() + "ganhou");
                desafiado.getVitorias();
                desafiante.getDerrotas();
            }
            else {
                System.out.println("O" + this.getDesafiante() + "ganhou!!");
                desafiante.getVitorias();
                desafiado.getDerrotas();
            }
        }
        else {
            System.out.println("Luta não pode  acontecer");
        }
    }

    //metodos acessores
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}

