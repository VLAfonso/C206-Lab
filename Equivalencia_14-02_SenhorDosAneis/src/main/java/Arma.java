public class Arma {
    //Atributos da arma
    private String nomeArma;
    private boolean magica;

    //Construtor da arma
    public Arma(String nomeArma, boolean magica) {
        this.nomeArma = nomeArma;
        this.magica = magica;
    }

    //Mostrar informações da arma
    public void mostraInfo(){
        System.out.println("Informações da arma:");
        System.out.println("Nome: "+this.nomeArma);
        if(magica){
            System.out.println("É mágica");
        }
        else {
            System.out.println("Não é mágica");
        }
    }

    //Getters
    public String getNomeArma() {
        return nomeArma;
    }

    public boolean isMagica() {
        return magica;
    }
}
