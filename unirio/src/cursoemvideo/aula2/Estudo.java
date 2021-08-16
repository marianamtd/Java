package cursoemvideo.aula2;

public class Estudo {
    //atributos
    String aula;
    int qtd_exer;
    float duracao;
    String horario;
    boolean atraso;

    //metodos
    void status() {
        System.out.println("Matéria: " + this.aula);
        System.out.println("Duração da aula: " + this.duracao);
        System.out.println("Qtd de exercícios: " + this.qtd_exer);
        System.out.println("Horário da aula: " + this.horario);
        System.out.println("Está atrasado? " + this.atraso);
    }

    void comecar() {
        System.out.println(this.atraso? "A aula já começou" : "Ainda vai começar");
    }

    void atrasar() {
        this.atraso = true;
    }
    void adiantar() {
        this.atraso = false;
    }
}
