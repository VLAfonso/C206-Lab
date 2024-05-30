import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Métodos que podemos realizar com o arquivo
    public void escrever(Cliente c) {
        // Instanciando os objetos que permitirão a escrita de dados
        OutputStream os = null; // fluxo de entrada
        OutputStreamWriter osw = null; //leitor de fluxo de entrada
        BufferedWriter bw = null; //buffer entrada

        // Variável auxiliar
        String linha;

        try {
            // Abrindo a saída de dados
            os = new FileOutputStream("src/main/java/Clientes.txt", true); // Nome do arquivo onde será salvo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            // Flag que indica onde começa as informações do Cliente
            bw.write("++ Cliente ++\n");
            bw.write(c.getNome() + "\n");
            bw.write(c.getCpf() + "\n");
            bw.write(c.getEndereco() + "\n");
            bw.write(c.getIdade() + "\n");

        } catch (Exception e) {
            System.out.println("ERRO: " + e);
        } finally {
            // Fechando a entrada de dados
            try {
                bw.close();
            } catch (Exception e) {
            }
        }
    }


    public ArrayList<Cliente> ler() {
        // ArrayList auxiliar para salvar clientes encontrados no arquivo
        ArrayList<Cliente> encontreiNoArquivo = new ArrayList<>();

        // Classes que permitem leitura de dados do arquivo
        InputStream is = null; //fluxo saida
        InputStreamReader isr = null; //gerador de fluxo de saida
        BufferedReader br = null; // buffer de saida

        // Variável auxiliar que servirá de flag para o while
        String linhaLer;

        try {
            // Instanciando os objetos
            is = new FileInputStream("src/main/java/Clientes.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Colocando o cursor no inicio do arquivo
            linhaLer = br.readLine();

            while (linhaLer != null) {
                // Comparando se o que está em linhaLer é igual a minha flag
                if (linhaLer.contains("++ Cliente ++")) {
                    // Variável auxiliar de funcionario
                    String nome = br.readLine();
                    String cpf = br.readLine();
                    String endereco = br.readLine();
                    int idade = Integer.parseInt(br.readLine());
                    Cliente cliente = new Cliente(nome, cpf, endereco, idade);

                    // Adicionando o funcionario no array
                    encontreiNoArquivo.add(cliente);
                }
                linhaLer = br.readLine();
            }
        } catch (Exception e) {
        } finally {
            try {
                br.close();
            } catch (Exception e) {

            }
        }
        return encontreiNoArquivo;
    }
}