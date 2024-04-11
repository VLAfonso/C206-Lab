public class Mago extends Habitante implements Cura, Feitico{
    //Atributos de mago
    private String cor;

    //Construtor do mago
    public Mago(String nome, int idade, float energia, String cor) {
        super(nome, idade, energia);
        this.cor = cor;
    }

    //Mostrar informações
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Cor: "+this.cor);
    }

    //Implementar cura
    @Override
    public void curar() {
        this.energia *= 1.15f;
        System.out.println(this.nome+" foi curado!");
    }

    //Implementar feitiço
    @Override
    public void lancaFeitico() {
        this.energia *= 0.9f;
        System.out.println("O mago "+this.nome+" lançou um feitiço!");
    }
}
