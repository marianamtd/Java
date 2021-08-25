package dojo.Dojo2;

public class Main {
    public static void main(String[] args) {
        //instanciar a classe Esmalte
        Esmalte esmalte = new Esmalte("Colorama", "Cremoso", "Rosa Antigo", 40);
        esmalte.status();

        Esmalte esmalte1 = new Esmalte("Risqué", "Cremoso", "How u doing?", 100);
        esmalte1.setAberto(true);
        esmalte1.status();

        Livros livro = new Livros("Assasinato no expresso do Oriente","Agatha Christie", 405,"thriller", true );
        livro.status();

        Shampoo shampoo = new Shampoo("Lola Cosméticos", "Minha Lola, Minha Vida",
                "Todos os tipos de cabelo", 500, true);
        shampoo.status();
    }
}
