package cursoemvideo.aula4;

public class Aula04 {
    public static void main(String[] args) {
        //instanciamento da classe
        Caneta c1 = new Caneta("MILKLINER", 0.8f, "LARANJA");
        c1.status();

        Caneta c2 = new Caneta("BISMARK", 0.4F, "LILÁS");
        c2.status();

        Caneta c3 = new Caneta("SHARPIE", 1f, "FÚXIA");
        c3.status();

        /*c1.setModelo("BISMARK"); //metodo acessor
        //c1.modelo = "BIC";  //acesso direto ao atributo

        c1.setPonta(0.4f);

        c1.status();

        System.out.println("Tenho uma caneta " + c1.getModelo());
        System.out.println("Ela tem a ponta " + c1.getPonta());*/
    }
}
