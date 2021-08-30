package cursoemvideo.aula7;

import java.util.Locale;

public class Lutador {
    //atributos
    private String nome, nacionalidade, categoria;
    private float altura, peso;
    private int vitorias, derrotas, empates, idade;

    //metodos publicos
    public void apresentar() {
        System.out.println("----Apresentação----");
        System.out.println("O próximo lutador é o ....");
        System.out.println("Lutador: " + this.getNome().toUpperCase(Locale.ROOT));
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura() + "metros");
        System.out.println("Peso: " + this.getPeso() + "Kg") ;
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println();
    }
    public void status() {
        System.out.print(getNome());
        System.out.println(" é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
        System.out.println();

    }
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);

    }
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);

    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);

    }

    //metodos acessores


    public Lutador(String nome, String nacionalidade, float altura, float peso, int vitorias, int derrotas, int empates, int idade) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);        //mudar depois para o set
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
        this.setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        this.categoria = categoria;

        if (this.getPeso() < 52.2) {
            this.categoria = "Iinválida";
        }
        else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        }
        else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        }
        else if (this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }
        else {
            this.categoria = "Inválido";
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

