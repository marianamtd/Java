package cursoemvideo.aula7;

public class aula7 {
    public static void main(String[] args) {
        //criar um vetor para armazenar os lutadores
        Lutador[] lutador = new Lutador[6];

        lutador[0] = new Lutador("Pretty Boy", "França", 1.75f, 68.9f, 11,2,1, 31);
        lutador[1] = new Lutador("Putscript", "Brasil", 1.68f, 57.8f, 14, 2, 3, 29);
        lutador[2] = new Lutador("Snapshadow", "EUA", 1.65f, 80.9f, 12, 2, 1, 35);
        lutador[3] = new Lutador("Deadcode", "Austrália", 1.93f, 81.6f, 13,0,2,28);
        lutador[4] = new Lutador("ufocobol", "Brasil", 1.70f,119.3f, 5,4,3,37);
        lutador[5] = new Lutador("Nerdaaed", "EUA", 1.81f, 105.7f, 12,2,4,30);

        Luta UFC = new Luta();
        UFC.marcarLuta(lutador[0], lutador[0]);
        UFC.luta();
        lutador[0].status();
        lutador[0].status();

    }
}

