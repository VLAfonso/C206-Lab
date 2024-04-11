public class Main {
    public static void main(String[] args) {
        //Criar anão, elfo e mago
        Anao anao = new Anao("Torin", 128, 1200, 1.53f, "Balduir");
        Elfo elfo = new Elfo("Fon", 54, 750, "Bonch");
        Mago mago = new Mago("Aelin", 19, 1000, "Azul");

        //Criar armas para elfo e mago
        Arma arma1 = new Arma("Arminha", false);
        Arma arma2 = new Arma("Armazona", true);
        elfo.arma = arma1;
        mago.arma = arma2;

        //Criar array de heróis e adicioná-los
        Habitante[] herois = new Habitante[3];

        //Criar Terra Média
        TerraMedia terraMedia = new TerraMedia(herois);

        //Adicionar heróis
        terraMedia.addHabitante(anao);
        terraMedia.addHabitante(elfo);
        terraMedia.addHabitante(mago);

        //Listar heróis
        terraMedia.listarHabitantes();
    }
}
