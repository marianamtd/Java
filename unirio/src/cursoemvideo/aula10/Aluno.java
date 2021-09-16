package cursoemvideo.aula10;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public void cancelarMatri() {
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Matrícula será cancelada");
        System.out.println();

    }

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
