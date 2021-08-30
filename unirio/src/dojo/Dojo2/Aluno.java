package dojo.Dojo2;

public class Aluno {
    //atributos
    private String nome;
    private int matricula, idade;

    //metodos publicos
    public void listar() {
        for (; ;){
            System.out.println("Nome: " + this.getNome());
            System.out.println("Matrícula: " + this.getMatricula());
            System.out.println("Idade: " + this.getIdade());

        }


    }

    public void adicionar() {

    }

    public void deletar() {

    }

    public void ler() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Idade: " + this.getIdade());
    }


    //metodos acesssores

    public Aluno(String nome, int matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
