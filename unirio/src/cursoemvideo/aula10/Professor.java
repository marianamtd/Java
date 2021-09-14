package cursoemvideo.aula10;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAum(float aumento) {
        this.setSalario(getSalario() + aumento);
        System.out.println("Salário aumentado");
        System.out.println("R$: " + this.getSalario());
        System.out.println();

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
