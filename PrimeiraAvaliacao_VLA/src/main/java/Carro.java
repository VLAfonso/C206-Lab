public class Carro {
    //Atributos do carro
    String modelo;
    String cor;
    boolean alugado;
    Motor motor;

    //Construtor do carro
    public Carro(String modelo, String cor, boolean alugado, float velocidadeMaxima) {
        this.modelo = modelo;
        this.cor = cor;
        this.alugado = alugado;
        this.motor = new Motor(velocidadeMaxima); //composição
    }

    //Mostrar informações de cada carro
    void mostraInfo(){
        System.out.println("Informações do carro:");
        System.out.println("O modelo do carro é: "+this.modelo);
        System.out.println("A cor do carro é: "+this.cor);
        if(this.alugado){
            System.out.println("O carro está alugado!");
        }
        else {
            System.out.println("O carro não está alugado!");
        }
        this.motor.mostraInfo();
    }
}
