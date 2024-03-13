import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[10];
        Empresa e1 = new Empresa("JFL");

        Scanner entrada = new Scanner(System.in);

        boolean flag=true;

        while(flag){
            System.out.println("-------------------------------------");
            System.out.println("Bem-vindo ao menu de informações da empresa!");
            System.out.println("1- Adicionar um produto à empresa");
            System.out.println("2- Mostrar as informações da empresa e dos produtos");
            System.out.println("3- Sair do menu");

            int op = entrada.nextInt();

            switch (op){
                case 1:
                    entrada.nextLine();
                    System.out.println("Entre com o nome do produto: ");
                    String nomeProd = entrada.nextLine();
                    System.out.println("Entre com a nota do produto: ");
                    int notaProd = entrada.nextInt();
                    System.out.println("Entre com a quantidade do produto: ");
                    int qtdProd = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Entre com o nome do fabricante do produto: ");
                    String nomeFab = entrada.nextLine();
                    System.out.println("Entre com o cnpj da empresa do produto: ");
                    int cnpjFab = entrada.nextInt();

                    Produto p1 = new Produto(nomeProd, notaProd, qtdProd, nomeFab, cnpjFab);
                    e1.adicionaProd(p1);
                    break;
                case 2:
                    e1.mostraInfo();
                    break;
                case 3:
                    flag = false;
                    break;
            }
        }

        entrada.close();
    }
}
