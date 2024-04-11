public class Anao extends Habitante implements Mineracao{
    //Atributos do anão
    private float altura;
    private String reino;

    //Construtor do anão
    public Anao(String nome, int idade, float energia, float altura, String reino) {
        super(nome, idade, energia);
        this.altura = altura;
        this.reino = reino;
    }

    //Mostrar informações
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Altura: "+this.altura);
        System.out.println("Reino: "+this.reino);
    }

    //Implementar mineração
    @Override
    public void minerar() {
        System.out.println("Anão "+this.nome+" está minerando!");
    }
}
