package cursoemvideo.aula11;

public abstract class Pessoa {
    private String nome, sexo;
    private int idade;

    //metodo final, não pode ser subscrita

    public final void fazerAni() {
        setIdade(getIdade() + 1);

    }

    //metodo acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String detalhes() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ",\n sexo='" + sexo + '\'' +
                ",\n idade=" + idade +
                '}';
    }
}
