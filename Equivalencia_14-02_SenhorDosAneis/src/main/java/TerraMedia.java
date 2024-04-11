public class TerraMedia {
    //Atributos da Terra Média
    private Habitante[] herois;

    //Construtor da Terra Média
    public TerraMedia(Habitante[] herois) {
        this.herois = herois;
    }

    //Adicionar habitantes
    public void addHabitante(Habitante habitante){
        for(int i=0; i< herois.length; i++){
            if(herois[i]==null){
                herois[i] = habitante;
                break;
            }
        }
    }

    //Listar habitantes
    public void listarHabitantes(){
        for(int i=0; i< herois.length; i++){
            if(herois[i]!=null){
                if(herois[i] instanceof Anao){
                    Anao anao = (Anao) herois[i];
                    anao.minerar();
                    anao.atacar();
                    anao.mostraInfo();
                }
                else if(herois[i] instanceof Elfo){
                    Elfo elfo = (Elfo) herois[i];
                    elfo.curar();
                    elfo.viajar();
                    elfo.atacar();
                    elfo.mostraInfo();
                }
                else if(herois[i] instanceof Mago){
                    Mago mago = (Mago) herois[i];
                    mago.curar();
                    mago.lancaFeitico();
                    mago.atacar();
                    mago.mostraInfo();
                }
                System.out.println();
            }
        }
    }
}
