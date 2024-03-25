import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criar entrada de dados
        Scanner entrada = new Scanner(System.in);

        //Ler dados e criar uma locadora
        System.out.println("Entre com o nome da locadora: ");
        String nome = entrada.nextLine();
        System.out.println("Entre com o CNPJ da locadora:");
        String CNPJ = entrada.nextLine();
        System.out.println("Entre com o endereço da locadora:");
        String endereco = entrada.nextLine();
        Locadora locadora = new Locadora(nome, CNPJ, endereco);

        //Criar menu
        boolean flagMenu = true; //controle do menu
        int op; //opção do menu
        while (flagMenu){
            System.out.println("----------------------------------------------");
            System.out.println("Bem-vindo ao menu da locadora!");
            System.out.println("1- Adicionar um carro à locadora;");
            System.out.println("2- Mostrar informações da locadora e seus carros;");
            System.out.println("3- Mostrar porcentagem dos carros disponíveis para alugar;");
            System.out.println("4- Mostrar quantidade de carros de cada modelo;");
            System.out.println("5- Sair do menu.");
            op = entrada.nextInt();
            System.out.println("----------------------------------------------");

            switch (op){
                //Adicionar carro à locadora
                case(1):
                    //Ler dados do carro
                    System.out.println("Entre com o modelo do carro: (HILUX, FUSCA ou CAMARO)");
                    entrada.nextLine();
                    boolean flagModelo = true;
                    String modelo = "";
                    while (flagModelo){
                        modelo = entrada.nextLine();
                        if((modelo.equals("HILUX"))||(modelo.equals("FUSCA"))||(modelo.equals("CAMARO"))){
                            flagModelo = false;
                        }
                        else {
                            System.out.println("Entre com um modelo válido!");
                        }
                    }
                    System.out.println("Entre com a cor do carro:");
                    String cor = entrada.nextLine();
                    System.out.println("O carro está alugado? (Sim=true, Não=false)");
                    boolean alugado = entrada.nextBoolean();
                    System.out.println("Entre com a velocidade máxima do motor do carro:");
                    float velocidadeMaxima = entrada.nextFloat();
                    //Criar carro e adicionar à locadora
                    Carro carro = new Carro(modelo, cor, alugado, velocidadeMaxima);
                    locadora.adicionarCarro(carro);
                    break;
                //Mostrar informações da locador e seus carros
                case(2):
                    locadora.mostraInfo();
                    break;
                //Mostrar porcentagem dos carros disponíveis para alugar
                case(3):
                    System.out.println("A porcentagem de carros disponíveis para alugar é: "+locadora.contarCarrosParaAlugar()+"%");
                    break;
                //Mostrar quantidade de carros de cada modelo
                case(4):
                    locadora.qtdCarrosModelo();
                    break;
                //Sair do menu
                case(5):
                    flagMenu = false;
                    System.out.println("Você saiu do menu!");
                    break;
                //Opção inválida
                default:
                    System.out.println("Entre com uma opção válida!");
                    break;
            }
        }

        //Encerrar entrada de dados
        entrada.close();
    }
}
