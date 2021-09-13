package cursoemvideo.aula9;

import java.util.Scanner;

public class Aula9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //criar dois vetores
        Pessoa[] p = new Pessoa[2];
        Livro[] livros = new Livro[3];

        p[0] = new Pessoa("Maria Clara", 13, 'F');
        p[1] = new Pessoa("Vitor", 21, 'M');
        livros[0] = new Livro("Sombra e Ossos", "Leight Bardugo", 285, p[0]);
        livros[1] = new Livro("Casa do Penhasco", "Agatha Cristie", 300, p[1]);
        livros[2] = new Livro("Segredos de uma milhonário", "Harv Eker", 280, p[1]);


        livros[1].abrir();
        livros[1].folhear(500);
        livros[1].avancarPag();
        System.out.println(livros[1].detalhes());



    }
}
