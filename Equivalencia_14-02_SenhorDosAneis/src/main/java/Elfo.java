public class Elfo extends Habitante implements Cura{
    //Atributos do elfo
    private String tribo;

    //Construtor do Elfo
    public Elfo(String nome, int idade, float energia, String tribo) {
        super(nome, idade, energia);
        this.tribo = tribo;
    }

    //Mostrar informações
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Tribo: "+this.tribo);
    }

    //Viajar
    public void viajar(){
        System.out.println("O elfo "+this.nome+" está viajando!");
    }

    //Implementar curar
    @Override
    public void curar() {
        this.energia *= 1.15f;
        System.out.println(this.nome+" foi curado!");
    }
}
