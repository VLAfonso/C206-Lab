import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criar entrada de dados
        Scanner entrada = new Scanner(System.in);

        //Acessar o arquivo
        Arquivo arquivo = new Arquivo();

        //Criar ArrayList de Produtos
        ArrayList<Produto> listProdutos;

        //Criar menu
        boolean flagMenu = true; //controle de menu
        int op; //opção do menu
        while(flagMenu){
            System.out.println("----------------------------------------------");
            System.out.println("Bem-vindo ao menu da loja!");
            System.out.println("1- Cadastrar um produto;");
            System.out.println("2- Listar os produtos;");
            System.out.println("3- Ordenar os produtos em ordem decrescente em relação ao preço;");
            System.out.println("4- Mostrar quantidade de produtos de cada tipo;");
            System.out.println("5- Sair do menu.");
            op = entrada.nextInt();
            System.out.println("----------------------------------------------");

            switch (op){
                //Cadastrar um produto
                case(1):
                    //Ler dados do produto
                    Produto produto = new Produto();
                    System.out.println("Entre com dados do produto:");
                    System.out.println("Nome:");
                    entrada.nextLine();
                    produto.setNome(entrada.nextLine());
                    System.out.println("Preço:");
                    try {
                        produto.setPreco(entrada.nextDouble());
                    } catch (InfoInvalidaException e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                    System.out.println("Tipo (Comida, Higiene ou Decoração):");
                    entrada.nextLine();
                    try {
                        produto.setTipo(entrada.nextLine());
                    } catch (InfoInvalidaException e) {
                        System.out.println(e.getMessage());
                        break;
                    }

                    //Adicionar produto ao arquivo
                    arquivo.escrever(produto);
                    break;
                //Listar os produtos
                case(2):
                    //Ler produtos do arquivo
                    listProdutos = arquivo.ler();

                    //Mostrar informações dos produtos
                    for (int i = 0; i < listProdutos.size(); i++) {
                        System.out.println("Produto:");
                        System.out.println("  Nome: "+listProdutos.get(i).getNome());
                        System.out.println("  Preço: "+listProdutos.get(i).getPreco());
                        System.out.println("  Tipo: "+listProdutos.get(i).getTipo()+"\n");
                    }
                    break;
                //Ordenar os produtos em ordem decrescente de preço
                case(3):
                    //Ler produtos do arquivo
                    listProdutos = arquivo.ler();

                    //Ordenar produtos em ordem de preço
                    Collections.sort(listProdutos);

                    //Mostrar informações dos produtos ordenados
                    for (int i = 0; i < listProdutos.size(); i++) {
                        System.out.println("Produto:");
                        System.out.println("  Nome: "+listProdutos.get(i).getNome());
                        System.out.println("  Preço: "+listProdutos.get(i).getPreco());
                        System.out.println("  Tipo: "+listProdutos.get(i).getTipo()+"\n");
                    }
                    break;
                //Mostrar quantidade de produtos de cada tipo
                case(4):
                    //Ler produtos do arquivo
                    listProdutos = arquivo.ler();

                    //Calcular quantidade de produtos de cada tipo
                    int qtdComida=0, qtdHigiene=0, qtdDecoracao=0;
                    for (int i = 0; i < listProdutos.size(); i++) {
                        if(listProdutos.get(i).getTipo().equals("Comida")){
                            qtdComida++;
                        }
                        else if(listProdutos.get(i).getTipo().equals("Higiene")){
                            qtdHigiene++;
                        }
                        else if(listProdutos.get(i).getTipo().equals("Decoração")){
                            qtdDecoracao++;
                        }
                    }
                    System.out.println("Há "+qtdComida+" produtos do tipo Comida.");
                    System.out.println("Há "+qtdHigiene+" produtos do tipo Higiene.");
                    System.out.println("Há "+qtdDecoracao+" produtos do tipo Decoração.");
                    break;
                //Sair do menu
                case(5):
                    flagMenu = false;
                    System.out.println("Você saiu do menu!");
                    break;
                //Caso tenha opção inválida
                default:
                    System.out.println("Entre com uma opção válida!");
                    break;
            }
        }
    }
}
