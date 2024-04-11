public abstract class Habitante {
    //Atributos do habitante
    public static int contador;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;
    Arma arma;

    public Habitante(String nome, int idade, float energia) {
        this.id = contador;
        contador++;
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;
    }

    //Atacare mostrar informações da arma
    public void atacar(){
        if(arma != null){
            if(this.arma.isMagica()){
                this.energia -= 20;
            }
            else {
                this.energia -= 10;
            }
            System.out.println(this.nome+" atacou com:");
            this.arma.mostraInfo();
        }
        else{
            System.out.println("Não é possível atacar!");
        }
    }

    //Mostrar informações do habitante
    public void mostraInfo(){
        System.out.println("Informações do Habitante:");
        System.out.println("Id: "+this.id);
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Energia: "+this.energia);
        if(arma!=null){
            arma.mostraInfo();
        }
    }
}
