package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variáveis primitivas
        int idade = 20;
        float peso = 50.4F;
        double altura = 1.65;

        //Variável por referência/classe
        String nome = "Letícia";

        //Casting
        double numeroDouble = 1.65;
        // float numFLoat = numeroDouble; - não funciona
        float numFLoat = (float) numeroDouble; //tem que converter - cast

        //Entrada de dados - Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Entre com seu peso: ");
        peso = entrada.nextFloat();
        entrada.nextLine(); //ler um dado depois de um número
        System.out.println("Entre com o nome da sua mãe: ");
        String nomeMae = entrada.nextLine();
    }
}