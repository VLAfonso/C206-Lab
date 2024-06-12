import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criar entrada de dados
        Scanner entrada = new Scanner(System.in);

        //Acessar o arquivo
        Arquivo arquivo = new Arquivo();

        //Criar ArrayList de Alunos
        ArrayList<Aluno> listAlunos;

        //Criar menu
        boolean flagMenu = true; //controle de menu
        int op; //opção do menu
        while(flagMenu){
            System.out.println("----------------------------------------------");
            System.out.println("Bem-vindo ao menu de gerenciamento de alunos!");
            System.out.println("1- Cadastrar um aluno;");
            System.out.println("2- Listar os alunos;");
            System.out.println("3- Ordenar os alunos em ordem crescente em relação à média;");
            System.out.println("4- Mostrar a quantidade de alunos de cada curso;");
            System.out.println("5- Sair do menu.");
            op = entrada.nextInt();
            System.out.println("----------------------------------------------");

            switch (op){
                //Cadastrar um aluno
                case(1):
                    //Ler dados do aluno
                    Aluno aluno = new Aluno();
                    System.out.println("Entre com dados do aluno:");
                    System.out.println("Nome:");
                    entrada.nextLine();
                    aluno.setNome(entrada.nextLine());
                    System.out.println("Matrícula:");
                    try {
                        aluno.setMatricula(entrada.nextInt());
                    } catch (InfoInvalidaException e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                    System.out.println("Curso (Computação, Software ou Telecomunicações):");
                    entrada.nextLine();
                    try {
                        aluno.setCurso(entrada.nextLine());
                    } catch (InfoInvalidaException e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                    System.out.println("Média:");
                    aluno.setMedia(entrada.nextFloat());

                    //Adicionar aluno ao arquivo
                    arquivo.escrever(aluno);
                    break;
                //Listar os alunos
                case(2):
                    //Ler alunos do arquivo
                    listAlunos = arquivo.ler();

                    //Mostrar informações dos alunos
                    for (int i = 0; i < listAlunos.size(); i++) {
                        System.out.println("Aluno:");
                        System.out.println("  Nome: "+ listAlunos.get(i).getNome());
                        System.out.println("  Matrícula: "+ listAlunos.get(i).getMatricula());
                        System.out.println("  Curso: "+ listAlunos.get(i).getCurso());
                        System.out.println("  Média: "+ listAlunos.get(i).getMedia()+"\n");
                    }
                    break;
                //Ordenar os alunos em ordem crescente de média
                case(3):
                    //Ler alunos do arquivo
                    listAlunos = arquivo.ler();

                    //Ordenar alunos em ordem de preço
                    Collections.sort(listAlunos);

                    //Mostrar informações dos alunos ordenados
                    for (int i = 0; i < listAlunos.size(); i++) {
                        System.out.println("Aluno:");
                        System.out.println("  Nome: "+ listAlunos.get(i).getNome());
                        System.out.println("  Matrícula: "+ listAlunos.get(i).getMatricula());
                        System.out.println("  Curso: "+ listAlunos.get(i).getCurso());
                        System.out.println("  Média: "+ listAlunos.get(i).getMedia()+"\n");
                    }
                    break;
                //Mostrar quantidade de alunos de cada curso
                case(4):
                    //Ler alunos do arquivo
                    listAlunos = arquivo.ler();

                    //Calcular quantidade de alunos de cada curso
                    int qtdComputacao=0, qtdSoftware=0, qtdTelecomunicacoes=0;
                    for (int i = 0; i < listAlunos.size(); i++) {
                        if(listAlunos.get(i).getCurso().equals("Computação")){
                            qtdComputacao++;
                        }
                        else if(listAlunos.get(i).getCurso().equals("Software")){
                            qtdSoftware++;
                        }
                        else if(listAlunos.get(i).getCurso().equals("Telecomunicações")){
                            qtdTelecomunicacoes++;
                        }
                    }
                    System.out.println("Há "+qtdComputacao+" alunos do curso Computação.");
                    System.out.println("Há "+qtdSoftware+" alunos do curso Software.");
                    System.out.println("Há "+qtdTelecomunicacoes+" alunos do curso Telecomunicações.");
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
