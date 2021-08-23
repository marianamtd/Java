package dojo.Dojo2;
import java.util.Random;

public class Pokemon {
    //atributos
    private String nome;
    private String tipo;
    private float peso;     //não esquecer de colocar o f (0.5f, 14.6f)
    private float altura;
    private int felicidade;
    private int chanceDeCaptura;
    private boolean capturado;

    //metodo status atual
    public void statusAtual() {
        System.out.println("------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Peso " + this.getPeso());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Felicidade: " + this.getFelicidade());
        System.out.println("Chance de captura: " + this.getChanceDeCaptura());
        System.out.println("Foi capturado? " + this.isCapturado());
        System.out.println();
    }

    //contruct
    public Pokemon() {
        this.setCapturado(false);
        this.setFelicidade(0);
    }

    //metodos personalizados
    public void capturar() {
        Random random = new Random();
        int aleatorio = random.nextInt(100);
         if (this.isCapturado()) {
             System.out.println(this.nome + " já foi capturado");
         }
         else {
             if (this.chanceDeCaptura <= aleatorio) {
                 System.out.println("Foi capturado");
                 System.out.println(aleatorio);
                 this.setCapturado(true);
             }
             else {
                 System.out.println("Não foi capturado");
                 System.out.println(aleatorio);
             }
         }

    }
    public void libertar() {
        if (this.isCapturado()) {
            this.setCapturado(false);
            System.out.println(this.getNome() + " foi libertado");
        }
        else {
            System.out.println("Não há como libertar, pois n foi capturado");
        }

    }

    public void brincar() {
        this.setFelicidade(getFelicidade() + 20);

    }

    public void alimentar() {
        this.setFelicidade(getFelicidade() + 35);
    }

    public void falar() {
        System.out.println("Olá, sou o " + this.getNome());

    }

    public void evoluir(String nome, String tipo , int captura) {
        if (this.getFelicidade() > 100) {
            System.out.println("Pokemon evoluído com sucesso");
            this.setFelicidade(getFelicidade() - 100);
            this.setNome(nome);
            this.setTipo(tipo);
            this.setChanceDeCaptura(captura);
        }
        else {
            System.out.printf("Sua felicidade é de %d, espere chegar até 100\n", this.getFelicidade());

        }
    }


    //metodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getFelicidade() {
        return felicidade;
    }

    public void setFelicidade(int felicidade) {
        this.felicidade = felicidade;
    }

    public float getChanceDeCaptura() {
        return chanceDeCaptura;
    }

    public void setChanceDeCaptura(int chanceDeCaptura) {
        this.chanceDeCaptura = chanceDeCaptura;
    }

    public boolean isCapturado() {
        return capturado;
    }

    public void setCapturado(boolean capturado) {
        this.capturado = capturado;
    }
}
