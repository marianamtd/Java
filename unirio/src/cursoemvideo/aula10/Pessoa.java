package cursoemvideo.aula10;

public class Pessoa {
    private String nome;
    private char sexo;
    private int idade;

    //metodo
    public void fazerAniver() {
        this.idade++;
    }

    @Override
    public String toString() {
        return "Pessoa {" +
                "\nnome = '" + nome + '\'' +
                ",\nsexo = " + sexo +
                ",\nidade = " + idade +
                '}';
    }

    //metodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
