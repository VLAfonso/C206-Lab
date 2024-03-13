public class Main {
    public static void main(String[] args) {
        /* Composição
        Carro c1 = new Carro("fusca", "vermelho", 2000, 80);

        System.out.println("Nome do carro: " + c1.nome);
        System.out.println("Cor do carro: " + c1.cor);
        System.out.println("Ano do carro: " + c1.ano);
        System.out.println(c1.motor.cv);
         */

        Carro c1 = new Carro("fusca", "vermelho", 2000);
        Motor m1 = new Motor(80);

        System.out.println("Nome do carro: " + c1.nome);
        System.out.println("Cor do carro: " + c1.cor);
        System.out.println("Ano do carro: " + c1.ano);
        System.out.println("Motor: "+m1.cv);

        c1.motor = m1;
        System.out.println("Motor: "+c1.motor.cv);
    }
}
