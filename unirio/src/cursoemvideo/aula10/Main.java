package cursoemvideo.aula10;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Mariana");
        p2.setNome("Bianca");
        p3.setNome("Jorge");
        p4.setNome("Fabiola");

        p2.setCurso("Biologia");
        p2.setMatricula(1209);
        p2.setIdade(19);
        p2.setSexo('F');
        System.out.println(p2.toString());
        System.out.println(p2.getCurso());


        p3.toString();


    }
}
