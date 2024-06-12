import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Métodos que podemos realizar com o arquivo
    public void escrever(Aluno a) {
        // Instanciando os objetos que permitirão a escrita de dados
        OutputStream os = null; // fluxo de entrada
        OutputStreamWriter osw = null; //leitor de fluxo de entrada
        BufferedWriter bw = null; //buffer entrada

        // Variável auxiliar
        String linha;

        try {
            // Abrindo a saída de dados
            os = new FileOutputStream("src/main/java/Alunos.txt", true); // Nome do arquivo onde será salvo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            // Flag que indica onde começa as informações do Aluno
            bw.write("++ Aluno ++\n");
            bw.write(a.getNome() + "\n");
            bw.write(a.getMatricula() + "\n");
            bw.write(a.getCurso() + "\n");
            bw.write(a.getMedia() + "\n");

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

    public ArrayList<Aluno> ler() {
        // ArrayList auxiliar para salvar alunos encontrados no arquivo
        ArrayList<Aluno> encontreiNoArquivo = new ArrayList<>();

        // Classes que permitem leitura de dados do arquivo
        InputStream is = null; //fluxo saida
        InputStreamReader isr = null; //gerador de fluxo de saida
        BufferedReader br = null; // buffer de saida

        // Variável auxiliar que servirá de flag para o while
        String linhaLer;

        try {
            // Instanciando os objetos
            is = new FileInputStream("src/main/java/Alunos.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Colocando o cursor no inicio do arquivo
            linhaLer = br.readLine();

            while (linhaLer != null) {
                // Comparando se o que está em linhaLer é igual a minha flag
                if (linhaLer.contains("++ Aluno ++")) {

                    // Variável auxiliar de aluno
                    Aluno aluno = new Aluno();
                    aluno.setNome(br.readLine());
                    aluno.setMatricula(Integer.parseInt(br.readLine()));
                    aluno.setCurso(br.readLine());
                    aluno.setMedia(Float.parseFloat(br.readLine()));

                    // Adicionando o aluno no array
                    encontreiNoArquivo.add(aluno);
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
