import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criar entrada de dados
        Scanner entrada = new Scanner(System.in);

        //Acessar o Arquivo
        Arquivo arquivo = new Arquivo();

        //Criar ArrayList de Clientes
        ArrayList<Cliente> clientes = new ArrayList<>();

        //Criar menu
        boolean flagMenu = true; //controle do menu
        int op; //opção do menu
        while (flagMenu){
            System.out.println("----------------------------------------------");
            System.out.println("Bem-vindo ao menu da GatoSerra!");
            System.out.println("1- Cadastrar um cliente;");
            System.out.println("2- Listar clientes;");
            System.out.println("3- Ordenar os clientes em ordem alfabética;");
            System.out.println("4- Ordenar os clientes de Z-A;");
            System.out.println("5- Sair do menu.");
            op = entrada.nextInt();
            System.out.println("----------------------------------------------");

            switch (op){
                //Cadastrar um cliente
                case(1):
                    //Ler dados do cliente
                    System.out.println("Entre com o nome do cliente:");
                    entrada.nextLine();
                    String nome = entrada.nextLine();
                    System.out.println("Entre com o CPF do cliente:");
                    String cpf = entrada.nextLine();
                    System.out.println("Entre com o endereco do cliente:");
                    String endereco = entrada.nextLine();
                    System.out.println("Entre com a idade do cliente:");
                    int idade = entrada.nextInt();

                    //Criar cliente e adicioná-lo ao arquivo
                    Cliente cliente = new Cliente(nome, cpf, endereco, idade);
                    arquivo.escrever(cliente);
                    break;
                //Listar clientes
                case (2):
                    clientes = arquivo.ler();
                    for(int i=0; i< clientes.size(); i++){
                        System.out.println("Cliente:");
                        System.out.println("  Nome: "+clientes.get(i).getNome());
                        System.out.println("  CPF: "+clientes.get(i).getCpf());
                        System.out.println("  Endereço: "+clientes.get(i).getEndereco());
                        System.out.println("  Idade: "+clientes.get(i).getIdade());
                    }
                    break;
                //Clientes em ordem alfabética
                case (3):
                    clientes = arquivo.ler();
                    Collections.sort(clientes);
                    for(int i=0; i< clientes.size(); i++){
                        System.out.println("Cliente:");
                        System.out.println("  Nome: "+clientes.get(i).getNome());
                        System.out.println("  CPF: "+clientes.get(i).getCpf());
                        System.out.println("  Endereço: "+clientes.get(i).getEndereco());
                        System.out.println("  Idade: "+clientes.get(i).getIdade());
                    }
                    break;
                //Clientes em ordem Z-A
                case (4):
                    clientes = arquivo.ler();
                    Collections.sort(clientes);
                    Collections.reverse(clientes);
                    for(int i=0; i< clientes.size(); i++){
                        System.out.println("Cliente:");
                        System.out.println("  Nome: "+clientes.get(i).getNome());
                        System.out.println("  CPF: "+clientes.get(i).getCpf());
                        System.out.println("  Endereço: "+clientes.get(i).getEndereco());
                        System.out.println("  Idade: "+clientes.get(i).getIdade());
                    }
                    break;
                //Sair do menu
                case (5):
                    flagMenu = false;
                    System.out.println("Você saiu do menu!");
                    break;
                default:
                    System.out.println("Entre com uma opção válida!");
                    break;
            }
        }

        //Encerrar entrada de dados
        entrada.close();
    }
}
