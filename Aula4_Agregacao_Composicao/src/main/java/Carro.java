public class Carro {
    String nome;
    String cor;
    int ano;
    Motor motor = null;

    /* Contrutor Composição
    public Carro(java.lang.String nome, java.lang.String cor, int ano, int cv) {
        this.nome = nome;
        this.cor = cor;
        this.ano = ano;
        this.motor = new Motor(cv);
    }*/

    public Carro(java.lang.String nome, java.lang.String cor, int ano) {
        this.nome = nome;
        this.cor = cor;
        this.ano = ano;
    }
}
