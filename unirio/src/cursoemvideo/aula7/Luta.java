package cursoemvideo.aula7;

import java.util.Objects;
import java.util.Random;

public class Luta {
    //pode criar um tipo abstrato
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador lutador1, Lutador lutador2) {
        if (Objects.equals(lutador1.getCategoria(), lutador2.getCategoria()) && lutador1 != lutador2) {
            this.setAprovada(true);
            this.desafiado = lutador1;
            this.desafiante = lutador2;
            System.out.println("Luta aprovada");
        }
        else {
            this.desafiado = null;
            this.desafiante = null;
            this.setAprovada(false);
            System.out.println("Luta não foi aprovada");
        }
    }
    public void luta() {
        Random random = new Random();

        if (this.isAprovada()) {
            //apresentar o lutador
            System.out.println("DESAFIADO ENTRANDO NO RING");
            this.desafiado.apresentar();
            System.out.println("DESAFIANTE ENTRANDO NO RING");
            this.desafiante.apresentar();

            //declarar a variável aleatória
            System.out.println();
            System.out.println("Que rufem os tambores....");
            int aleatorio = random.nextInt(3);
            System.out.println(aleatorio);

            switch (aleatorio) {
                case 0:
                    System.out.println("Empate!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println("O " + this.desafiado.getNome() + " ganhou");   //desafiado ganha
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("O " + this.desafiante.getNome()+ " ganhou!!");    //desafiante ganha
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println();
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

