package cursoemvideo.aula11;

public class Aluno extends Pessoa{
    //herança para diferença
    private int matricula;
    private String curso;

    //metodos
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de alune " + this.getNome());
    }

    //metodos acessores

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
