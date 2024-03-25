public class Motor {
    //Atributos do motor
    float velocidadeMaxima;

    //Construtor do motor
    public Motor(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //Mostrar informação do moto
    void mostraInfo(){
        System.out.println("Informações do motor:");
        System.out.println("A velocidade máxima do motor é "+this.velocidadeMaxima+"km/h.");
    }
}

