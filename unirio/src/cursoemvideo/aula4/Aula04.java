package cursoemvideo.aula4;

public class Aula04 {
    public static void main(String[] args) {
        //instanciamento da classe
        Caneta c1 = new Caneta("MILKLINER", "LARANJA", 0.8f);
        c1.status();

        Caneta c2 = new Caneta("BISMARK", "LILÁS", 0.4F);
        c2.status();

        Caneta c3 = new Caneta("SHARPIE", "FÚXIA", 1f);
        c3.status();

        /*c1.setModelo("BISMARK"); //metodo acessor
        //c1.modelo = "BIC";  //acesso direto ao atributo

        c1.setPonta(0.4f);

        c1.status();

        System.out.println("Tenho uma caneta " + c1.getModelo());
        System.out.println("Ela tem a ponta " + c1.getPonta());*/
    }
}
